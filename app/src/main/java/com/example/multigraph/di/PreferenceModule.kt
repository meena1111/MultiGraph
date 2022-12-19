package com.example.multigraph.di

import android.content.Context
import com.example.multigraph.data.local.preferences.PreferencesHelper
import com.example.multigraph.data.local.preferences.userdata.UserPreferencesData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class PreferenceModule {

    @Singleton
    @Provides
    fun providePreferencesHelper(@ApplicationContext context: Context): PreferencesHelper =
        PreferencesHelper((context))

    @Singleton
    @Provides
    fun provideUserPreferencesData(preferencesHelper: PreferencesHelper) =
        UserPreferencesData(preferencesHelper)

}