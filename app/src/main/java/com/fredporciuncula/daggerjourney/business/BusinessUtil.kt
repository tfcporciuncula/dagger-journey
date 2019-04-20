package com.fredporciuncula.daggerjourney.business

import android.content.Context
import com.fredporciuncula.daggerjourney.R
import dagger.Reusable
import timber.log.Timber
import javax.inject.Inject

@Reusable
class BusinessUtil @Inject constructor(
  private val context: Context
) {

  fun log(message: String) = Timber.d(context.getString(R.string.log_template, message))
}
