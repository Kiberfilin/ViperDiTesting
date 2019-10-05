package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports

interface CheckInteractorDataOutputPort {

    fun onDataForInteractorTestingHasGotten(fromRepositoryCheckResult: String)
}