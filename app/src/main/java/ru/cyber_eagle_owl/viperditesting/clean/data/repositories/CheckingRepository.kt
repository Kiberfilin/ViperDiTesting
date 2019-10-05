package ru.cyber_eagle_owl.viperditesting.clean.data.repositories

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.CheckInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.CheckInteractorDataOutputPort
import javax.inject.Inject

class CheckingRepository @Inject constructor() : CheckInteractorDataInputPort{

    private lateinit var interactor: CheckInteractorDataOutputPort

    override fun subscribeOn(interactor: CheckInteractorDataOutputPort) {
        this.interactor = interactor
    }

    override fun getDataForInteractorTesting() {
        interactor.onDataForInteractorTestingHasGotten("From Repository Check - OK!!!")
    }
}