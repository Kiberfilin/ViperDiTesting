package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.viperditesting.clean.data.repositories.CheckingRepository
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.CheckInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.CheckInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.interactors.CheckInteractor
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.main.Feature1MainPresenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.main.Feature1MainRouter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.main.Feature1MainView
import ru.cyber_eagle_owl.viperditesting.di.scopes.ActivityScope
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1ViperContract.*

@Module
abstract class Feature1Module {

    @Binds
    @ActivityScope
    abstract fun view(mainView: Feature1MainView): MainView

    @Binds
    @ActivityScope
    abstract fun presenter(mainPresenter: Feature1MainPresenter): MainPresenter

    @Binds
    @ActivityScope
    abstract fun interactorPresentationInputPort(interactor: CheckInteractor): CheckInteractorPresentationInputPort

    @Binds
    @ActivityScope
    abstract fun interactorDataInputPort(repository: CheckingRepository): CheckInteractorDataInputPort

    @Binds
    @ActivityScope
    abstract fun router(mainRouter: Feature1MainRouter) : MainRouter
}
