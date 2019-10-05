package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.CheckInteractorPresentationOutputPort

interface CheckInteractorPresentationInputPort {

    fun subscribeOn(presenter: CheckInteractorPresentationOutputPort)

    fun execute()
}