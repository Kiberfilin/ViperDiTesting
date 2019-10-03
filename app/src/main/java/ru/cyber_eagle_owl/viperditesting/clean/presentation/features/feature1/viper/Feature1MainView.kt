package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper

import android.util.Log
import android.widget.TextView
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseView
import timber.log.Timber
import javax.inject.Inject

class Feature1MainView @Inject constructor() : BaseView(), Feature1ViperContract.MainView {

    private lateinit var helloTv: TextView

    override fun onFinishInflate() {
        Timber.d("onFinishInflate()")
        initViews()
        setOnClickListeners()
    }

    private fun initViews() {
        Timber.d("initViews()")
        helloTv = viperRootView.findViewById(R.id.helloTv)
    }

    private fun setOnClickListeners() {
        helloTv.setOnClickListener { changeText("Талибы обстреляли НЛО") }
    }

    override fun changeText(newText: String) {
        Timber.d("changeText($newText)")
        Log.d("TAG", "changeText($newText)")
        helloTv.text = newText
    }
}