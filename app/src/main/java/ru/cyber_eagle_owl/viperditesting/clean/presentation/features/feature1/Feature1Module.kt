package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.viperditesting.clean.data.repositories.CheckingRepository
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.presenter.inputports.CheckInteractorPresentationInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.inputports.CheckInteractorDataInputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.boundaries.repository.outputports.CheckInteractorDataOutputPort
import ru.cyber_eagle_owl.viperditesting.clean.domain.interactors.CheckInteractor
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1MainPresenter
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1ViperContract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1MainView
import ru.cyber_eagle_owl.viperditesting.di.scopes.ActivityScope

@Module
abstract class Feature1Module {

    @Binds
    @ActivityScope
    abstract fun view(mainView: Feature1MainView): Feature1ViperContract.MainView

    @Binds
    @ActivityScope
    abstract fun presenter(mainPresenter: Feature1MainPresenter): Feature1ViperContract.MainPresenter

    @Binds
    @ActivityScope
    abstract fun interactorPresentationInputPort(interactor: CheckInteractor): CheckInteractorPresentationInputPort

    @Binds
    @ActivityScope
    abstract fun interactorDataInputPort (repository: CheckingRepository): CheckInteractorDataInputPort

}
