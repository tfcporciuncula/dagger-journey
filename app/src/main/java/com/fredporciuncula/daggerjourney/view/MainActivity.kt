package com.fredporciuncula.daggerjourney.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fredporciuncula.daggerjourney.R
import com.fredporciuncula.daggerjourney.di.injector

class MainActivity : AppCompatActivity() {

  private val businessRunner by lazy { injector.businessRunner }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    businessRunner.doBusiness()
  }
}
