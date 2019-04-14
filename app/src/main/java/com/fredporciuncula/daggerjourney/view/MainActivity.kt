package com.fredporciuncula.daggerjourney.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fredporciuncula.daggerjourney.DaggerJourneyApplication
import com.fredporciuncula.daggerjourney.R

class MainActivity : AppCompatActivity() {

  private val businessRunner = DaggerJourneyApplication.component.businessRunner

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    businessRunner.doBusiness()
  }
}
