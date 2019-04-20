package com.fredporciuncula.daggerjourney

import android.app.Application
import com.fredporciuncula.daggerjourney.di.DaggerApplicationComponent
import com.fredporciuncula.daggerjourney.di.InjectorProvider
import timber.log.Timber

class DaggerJourneyApplication : Application(), InjectorProvider {

  override val component by lazy {
    DaggerApplicationComponent.factory().create(applicationContext)
  }

  override fun onCreate() {
    super.onCreate()
    setupTimber()
  }

  private fun setupTimber() {
    if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
  }
}
