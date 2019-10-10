package ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports

interface SaveToSharedPrefInteractorDataInputPort {

    fun saveDataToSharedPref(key: String, data: String)
}