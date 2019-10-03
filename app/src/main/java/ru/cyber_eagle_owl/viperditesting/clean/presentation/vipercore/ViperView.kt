package ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore

import android.view.View

interface ViperView <P : ViperPresenter<V, P>, V : ViperView<P, V>>{

    val viperRootView: View

    val presenter: P

    fun setRootView(rootView: View)
}
