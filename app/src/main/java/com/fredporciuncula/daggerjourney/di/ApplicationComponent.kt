package com.fredporciuncula.daggerjourney.di

import com.fredporciuncula.daggerjourney.business.BusinessRunner
import dagger.Component
import javax.inject.Singleton

@Singleton @Component
interface ApplicationComponent {

  val businessRunner: BusinessRunner
}
