package com.fredporciuncula.daggerjourney.di

import android.content.Context
import com.fredporciuncula.daggerjourney.view.MyViewModel
import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [AssistedInjectModule::class, SharedPreferencesModule::class, BusinessModule::class])
interface ApplicationComponent {

  @Component.Factory
  interface Factory {
    fun create(@BindsInstance applicationContext: Context): ApplicationComponent
  }

  val myViewModelFactory: MyViewModel.Factory
}

@AssistedModule
@Module(includes = [AssistedInject_AssistedInjectModule::class])
interface AssistedInjectModule
