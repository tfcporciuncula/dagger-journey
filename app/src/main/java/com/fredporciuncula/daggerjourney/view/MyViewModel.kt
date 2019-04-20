package com.fredporciuncula.daggerjourney.view

import androidx.lifecycle.ViewModel
import com.fredporciuncula.daggerjourney.business.Business

class MyViewModel(
  private val businessRunner: Business.Runner
) : ViewModel() {

  fun doBusiness() = businessRunner.doBusiness()
}
