package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.main

import android.content.Intent
import android.util.Log
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.Feature1Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1ViperContract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.Feature2Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseRouter
import javax.inject.Inject

class Feature1MainRouter @Inject constructor() : BaseRouter(),
    Feature1ViperContract.MainRouter {

    @Inject
    override lateinit var activity: Feature1Activity

    override fun preFlightCheck() {
        Log.d("TAG", "preFlightCheck()")
        activity.showToast("Router pre flight check OK!!!")
    }

    override fun routeToFeature2Activity() {
        Intent(activity, Feature2Activity::class.java)
            .apply {
                //to set some flags here, like it:
                //flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            .also { activity.startActivity(it) }
    }
}