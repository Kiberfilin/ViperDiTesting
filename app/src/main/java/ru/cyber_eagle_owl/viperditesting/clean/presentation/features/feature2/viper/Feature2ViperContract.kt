package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper

import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.Feature2Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment1
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment2
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperPresenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperRouter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.ViperView

interface Feature2ViperMainContract {

    interface MainView : ViperView<MainPresenter> {

        fun onFinishInflate()

        fun showToast(text: String)

        fun feature2BackPressed()

        fun setInitialViewsVisibility()

        fun setViewsVisibilityForFragment2()

        fun showDataFromSharedPref(dataFromSharedPref: String)
    }

    interface MainPresenter : ViperPresenter {

        var view: MainView

        fun onViewCreated(view: MainView)

        fun onFeature2BackPressed()

        fun onButtonSaveClicked(textToSave: String)

        fun onButtonShowClicked()
    }

    interface MainRouter : ViperRouter {

        val activity: Feature2Activity

        fun routeToFeature1Activity()

        fun setFragment1()

        fun transferDataToFragment1(data: String)
    }
}

interface Feature2ViperFragment1Contract {

    interface Fragment1View : ViperView<Fragment1Presenter> {

        fun onFinishInflate()

        fun onDataTransferFromFeature2Activity(data: String)

        fun setHeaderText(text: String)
    }

    interface Fragment1Presenter : ViperPresenter {

        var view: Fragment1View

        fun onViewCreated(view: Fragment1View)

        fun onDataTransferFromFeature2Activity(data: String)

        fun onToFragment2BtnClicked()
    }

    interface Fragment1Router : ViperRouter {

        val fragment: Feature2Fragment1

        fun routeToFragment2()
    }
}

interface Feature2ViperFragment2Contract {

    interface Fragment2View : ViperView<Fragment2Presenter> {

        fun onFinishInflate()

        fun setHeaderText(text: String)
    }

    interface Fragment2Presenter : ViperPresenter {

        var view: Fragment2View

        fun onViewCreated(view: Fragment2View)

        fun onToFragment1BtnClicked()

        fun onFragment2SaveBtnClicked()

        fun onFragment2ShowBtnClicked()

        fun onFragment2TransferDataToFragment1BtnClicked()
    }

    interface Fragment2Router : ViperRouter {

        val fragment: Feature2Fragment2

        fun routeToFragment1()
    }
}