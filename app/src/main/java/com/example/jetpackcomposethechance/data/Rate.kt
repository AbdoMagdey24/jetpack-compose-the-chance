package com.example.jetpackcomposethechance.data

import androidx.compose.ui.graphics.Color
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.ui.theme.DetailsCardColor
import com.example.jetpackcomposethechance.ui.theme.Lemon
import com.example.jetpackcomposethechance.ui.theme.Orange
import com.example.jetpackcomposethechance.ui.theme.Pink

data class Rate(
    val iconResource: Int,
    val valueResource: Int,
    val titleResource: Int,
    val color: Color
)

val rateList = listOf(
    Rate(
        iconResource = R.drawable.quarrels,
        valueResource = R.string.quarrel_value,
        titleResource = R.string.quarrel_title,
        color = DetailsCardColor
    ),
    Rate(
        iconResource = R.drawable.chase,
        valueResource = R.string.chase_value,
        titleResource = R.string.chase_title,
        color = Lemon
    ),
    Rate(
        iconResource = R.drawable.hunting,
        valueResource = R.string.hunting_value,
        titleResource = R.string.hunting_title,
        color = Pink
    ),
    Rate(
        iconResource = R.drawable.heart_broken,
        valueResource = R.string.heartbroken_value,
        titleResource = R.string.heartbroken_title,
        color = Orange
    ),
)

val cardColorList = listOf(
    DetailsCardColor, Lemon, Pink, Orange
)