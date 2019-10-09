package ru.cyber_eagle_owl.viperditesting.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2Fragment1
import ru.cyber_eagle_owl.viperditesting.clean.presentation.features.feature2.fragments.Feature2FragmentsModule
import ru.cyber_eagle_owl.viperditesting.di.scopes.FragmentScope

@Module
abstract class FragmentBindingModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [Feature2FragmentsModule::class])
    abstract fun bindFeature2Fragment1(): Feature2Fragment1
}