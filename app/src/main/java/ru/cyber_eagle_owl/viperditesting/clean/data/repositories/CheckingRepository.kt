package ru.cyber_eagle_owl.viperditesting.clean.data.repositories

import android.util.Log
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.CheckInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.Feature2MainTestInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.GetFromSharedPrefInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.SaveToSharedPrefInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.CheckInteractorDataOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.Feature2MainTestInteractorDataOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.GetFromSharedPrefInteractorDataOutputPort
import ru.cyber_eagle_owl.viperditesting.utils.ResourcesHelper
import ru.cyber_eagle_owl.viperditesting.utils.SharedPreferencesHelper
import javax.inject.Inject

class CheckingRepository @Inject constructor() : CheckInteractorDataInputPort,
    Feature2MainTestInteractorDataInputPort, SaveToSharedPrefInteractorDataInputPort,
    GetFromSharedPrefInteractorDataInputPort {

    @Inject
    lateinit var sharedPreferencesHelper: SharedPreferencesHelper
    @Inject
    lateinit var resourcesHelper: ResourcesHelper

    private lateinit var feature2MainTestInteractor: Feature2MainTestInteractorDataOutputPort
    private lateinit var checkInteractor: CheckInteractorDataOutputPort
    private lateinit var getFromSharedPrefInteractor: GetFromSharedPrefInteractorDataOutputPort

    override fun getDatafromSharedPref(key: String) {
        Log.d("TAG", "Repository -> getDatafromSharedPref(key: $key)")
        getFromSharedPrefInteractor.onDataFromSharedPrefHasGotten(
            sharedPreferencesHelper.getStringData(
                key
            )
        )
    }

    override fun saveDataToSharedPref(key: String, data: String) {
        Log.d("TAG", "Repository -> saveDataToSharedPref(key: $key, data: $data)")
        sharedPreferencesHelper.saveStringData(key, data)
    }

    override fun getTestDataForFeature2ActivityTesting() {
        feature2MainTestInteractor.onTestingDataHasBeenGotten("Talibi obstrel'yali NLO")
    }

    override fun getDataForInteractorTesting() {
        checkInteractor.onDataForInteractorTestingHasGotten("From Repository Check - OK!!!")
    }

    override fun subscribeOn(interactor: GetFromSharedPrefInteractorDataOutputPort) {
        getFromSharedPrefInteractor = interactor
    }

    override fun subscribeOn(interactor: Feature2MainTestInteractorDataOutputPort) {
        feature2MainTestInteractor = interactor
    }

    override fun subscribeOn(interactor: CheckInteractorDataOutputPort) {
        checkInteractor = interactor
    }
}