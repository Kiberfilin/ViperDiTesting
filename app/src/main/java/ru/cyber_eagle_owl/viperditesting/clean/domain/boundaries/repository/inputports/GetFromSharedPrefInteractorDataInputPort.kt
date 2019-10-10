package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.GetFromSharedPrefInteractorDataOutputPort

interface GetFromSharedPrefInteractorDataInputPort {

    fun subscribeOn(interactor: GetFromSharedPrefInteractorDataOutputPort)

    fun getDatafromSharedPref(key: String)
}