package com.fredporciuncula.daggerjourney.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.fredporciuncula.daggerjourney.R
import com.fredporciuncula.daggerjourney.di.injector

class MainActivity : AppCompatActivity() {

  private val viewModel by lazy {
    ViewModelProviders.of(this, injector.myViewModelFactory).get(MyViewModel::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    viewModel.doBusiness()
  }
}
