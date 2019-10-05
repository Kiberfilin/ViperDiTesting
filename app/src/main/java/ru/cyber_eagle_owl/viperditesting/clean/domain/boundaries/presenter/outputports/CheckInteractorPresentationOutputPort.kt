package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports

interface CheckInteractorPresentationOutputPort {

    fun onInteractorTowardsRepositoryHasBeenChecked(towardsRepositoryCheckResult: String)

    fun onInteractorFromRepositoryHasBeenChecked(fromRepositoryCheckResult: String)
}