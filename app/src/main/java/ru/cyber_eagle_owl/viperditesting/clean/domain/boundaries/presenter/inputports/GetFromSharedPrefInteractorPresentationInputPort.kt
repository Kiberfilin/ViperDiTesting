package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.GetFromSharedPrefInteractorPresentationOutputPort

interface GetFromSharedPrefInteractorPresentationInputPort {

    fun subscribeOn(presenter: GetFromSharedPrefInteractorPresentationOutputPort)

    fun execute(key: String)
}