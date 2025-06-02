package com.example.jetpackcomposethechance.data

import com.example.jetpackcomposethechance.R

data class AccountSettingsItem(
    val icon: Int,
    val contentResource: Int
)

val tomSettingsList = listOf(
    AccountSettingsItem(
        icon = R.drawable.bed,
        contentResource = R.string.sleeping
    ),
    AccountSettingsItem(
        icon = R.drawable.meaw,
        contentResource = R.string.meow
    ),
    AccountSettingsItem(
        icon = R.drawable.fridge,
        contentResource = R.string.fridge_password
    ),
)

val tomFavoriteFoodList = listOf(
    AccountSettingsItem(
        icon = R.drawable.warning,
        contentResource = R.string.mouse
    ),
    AccountSettingsItem(
        icon = R.drawable.stolen_meal,
        contentResource = R.string.last_stolen_meal
    ),
    AccountSettingsItem(
        icon = R.drawable.sleep_mode,
        contentResource = R.string.sleep_mode
    ),
)