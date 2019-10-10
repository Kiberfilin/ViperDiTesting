package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.main

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperMainContract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseView
import javax.inject.Inject

class Feature2MainView @Inject constructor() : BaseView<Feature2ViperMainContract.MainPresenter>(),
    Feature2ViperMainContract.MainView {

    private var currentToast: Toast? = null

    private lateinit var btnSave: Button
    private lateinit var btnShow: Button
    private lateinit var saveEditText: EditText
    private lateinit var showTv: TextView

    override fun onFinishInflate() {
        Log.d("TAG", "onFinishInflate()")
        initViews()
        setOnClickListeners()
        presenter.onViewCreated(this)
    }

    private fun initViews() {
        Log.d("TAG", "initViews()")
        btnSave = viperRootView.findViewById(R.id.buttonSave)
        btnShow = viperRootView.findViewById(R.id.buttonShow)
        saveEditText = viperRootView.findViewById(R.id.feature2SaveEditText)
        showTv = viperRootView.findViewById(R.id.feature2ShowTv)
    }

    override fun showDataFromSharedPref(dataFromSharedPref: String) {
        showTv.visibility = View.VISIBLE
        showTv.text = dataFromSharedPref
    }
    override fun setInitialViewsVisibility() {
        btnSave.visibility = View.VISIBLE
        btnShow.visibility = View.VISIBLE
        saveEditText.visibility = View.VISIBLE
        showTv.visibility = View.GONE
    }

    private fun setOnClickListeners() {
        Log.d("TAG", "setOnClickListeners()")
        btnSave.setOnClickListener { presenter.onButtonSaveClicked(saveEditText.text.toString()) }
        btnShow.setOnClickListener { presenter.onButtonShowClicked() }
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