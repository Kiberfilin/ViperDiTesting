package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports

interface SaveToSharedPrefInteractorPresentationInputPort {

    fun execute(key: String, data: String)
}