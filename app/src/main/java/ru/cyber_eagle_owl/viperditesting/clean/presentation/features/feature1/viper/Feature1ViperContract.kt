package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper

import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.Feature1Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperPresenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperRouter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperView

interface Feature1ViperContract {

    interface MainView : ViperView<MainPresenter> {

        fun onFinishInflate()

        fun changeText(newText: String)
    }

    interface MainPresenter : ViperPresenter {

        var view: MainView

        fun onViewCreated(view: MainView)

        fun onPresenterCheckingTvClick()

        fun onInteractorTowardsRepositoryCheckingTvClick()

        fun onInteractorFromRepositoryCheckingTvClick()

        fun onRouterPreFlightCheckingTvClick()
    }

    interface MainRouter : ViperRouter {

        val activity: Feature1Activity

        fun preFlightCheck()
    }
}