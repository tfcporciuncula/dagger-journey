package com.fredporciuncula.daggerjourney.di

import com.fredporciuncula.daggerjourney.business.Business
import com.fredporciuncula.daggerjourney.business.BusinessRunner
import dagger.Binds
import dagger.Module

@Module
interface BusinessModule {

  @Binds
  fun provideBusinessRunner(businessRunner: BusinessRunner): Business.Runner
}
