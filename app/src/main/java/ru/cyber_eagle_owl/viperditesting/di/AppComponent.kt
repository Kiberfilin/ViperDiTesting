package ru.cyber_eagle_owl.viperditesting.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ru.cyber_eagle_owl.viperditesting.di.scopes.ApplicationScope
import ru.cyber_eagle_owl.viperditesting.App

@ApplicationScope
@Component(modules = [
    AppModule::class,
    ActivityBindingModule::class,
    FragmentBindingModule::class,
    AndroidSupportInjectionModule::class])

interface AppComponent : AndroidInjector<App>