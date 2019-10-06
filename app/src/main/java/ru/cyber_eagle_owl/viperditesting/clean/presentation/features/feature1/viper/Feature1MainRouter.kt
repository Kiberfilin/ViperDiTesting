package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper

import android.util.Log
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.Feature1Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseRouter
import javax.inject.Inject

class Feature1MainRouter @Inject constructor() : BaseRouter(), Feature1ViperContract.MainRouter {

    @Inject
    override lateinit var activity: Feature1Activity

    override fun preFlightCheck() {
        Log.d("TAG", "preFlightCheck()")
        activity.showToast("Router pre flight check OK!!!")
    }
}