package ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore

import android.view.View

interface ViperView <P : ViperPresenter>{

    val viperRootView: View

    val presenter: P

    fun setRootView(rootView: View)
}
