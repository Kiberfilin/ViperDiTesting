package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment2

import android.util.Log
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.Feature2Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment1
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment2
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment2Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseRouter
import javax.inject.Inject

class Feature2Fragment2Router @Inject constructor() : BaseRouter(),
    Feature2ViperFragment2Contract.Fragment2Router {

    @Inject
    override lateinit var fragment: Feature2Fragment2

    private val tag = "Fragment1"

    override fun routeToFragment1() {
        Log.d("TAG", "fun routeToFragment1()")
        fragment.activity?.apply {
            supportFragmentManager?.beginTransaction()
                ?.replace(R.id.feature2FragmentContainer, Feature2Fragment1.newInstance(), tag)
                ?.commit()
            if (this is Feature2Activity) this.mainView.setInitialViewsVisibility()
        }
    }
}