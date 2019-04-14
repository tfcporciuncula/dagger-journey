package com.fredporciuncula.daggerjourney.business

import dagger.Reusable
import timber.log.Timber
import javax.inject.Inject

@Reusable
class BusinessUtil @Inject constructor() {

  fun log(message: String) = Timber.d("--> $message")
}
