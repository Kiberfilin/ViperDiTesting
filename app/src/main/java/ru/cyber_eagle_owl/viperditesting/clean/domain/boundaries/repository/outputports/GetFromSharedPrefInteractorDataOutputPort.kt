package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports

interface GetFromSharedPrefInteractorDataOutputPort {

    fun onDataFromSharedPrefHasGotten(dataFromSharedPref: String)
}