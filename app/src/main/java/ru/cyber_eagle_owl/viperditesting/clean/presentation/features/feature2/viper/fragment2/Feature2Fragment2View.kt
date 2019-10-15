package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment2

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment2Contract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseView
import javax.inject.Inject

class Feature2Fragment2View @Inject constructor() :
    BaseView<Feature2ViperFragment2Contract.Fragment2Presenter>(),
    Feature2ViperFragment2Contract.Fragment2View {

    private lateinit var header: TextView
    private lateinit var toFragment1Btn: Button
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var saveBtn: Button
    private lateinit var showBtn: Button
    private lateinit var transferDataToFragment1Btn: Button

    override fun onFinishInflate() {
        Log.d("TAG", "onFinishInflate()")
        initViews()
        setOnClickListeners()
        presenter.onViewCreated(this)
    }

    private fun initViews() {
        header = viperRootView.findViewById(R.id.fragment2Header)
        toFragment1Btn = viperRootView.findViewById(R.id.toFragment1Btn)
        editText1 = viperRootView.findViewById(R.id.fragment2editText1)
        editText2 = viperRootView.findViewById(R.id.fragment2editText2)
        saveBtn = viperRootView.findViewById(R.id.fragment2SaveBtn)
        showBtn = viperRootView.findViewById(R.id.fragment2ShowBtn)
        transferDataToFragment1Btn =
            viperRootView.findViewById(R.id.fragment2TransferDataToFragment1Btn)
    }

    private fun setOnClickListeners() {
        toFragment1Btn.setOnClickListener { presenter.onToFragment1BtnClicked() }
    }

    override fun setHeaderText(text: String) {
        header.text = text
    }

    override fun setRootView(rootView: View) {
        this.viperRootView = rootView
    }
}