package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract.*
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment2Contract.*
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment1.*
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment2.Feature2Fragment2Presenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment2.Feature2Fragment2Router
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment2.Feature2Fragment2View
import ru.cyber_eagle_owl.viperditesting.di.scopes.FragmentScope

@Module
abstract class Feature2FragmentsModule {

    @Binds
    @FragmentScope
    abstract fun fragment1View(fragment1View: Feature2Fragment1View): Fragment1View

    @Binds
    @FragmentScope
    abstract fun fragment1Presenter(fragment1Presenter: Feature2Fragment1Presenter): Fragment1Presenter

    @Binds
    @FragmentScope
    abstract fun fragment1Router(fragment1Router: Feature2Fragment1Router): Fragment1Router

    @Binds
    @FragmentScope
    abstract fun fragment2View(fragment2View: Feature2Fragment2View): Fragment2View

    @Binds
    @FragmentScope
    abstract fun fragment2Presenter(fragment2Presenter: Feature2Fragment2Presenter): Fragment2Presenter

    @Binds
    @FragmentScope
    abstract fun fragment2Router(fragment2Router: Feature2Fragment2Router): Fragment2Router


/*
    @Binds
    @ActivityScope
    abstract fun view(mainView: Feature2MainView): MainView

    @Binds
    @ActivityScope
    abstract fun presenter(mainPresenter: Feature2MainPresenter): MainPresenter

    @Binds
    @ActivityScope
    abstract fun interactorPresentationInputPort(interactor: Feature2MainTestInteractor): Feature2MainTestInteractorPresentationInputPort

    @Binds
    @ActivityScope
    abstract fun interactorDataInputPort(repository: CheckingRepository): Feature2MainTestInteractorDataInputPort

    @Binds
    @ActivityScope
    abstract fun router(mainRouter: Feature2MainRouter) : MainRouter*/
}
