package ru.cyber_eagle_owl.viperditesting.clean.data.repositories

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.CheckInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.Feature2MainTestInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.CheckInteractorDataOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.Feature2MainTestInteractorDataOutputPort
import javax.inject.Inject

class CheckingRepository @Inject constructor() : CheckInteractorDataInputPort,
    Feature2MainTestInteractorDataInputPort {

    private lateinit var feature2MainTestInteractor: Feature2MainTestInteractorDataOutputPort
    private lateinit var checkInteractor: CheckInteractorDataOutputPort

    override fun getTestDataForFeature2ActivityTesting() {
        feature2MainTestInteractor.onTestingDataHasBeenGotten("Talibi obstrel'yali NLO")
    }

    override fun getDataForInteractorTesting() {
        checkInteractor.onDataForInteractorTestingHasGotten("From Repository Check - OK!!!")
    }

    override fun subscribeOn(interactor: Feature2MainTestInteractorDataOutputPort) {
        feature2MainTestInteractor = interactor
    }

    override fun subscribeOn(interactor: CheckInteractorDataOutputPort) {
        checkInteractor = interactor
    }
}