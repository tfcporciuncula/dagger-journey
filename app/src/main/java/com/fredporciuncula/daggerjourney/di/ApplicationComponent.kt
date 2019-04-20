package com.fredporciuncula.daggerjourney.di

import com.fredporciuncula.daggerjourney.business.BusinessRunner
import dagger.Component

@Component
interface ApplicationComponent {

  val businessRunner: BusinessRunner
}
