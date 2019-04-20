package com.fredporciuncula.daggerjourney.view

import androidx.lifecycle.ViewModel
import com.fredporciuncula.daggerjourney.business.Business
import javax.inject.Inject

class MyViewModel @Inject constructor(
  private val businessRunner: Business.Runner
) : ViewModel() {

  fun doBusiness() = businessRunner.doBusiness()
}
