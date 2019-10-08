package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.Feature2MainTestInteractorPresentationOutputPort

interface Feature2MainTestInteractorPresentationInputPort {

    fun subscribeOn(presenter: Feature2MainTestInteractorPresentationOutputPort)

    fun execute()
}