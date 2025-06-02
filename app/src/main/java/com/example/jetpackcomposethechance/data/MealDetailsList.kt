package com.example.jetpackcomposethechance.data

import com.example.jetpackcomposethechance.R

val mealDetailsList = listOf(
    MealDetails(
        icon = R.drawable.temprature,
        value = "1000 V",
        title = "Temperature"
    ),
    MealDetails(
        icon = R.drawable.time,
        value = "3 Sparks",
        title = "Time"
    ),
    MealDetails(
        icon = R.drawable.death,
        value = "1 M 12K",
        title = "No. of deaths"
    ),
)

data class MealDetails(
    val icon: Int,
    val value: String,
    val title: String,
)