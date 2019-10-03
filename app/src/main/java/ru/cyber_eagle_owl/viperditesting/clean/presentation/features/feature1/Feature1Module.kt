package ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1ViperContract
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.viper.Feature1MainView
import ru.cyber_eagle_owl.viperditesting.di.scopes.ActivityScope

@Module
abstract class Feature1Module {

    @Binds
    @ActivityScope
    abstract fun view(mainView: Feature1MainView): Feature1ViperContract.MainView

    /*
    @Binds
    @ActivityScope
    abstract fun presenter(presenter: NewsPresenter): NewsMvp.Presenter
    */
}
