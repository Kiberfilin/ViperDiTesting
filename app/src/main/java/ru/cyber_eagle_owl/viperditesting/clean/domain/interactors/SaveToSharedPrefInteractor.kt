package ru.cyber_eagle_owl.viperditesting.clean.domain.interactors

import android.util.Log
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.SaveToSharedPrefInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.SaveToSharedPrefInteractorDataInputPort
import javax.inject.Inject

class SaveToSharedPrefInteractor @Inject constructor() :
    SaveToSharedPrefInteractorPresentationInputPort {

    @Inject
    lateinit var repository: SaveToSharedPrefInteractorDataInputPort

    override fun execute(key: String, data: String) {
        Log.d("TAG", "Interactor -> execute(key: $key, data: $data)")
        repository.saveDataToSharedPref(key, data)
    }
}