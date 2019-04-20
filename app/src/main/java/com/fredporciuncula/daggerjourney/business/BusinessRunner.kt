package com.fredporciuncula.daggerjourney.business

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BusinessRunner @Inject constructor(
  private val businessUtil: BusinessUtil
) : Business.Runner {

  override fun doBusiness() = businessUtil.log("Business done.")
}
