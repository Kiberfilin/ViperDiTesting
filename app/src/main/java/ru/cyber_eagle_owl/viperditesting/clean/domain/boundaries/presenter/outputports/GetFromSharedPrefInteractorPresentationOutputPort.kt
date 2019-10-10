package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports

interface GetFromSharedPrefInteractorPresentationOutputPort {

    fun onDataFromSharedPrefHasBeenGotten(dataFromSharedPref: String)
}