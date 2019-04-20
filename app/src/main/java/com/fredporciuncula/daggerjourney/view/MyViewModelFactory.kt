package com.fredporciuncula.daggerjourney.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fredporciuncula.daggerjourney.business.BusinessRunner
import javax.inject.Inject

class MyViewModelFactory @Inject constructor(
  private val businessRunner: BusinessRunner
) : ViewModelProvider.Factory {

  @Suppress("UNCHECKED_CAST")
  override fun <T : ViewModel> create(modelClass: Class<T>) = MyViewModel(businessRunner) as T
}
