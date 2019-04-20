package com.fredporciuncula.daggerjourney.di

import android.content.Context
import com.fredporciuncula.daggerjourney.view.MyViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SharedPreferencesModule::class, BusinessModule::class])
interface ApplicationComponent {

  @Component.Factory
  interface Factory {
    fun create(@BindsInstance applicationContext: Context): ApplicationComponent
  }

  val myViewModel: MyViewModel
}
