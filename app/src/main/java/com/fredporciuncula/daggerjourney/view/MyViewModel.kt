package com.fredporciuncula.daggerjourney.view

import androidx.lifecycle.ViewModel
import com.fredporciuncula.daggerjourney.business.Business
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import timber.log.Timber

class MyViewModel @AssistedInject constructor(
  private val businessRunner: Business.Runner,
  @Assisted private val initLogMessage: String
) : ViewModel() {

  @AssistedInject.Factory
  interface Factory {
    fun create(initLogMessage: String): MyViewModel
  }

  init {
    Timber.d(initLogMessage)
  }

  fun doBusiness() = businessRunner.doBusiness()
}
