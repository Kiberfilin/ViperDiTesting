package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.CheckInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.CheckInteractorPresentationOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BasePresenter
import javax.inject.Inject

class Feature1MainPresenter @Inject constructor() : BasePresenter(),
    Feature1ViperContract.MainPresenter, CheckInteractorPresentationOutputPort {
    override lateinit var view: Feature1ViperContract.MainView

    private var isTowardsRepositoryDirectionChecking = false

    @Inject
    lateinit var checkInteractor: CheckInteractorPresentationInputPort

    @Inject
    lateinit var router: Feature1ViperContract.MainRouter

    override fun onRouterPreFlightCheckingTvClick() {
        router.preFlightCheck()
    }

    override fun onInteractorTowardsRepositoryHasBeenChecked(towardsRepositoryCheckResult: String) {
        if (isTowardsRepositoryDirectionChecking) view.changeText(towardsRepositoryCheckResult)
    }

    override fun onInteractorFromRepositoryHasBeenChecked(fromRepositoryCheckResult: String) {
        if (!isTowardsRepositoryDirectionChecking) view.changeText(fromRepositoryCheckResult)
    }

    override fun onInteractorTowardsRepositoryCheckingTvClick() {
        isTowardsRepositoryDirectionChecking = true
        checkInteractor.execute()
    }

    override fun onInteractorFromRepositoryCheckingTvClick() {
        isTowardsRepositoryDirectionChecking = false
        checkInteractor.execute()
    }

    override fun onPresenterCheckingTvClick() {
        view.changeText("Presenter checked OK!!!")
    }

    override fun onViewCreated(view: Feature1ViperContract.MainView) {
        this.view = view
        checkInteractor.subscribeOn(this)
    }

}