package ru.cyber_eagle_owl.viperditesting

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import ru.cyber_eagle_owl.viperditesting.di.AppComponent
import ru.cyber_eagle_owl.viperditesting.di.AppModule
import ru.cyber_eagle_owl.viperditesting.di.DaggerAppComponent
import timber.log.Timber

class App : DaggerApplication() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
    }

    private fun prepareTimber() {
        Timber.plant(Timber.DebugTree())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        //@Deprecated after filling applicationGraph @Deprecated will be removed
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
        return appComponent
    }
}