package ru.cyber_eagle_owl.viperditesting.clean.domain.interactors

import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.CheckInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.GetFromSharedPrefInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.CheckInteractorPresentationOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.outputports.GetFromSharedPrefInteractorPresentationOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.CheckInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.GetFromSharedPrefInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.CheckInteractorDataOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.GetFromSharedPrefInteractorDataOutputPort
import javax.inject.Inject

class GetFromSharedPrefInteractor @Inject constructor() : GetFromSharedPrefInteractorPresentationInputPort,
    GetFromSharedPrefInteractorDataOutputPort {

    @Inject
    lateinit var repository: GetFromSharedPrefInteractorDataInputPort
    private lateinit var presenter: GetFromSharedPrefInteractorPresentationOutputPort

    override fun subscribeOn(presenter: GetFromSharedPrefInteractorPresentationOutputPort) {
        this.presenter = presenter
        repository.subscribeOn(this)
    }

    override fun onDataFromSharedPrefHasGotten(dataFromSharedPref: String) {
        presenter.onDataFromSharedPrefHasBeenGotten(dataFromSharedPref)
    }

    override fun execute(key: String) {
        repository.getDatafromSharedPref(key)
    }
}