package ru.cyber_eagle_owl.viperditesting.clean.presentation.vipercore

interface ViperPresenter<V : ViperView<P, V>, P : ViperPresenter<V, P>> {

    val view: V
}