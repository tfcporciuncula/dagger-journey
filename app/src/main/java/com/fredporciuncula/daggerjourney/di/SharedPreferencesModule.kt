package com.fredporciuncula.daggerjourney.di

import android.content.Context
import android.content.SharedPreferences
import com.fredporciuncula.daggerjourney.R
import dagger.Module
import dagger.Provides

@Module
object SharedPreferencesModule {

  @JvmStatic @Provides
  fun provideLogSharedPreferences(context: Context): SharedPreferences =
    context.getSharedPreferences(
      context.getString(R.string.log_preferences_name),
      Context.MODE_PRIVATE
    )
}
