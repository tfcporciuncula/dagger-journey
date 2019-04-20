package com.fredporciuncula.daggerjourney.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fredporciuncula.daggerjourney.R
import com.fredporciuncula.daggerjourney.di.injector
import com.fredporciuncula.daggerjourney.di.viewModel

class MainActivity : AppCompatActivity() {

  private val viewModel by viewModel {
    injector.myViewModelFactory.create(initLogMessage = "Initialized.")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    viewModel.doBusiness()
  }
}
