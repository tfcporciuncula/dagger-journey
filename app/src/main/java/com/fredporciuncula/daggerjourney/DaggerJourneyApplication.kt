package com.fredporciuncula.daggerjourney

import android.app.Application
import com.fredporciuncula.daggerjourney.di.ApplicationComponent
import com.fredporciuncula.daggerjourney.di.DaggerApplicationComponent
import timber.log.Timber

class DaggerJourneyApplication : Application() {

  companion object {
    lateinit var component: ApplicationComponent private set
  }

  override fun onCreate() {
    super.onCreate()
    initializeComponent()
    setupTimber()
  }

  private fun initializeComponent() {
    component = DaggerApplicationComponent.create()
  }

  private fun setupTimber() {
    if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
  }
}
