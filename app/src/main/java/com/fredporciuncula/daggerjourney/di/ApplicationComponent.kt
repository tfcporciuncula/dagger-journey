package com.fredporciuncula.daggerjourney.di

import android.content.Context
import com.fredporciuncula.daggerjourney.business.BusinessRunner
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton @Component
interface ApplicationComponent {

  @Component.Factory
  interface Factory {
    fun create(@BindsInstance applicationContext: Context): ApplicationComponent
  }

  val businessRunner: BusinessRunner
}
