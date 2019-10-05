package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.CheckInteractorDataOutputPort

interface CheckInteractorDataInputPort {

    fun subscribeOn(interactor: CheckInteractorDataOutputPort)

    fun getDataForInteractorTesting()
}