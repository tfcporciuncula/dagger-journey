package com.fredporciuncula.daggerjourney.business

import javax.inject.Inject

class BusinessRunner @Inject constructor(
  private val businessUtil: BusinessUtil
) {

  fun doBusiness() = businessUtil.log("Business done.")
}
