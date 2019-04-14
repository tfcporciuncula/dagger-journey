package com.fredporciuncula.daggerjourney.di

import android.content.Context
import com.fredporciuncula.daggerjourney.business.BusinessRunner
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton @Component
interface ApplicationComponent {

  @Component.Builder
  interface Builder {
    @BindsInstance fun applicationContext(applicationContext: Context): Builder
    fun build(): ApplicationComponent
  }

  val businessRunner: BusinessRunner
}
