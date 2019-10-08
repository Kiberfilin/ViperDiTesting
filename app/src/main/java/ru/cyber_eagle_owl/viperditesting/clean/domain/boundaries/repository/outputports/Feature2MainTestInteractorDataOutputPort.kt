package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports

interface Feature2MainTestInteractorDataOutputPort {

    fun onTestingDataHasBeenGotten(testingData: String)
}