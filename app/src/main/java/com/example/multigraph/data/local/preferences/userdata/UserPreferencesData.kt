package com.example.multigraph.data.local.preferences.userdata

import com.example.multigraph.data.local.preferences.PreferencesConstants
import com.example.multigraph.data.local.preferences.PreferencesHelper


class UserPreferencesData(
    private val preferences: PreferencesHelper
) {
    var isAuthorized: Boolean
        get() = preferences().getBoolean(
            PreferencesConstants.PREF_IS_AUTHORIZED, false
        )
        set(value) = preferences().edit().putBoolean(
            PreferencesConstants.PREF_IS_AUTHORIZED, value
        ).apply()

}