package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract.*
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment2Contract.*
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment1.Feature2Fragment1Presenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment1.Feature2Fragment1Router
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.fragment1.Feature2Fragment1View
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
