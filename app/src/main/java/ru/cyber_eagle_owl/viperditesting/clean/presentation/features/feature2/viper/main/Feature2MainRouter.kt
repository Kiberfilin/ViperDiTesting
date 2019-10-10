package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.main

import android.content.Intent
import android.util.Log
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.Feature1Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.Feature2Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment1
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperMainContract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseRouter
import javax.inject.Inject

class Feature2MainRouter @Inject constructor() : BaseRouter(),
    Feature2ViperMainContract.MainRouter {

    @Inject
    override lateinit var activity: Feature2Activity

    override fun setFragment1() {
        Log.d("TAG", "setFragment1()")
        val tag = "Fragment1"
        activity.supportFragmentManager?.apply {
            if (findFragmentByTag(tag) == null) {
                Log.d(
                    "TAG",
                    "findFragmentByTag(tag) == null is ${(findFragmentByTag(tag) == null)}"
                )
                val fragment1 = Feature2Fragment1.newInstance()
                beginTransaction().add(R.id.feature2FragmentContainer, fragment1, tag).commit()
            }
        }
    }

    override fun routeToFeature1Activity() {
        Log.d("TAG", "routeToFeature1Activity()")
        Intent(activity, Feature1Activity::class.java)
            .apply {
                //to set some flags here, like it:
                //flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            }
            .also { activity.startActivity(it) }
    }
}