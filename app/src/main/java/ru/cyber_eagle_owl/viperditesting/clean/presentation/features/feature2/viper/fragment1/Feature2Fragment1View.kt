package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment1

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseView
import javax.inject.Inject

class Feature2Fragment1View @Inject constructor() :
    BaseView<Feature2ViperFragment1Contract.Fragment1Presenter>(),
    Feature2ViperFragment1Contract.Fragment1View {

    private lateinit var toFragment2Btn: Button
    private lateinit var header: TextView

    override fun onFinishInflate() {
        Log.d("TAG", "onFinishInflate()")
        initViews()
        setOnClickListeners()
        presenter.onViewCreated(this)
    }

    private fun initViews() {
        toFragment2Btn = viperRootView.findViewById(R.id.toFragment2Btn)
        header = viperRootView.findViewById(R.id.fragment1Header)
    }

    private fun setOnClickListeners() {
        toFragment2Btn.setOnClickListener { presenter.onToFragment2BtnClicked() }
    }

    override fun setHeaderText(text: String) {
        header.text = text
    }

    override fun onDataTransferFromFeature2Activity(data: String) {
        presenter.onDataTransferFromFeature2Activity(data)
    }

    override fun setRootView(rootView: View) {
        this.viperRootView = rootView
    }
}