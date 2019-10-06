package ru.cyber_eagle_owl.viperditesting.clean.domain.interactors

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.CheckInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.CheckInteractorPresentationOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.CheckInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.CheckInteractorDataOutputPort
import javax.inject.Inject

class CheckInteractor @Inject constructor() : CheckInteractorPresentationInputPort,
    CheckInteractorDataOutputPort {

    @Inject
    lateinit var repository: CheckInteractorDataInputPort
    private lateinit var presenter: CheckInteractorPresentationOutputPort
    private var tmpTowardsRepositoryChecking = ""

    override fun onDataForInteractorTestingHasGotten(fromRepositoryCheckResult: String) {
        presenter.onInteractorTowardsRepositoryHasBeenChecked(tmpTowardsRepositoryChecking)
        presenter.onInteractorFromRepositoryHasBeenChecked(fromRepositoryCheckResult)
    }

    override fun subscribeOn(presenter: CheckInteractorPresentationOutputPort) {
        this.presenter = presenter
        repository.subscribeOn(this)
    }

    override fun execute() {
        tmpTowardsRepositoryChecking = "TowardsRepositoryChecking - OK!!!"
        repository.getDataForInteractorTesting()
    }
}