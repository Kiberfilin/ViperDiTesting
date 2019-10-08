package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.Feature2MainTestInteractorDataOutputPort

interface Feature2MainTestInteractorDataInputPort {

    fun subscribeOn(interactor: Feature2MainTestInteractorDataOutputPort)

    fun getTestDataForFeature2ActivityTesting()
}