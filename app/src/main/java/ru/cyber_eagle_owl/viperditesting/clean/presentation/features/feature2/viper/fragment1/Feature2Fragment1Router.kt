package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment1

import android.util.Log
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment1
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseRouter
import javax.inject.Inject

class Feature2Fragment1Router @Inject constructor() : BaseRouter(),
    Feature2ViperFragment1Contract.Fragment1Router {

    @Inject
    override lateinit var fragment: Feature2Fragment1

    override fun routeToFragment2() {
        Log.d("TAG", "fun routeToFragment2()")
        //todo fragment.activity?.supportFragmentManager...
    }
}