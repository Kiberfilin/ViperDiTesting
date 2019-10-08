package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper

import android.util.Log
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.Feature2MainTestInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.Feature2MainTestInteractorPresentationOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BasePresenter
import javax.inject.Inject

class Feature2MainPresenter @Inject constructor() : BasePresenter(),
    Feature2ViperMainContract.MainPresenter, Feature2MainTestInteractorPresentationOutputPort {

    override lateinit var view: Feature2ViperMainContract.MainView

    @Inject
    lateinit var feature2MainTestInteractor: Feature2MainTestInteractorPresentationInputPort

    @Inject
    lateinit var router: Feature2ViperMainContract.MainRouter

    override fun onFeature2BackPressed() {
        Log.d("TAG", "onFeature2BackPressed()")
        router.routeToFeature1Activity()
    }

    private fun checkFeature2Activity() {
        feature2MainTestInteractor.execute()
    }

    override fun onTestingDataHasBeenGotten(testingData: String) {
        view.showToast(testingData)
    }
    override fun onViewCreated(view: Feature2ViperMainContract.MainView) {
        this.view = view
        feature2MainTestInteractor.subscribeOn(this)
        checkFeature2Activity()
    }

}