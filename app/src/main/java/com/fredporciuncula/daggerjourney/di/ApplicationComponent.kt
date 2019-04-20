package com.fredporciuncula.daggerjourney.di

import android.content.Context
import com.fredporciuncula.daggerjourney.business.BusinessRunner
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

  val businessRunner: BusinessRunner
}

@Module
class ApplicationModule(@get:Provides val applicationContext: Context)
