package ru.cyber_eagle_owl.viperditesting.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.Feature1Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature1.Feature1Module
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.Feature2Activity
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.Feature2Module
import ru.cyber_eagle_owl.viperditesting.di.scopes.ActivityScope

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [Feature1Module::class])
    abstract fun bindFeature1Activity(): Feature1Activity

    @ActivityScope
    @ContributesAndroidInjector(modules = [Feature2Module::class])
    abstract fun bindFeature2Activity(): Feature2Activity

}