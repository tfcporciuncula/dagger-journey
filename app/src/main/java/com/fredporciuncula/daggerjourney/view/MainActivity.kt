package com.fredporciuncula.daggerjourney.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fredporciuncula.daggerjourney.R
import com.fredporciuncula.daggerjourney.di.getViewModel
import com.fredporciuncula.daggerjourney.di.injector

class MainActivity : AppCompatActivity() {

  private val viewModel by lazy {
    getViewModel { injector.myViewModel }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    viewModel.doBusiness()
  }
}
