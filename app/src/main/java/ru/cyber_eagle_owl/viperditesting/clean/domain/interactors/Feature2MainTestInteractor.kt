package ru.cyber_eagle_owl.viperditesting.clean.domain.interactors

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.Feature2MainTestInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.Feature2MainTestInteractorPresentationOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.Feature2MainTestInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.Feature2MainTestInteractorDataOutputPort
import javax.inject.Inject

class Feature2MainTestInteractor @Inject constructor() :
    Feature2MainTestInteractorPresentationInputPort,
    Feature2MainTestInteractorDataOutputPort {

    @Inject
    lateinit var repository: Feature2MainTestInteractorDataInputPort

    private lateinit var presenter: Feature2MainTestInteractorPresentationOutputPort

    override fun onTestingDataHasBeenGotten(testingData: String) {
        presenter.onTestingDataHasBeenGotten(testingData)
    }

    override fun subscribeOn(presenter: Feature2MainTestInteractorPresentationOutputPort) {
        this.presenter = presenter
        repository.subscribeOn(this)
    }

    override fun execute() {
        repository.getTestDataForFeature2ActivityTesting()
    }
}