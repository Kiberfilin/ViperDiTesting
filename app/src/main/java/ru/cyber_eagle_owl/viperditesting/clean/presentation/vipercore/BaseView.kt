package ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore

import android.view.View
import javax.inject.Inject

open class BaseView<V : ViperView<P, V>, P : ViperPresenter<V, P>> : ViperView<P, V> {

    @Inject
    override lateinit var presenter: P

    override lateinit var viperRootView: View

    override fun setRootView(rootView: View) {
        viperRootView = rootView
    }

}