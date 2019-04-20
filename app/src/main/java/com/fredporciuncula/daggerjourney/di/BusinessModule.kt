package com.fredporciuncula.daggerjourney.di

import com.fredporciuncula.daggerjourney.business.Business
import com.fredporciuncula.daggerjourney.business.BusinessRunner
import dagger.Module
import dagger.Provides

@Module
object BusinessModule {

  @JvmStatic @Provides
  fun provideBusinessRunner(businessRunner: BusinessRunner): Business.Runner = businessRunner
}
