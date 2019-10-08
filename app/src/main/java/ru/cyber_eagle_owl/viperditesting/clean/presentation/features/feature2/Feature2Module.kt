package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.viperditesting.clean.data.repositories.CheckingRepository
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.Feature2MainTestInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.Feature2MainTestInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.interactors.Feature2MainTestInteractor
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2MainView
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2MainPresenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2MainRouter
import ru.cyber_eagle_owl.viperditesting.di.scopes.ActivityScope
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperMainContract.*
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment1Contract.*
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.viper.Feature2ViperFragment2Contract.*

@Module
abstract class Feature2Module {

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
    abstract fun router(mainRouter: Feature2MainRouter) : MainRouter
}
