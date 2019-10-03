package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper

import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperPresenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperRouter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperView

interface Feature1ViperContract {

    interface MainView : ViperView {

        fun onFinishInflate()

        fun changeText(newText: String)
    }

    interface MainPresenter : ViperPresenter<MainView> {

        fun onViewCreated()
    }

    interface MainRouter : ViperRouter {

    }
}