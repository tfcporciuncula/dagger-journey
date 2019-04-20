package com.fredporciuncula.daggerjourney.business

import timber.log.Timber
import javax.inject.Inject

class BusinessUtil @Inject constructor() {

  fun log(message: String) = Timber.d("--> $message")
}
