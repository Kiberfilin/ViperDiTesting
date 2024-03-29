package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment1

import android.util.Log
import kotlinx.android.synthetic.main.activity_feature_2.view.*
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.Feature2Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment1
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment2
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseRouter
import javax.inject.Inject

class Feature2Fragment1Router @Inject constructor() : BaseRouter(),
    Feature2ViperFragment1Contract.Fragment1Router {

    @Inject
    override lateinit var fragment: Feature2Fragment1

    private val tag = "Fragment2"

    override fun routeToFragment2() {
        Log.d("TAG", "fun routeToFragment2()")
        fragment.activity?.apply {
            supportFragmentManager?.beginTransaction()
                ?.replace(R.id.feature2FragmentContainer, Feature2Fragment2.newInstance(), tag)
                ?.commit()
            if (this is Feature2Activity) this.mainView.setViewsVisibilityForFragment2()
        }
    }
}