package com.fredporciuncula.daggerjourney

import android.app.Application
import timber.log.Timber

class DaggerJourneyApplication : Application() {

  override fun onCreate() {
    super.onCreate()
    setupTimber()
  }

  private fun setupTimber() {
    if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
  }
}
