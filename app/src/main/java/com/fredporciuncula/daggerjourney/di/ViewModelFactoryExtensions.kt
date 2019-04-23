package com.fredporciuncula.daggerjourney.di

import androidx.activity.viewModels
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
inline fun <reified T : ViewModel> FragmentActivity.viewModel(
  crossinline provider: () -> T
) = viewModels<T> {
  object : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>) = provider() as T
  }
}
