package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.base.BaseActivity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1ViperContract
import javax.inject.Inject

class Feature1Activity : BaseActivity() {

    private var currentToast: Toast? = null

    @Inject
    lateinit var mainView: Feature1ViperContract.MainView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG", "onCreate(savedInstanceState: Bundle?)")

        val rootView = LayoutInflater.from(this).inflate(R.layout.activity_feature_1, null)
        setContentView(rootView)

        mainView.apply {
            setRootView(rootView)
            onFinishInflate()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onRestart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause()")
    }

    override fun onStop() {
        Log.d("TAG", "onStop()")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("TAG", "onDestroy()")
        super.onDestroy()
    }

    fun showToast(toastText: String) {
        Log.d("TAG", "showToast")

        currentToast?.let {
            currentToast!!.cancel()
        }

        currentToast = Toast.makeText(this, toastText, Toast.LENGTH_LONG)
        currentToast!!.show()
    }
}
