package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1

import android.os.Bundle
import android.view.LayoutInflater
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.base.BaseActivity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1ViperContract
import timber.log.Timber
import javax.inject.Inject

class Feature1Activity : BaseActivity() {

    @Inject
    lateinit var mainView: Feature1ViperContract.MainView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("onCreate(savedInstanceState: Bundle?)")

        val rootView = LayoutInflater.from(this).inflate(R.layout.activity_feature_1,null)
        setContentView(rootView)

        mainView.apply {
            setRootView(rootView)
            onFinishInflate()
        }
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("onRestart()")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume()")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("onPause()")
    }

    override fun onStop() {
        Timber.d("onStop()")
        super.onStop()
    }

    override fun onDestroy() {
        Timber.d("onDestroy()")
        super.onDestroy()
    }
}
