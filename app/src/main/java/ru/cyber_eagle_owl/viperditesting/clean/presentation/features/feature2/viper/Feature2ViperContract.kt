package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper

import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.Feature2Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperPresenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperRouter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperView

interface Feature2ViperMainContract {

    interface MainView : ViperView<MainPresenter> {

        fun onFinishInflate()

        fun showToast(text: String)

        fun feature2BackPressed()
    }

    interface MainPresenter : ViperPresenter {

        var view: MainView

        fun onViewCreated(view: MainView)

        fun onFeature2BackPressed()
    }

    interface MainRouter : ViperRouter {

        val activity: Feature2Activity

        fun routeToFeature1Activity()

        fun setFragment1()
    }
}

interface Feature2ViperFragment1Contract {

    interface Fragment1View : ViperView<Fragment1Presenter> {

        fun onFinishInflate()
    }

    interface Fragment1Presenter : ViperPresenter {

        var view: Fragment1View

        fun onViewCreated(view: Fragment1View)
    }

    interface Fragment1Router : ViperRouter {

        val activity: Feature2Activity
    }
}

interface Feature2ViperFragment2Contract {

    interface Fragment2View : ViperView<Fragment2Presenter> {

        fun onFinishInflate()
    }

    interface Fragment2Presenter : ViperPresenter {

        var view: Fragment2View

        fun onViewCreated(view: Fragment2View)
    }

    interface Fragment2Router : ViperRouter {

        val activity: Feature2Activity
    }
}