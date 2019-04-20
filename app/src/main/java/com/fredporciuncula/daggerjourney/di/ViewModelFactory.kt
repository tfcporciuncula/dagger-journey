package com.fredporciuncula.daggerjourney.di

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

@Suppress("UNCHECKED_CAST")
inline fun <reified T : ViewModel> FragmentActivity.getViewModel(crossinline factory: () -> T) =
  ViewModelProviders.of(this, object : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>) = factory() as T
  }).get(T::class.java)
