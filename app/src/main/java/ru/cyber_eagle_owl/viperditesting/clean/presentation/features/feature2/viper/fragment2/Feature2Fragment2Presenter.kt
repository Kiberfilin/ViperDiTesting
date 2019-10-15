package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment2

import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment2Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BasePresenter
import javax.inject.Inject

class Feature2Fragment2Presenter @Inject constructor() : BasePresenter(),
    Feature2ViperFragment2Contract.Fragment2Presenter {

    override lateinit var view: Feature2ViperFragment2Contract.Fragment2View

    @Inject
    lateinit var router: Feature2ViperFragment2Contract.Fragment2Router

    override fun onToFragment1BtnClicked() {
        router.routeToFragment1()
    }

    override fun onFragment2SaveBtnClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragment2ShowBtnClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragment2TransferDataToFragment1BtnClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onViewCreated(view: Feature2ViperFragment2Contract.Fragment2View) {
        this.view = view
    }
}