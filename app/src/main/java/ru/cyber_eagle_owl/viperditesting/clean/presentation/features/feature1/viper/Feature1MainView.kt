package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper

import android.util.Log
import android.widget.TextView
import ru.cyber_eagle_owl.viperditesting.R
import ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore.BaseView
import javax.inject.Inject

class Feature1MainView @Inject constructor() : BaseView<Feature1ViperContract.MainPresenter>(),
    Feature1ViperContract.MainView {

    private lateinit var helloTv: TextView
    private lateinit var presenterCheckingTv: TextView
    private lateinit var interactorTowardsRepositoryCheckingTv: TextView
    private lateinit var interactorFromRepositoryCheckingTv: TextView
    private lateinit var routerPreFlightTestingTv: TextView

    override fun onFinishInflate() {
        Log.d("TAG", "onFinishInflate()")
        initViews()
        setOnClickListeners()
        presenter.onViewCreated(this)
    }

    private fun initViews() {
        Log.d("TAG", "initViews()")
        helloTv = viperRootView.findViewById(R.id.helloTv)
        presenterCheckingTv = viperRootView.findViewById(R.id.prsntrCheckTv)
        interactorTowardsRepositoryCheckingTv =
            viperRootView.findViewById(R.id.interactorTowardsRepositoryCheckingTv)
        interactorFromRepositoryCheckingTv =
            viperRootView.findViewById(R.id.interactorFromRepositoryCheckTv)
        routerPreFlightTestingTv = viperRootView.findViewById(R.id.routerPreFlightCheckingTv)
    }

    private fun setOnClickListeners() {
        helloTv.setOnClickListener { changeText("Талибы обстреляли НЛО") }
        presenterCheckingTv.setOnClickListener {
            Log.d("TAG", "presenterCheckingTv.setOnClickListener")
            presenter.onPresenterCheckingTvClick()
        }
        interactorTowardsRepositoryCheckingTv.setOnClickListener {
            Log.d("TAG", "interactorTowardsRepositoryCheckingTv.setOnClickListener")
            presenter.onInteractorTowardsRepositoryCheckingTvClick()
        }
        interactorFromRepositoryCheckingTv.setOnClickListener {
            Log.d("TAG", "interactorFromRepositoryCheckingTv.setOnClickListener")
            presenter.onInteractorFromRepositoryCheckingTvClick()
        }
        routerPreFlightTestingTv.setOnClickListener {
            Log.d("TAG", "routerPreFlightTestingTv.setOnClickListener")
            presenter.onRouterPreFlightCheckingTvClick()
        }
    }

    override fun changeText(newText: String) {
        Log.d("TAG", "changeText($newText)")
        helloTv.text = newText
    }
}