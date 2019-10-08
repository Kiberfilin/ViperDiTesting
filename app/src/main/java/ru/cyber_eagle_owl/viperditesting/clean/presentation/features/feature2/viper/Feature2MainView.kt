package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper

import android.util.Log
import android.widget.Toast
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseView
import javax.inject.Inject

class Feature2MainView @Inject constructor() : BaseView<Feature2ViperMainContract.MainPresenter>(),
    Feature2ViperMainContract.MainView {

    private var currentToast: Toast? = null

    override fun onFinishInflate() {
        Log.d("TAG", "onFinishInflate()")
        initViews()
        setOnClickListeners()
        presenter.onViewCreated(this)
    }

    private fun initViews() {
        Log.d("TAG", "initViews()")

    }

    private fun setOnClickListeners() {
        Log.d("TAG", "setOnClickListeners()")

    }

    override fun feature2BackPressed() {
        presenter.onFeature2BackPressed()
    }

    override fun showToast(text: String) {
        Log.d("TAG", "showToast")

        currentToast?.let {
            currentToast!!.cancel()
        }

        currentToast = Toast.makeText(viperRootView.context, text, Toast.LENGTH_LONG)
        currentToast!!.show()
    }
}