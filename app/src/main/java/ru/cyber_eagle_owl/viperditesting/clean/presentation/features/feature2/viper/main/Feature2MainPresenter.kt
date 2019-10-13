package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.main

import android.util.Log
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.Feature2MainTestInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.GetFromSharedPrefInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.SaveToSharedPrefInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.Feature2MainTestInteractorPresentationOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.GetFromSharedPrefInteractorPresentationOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperMainContract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BasePresenter
import javax.inject.Inject

class Feature2MainPresenter @Inject constructor() : BasePresenter(),
    Feature2ViperMainContract.MainPresenter, Feature2MainTestInteractorPresentationOutputPort,
    GetFromSharedPrefInteractorPresentationOutputPort {

    override lateinit var view: Feature2ViperMainContract.MainView

    @Inject
    lateinit var feature2MainTestInteractor: Feature2MainTestInteractorPresentationInputPort

    @Inject
    lateinit var saveToSharedPrefInteractor: SaveToSharedPrefInteractorPresentationInputPort

    @Inject
    lateinit var showFromSharedPrefInteractor: GetFromSharedPrefInteractorPresentationInputPort

    @Inject
    lateinit var router: Feature2ViperMainContract.MainRouter

    override fun onDataFromSharedPrefHasBeenGotten(dataFromSharedPref: String) {
        view.showDataFromSharedPref(dataFromSharedPref)
        router.transferDataToFragment1(dataFromSharedPref)
    }

    override fun onButtonSaveClicked(textToSave: String) {
        Log.d("TAG", "Presenter -> onButtonSaveClicked($textToSave)")
        saveToSharedPrefInteractor.execute("Feature2Testing", textToSave)
    }

    override fun onButtonShowClicked() {
        showFromSharedPrefInteractor.execute("Feature2Testing")
    }

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
        showFromSharedPrefInteractor.subscribeOn(this)
        checkFeature2Activity()
        router.setFragment1()
    }

}