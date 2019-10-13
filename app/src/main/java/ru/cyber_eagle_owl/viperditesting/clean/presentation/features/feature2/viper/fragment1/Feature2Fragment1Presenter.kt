package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment1

import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BasePresenter
import javax.inject.Inject

class Feature2Fragment1Presenter @Inject constructor() : BasePresenter(),
    Feature2ViperFragment1Contract.Fragment1Presenter {

    override lateinit var view: Feature2ViperFragment1Contract.Fragment1View

    @Inject
    lateinit var router: Feature2ViperFragment1Contract.Fragment1Router

    override fun onViewCreated(view: Feature2ViperFragment1Contract.Fragment1View) {
        this.view = view
    }

    override fun onDataTransferFromFeature2Activity(data: String) {
        view.setHeaderText(data)
    }

    override fun onToFragment2BtnClicked() {
        router.routeToFragment2()
    }
}