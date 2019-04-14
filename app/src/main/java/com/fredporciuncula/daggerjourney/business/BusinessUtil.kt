package com.fredporciuncula.daggerjourney.business

import android.content.Context
import android.content.SharedPreferences
import com.fredporciuncula.daggerjourney.R
import dagger.Reusable
import timber.log.Timber
import javax.inject.Inject

@Reusable
class BusinessUtil @Inject constructor(
  private val context: Context,
  private val sharedPreferences: SharedPreferences
) {

  fun log(message: String) {
    Timber.d(context.getString(R.string.log_template, message))
    storeLastLogMessage(message)
  }

  private fun storeLastLogMessage(message: String) =
    sharedPreferences
      .edit()
      .putString(context.getString(R.string.log_preference_key), message)
      .apply()
}
