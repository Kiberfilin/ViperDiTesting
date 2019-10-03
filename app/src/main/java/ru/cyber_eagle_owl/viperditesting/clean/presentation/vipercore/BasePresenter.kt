package ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore

import javax.inject.Inject

open class BasePresenter<V : ViperView<P, V>, P : ViperPresenter<V, P>> : ViperPresenter<V, P> {

    @Inject
    override lateinit var view: V
}