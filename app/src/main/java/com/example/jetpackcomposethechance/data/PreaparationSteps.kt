package com.example.jetpackcomposethechance.data

import com.example.jetpackcomposethechance.R

val prepartionSteps = listOf(
    Steps(
        count = 1,
        contentResource = R.string.step_1
    ),
    Steps(
        count = 2,
        contentResource = R.string.step_2
    ),
    Steps(
        count = 3,
        contentResource = R.string.step_3
    ),
    Steps(
        count = 4,
        contentResource = R.string.step_4
    ),
)

data class Steps(
    val count: Int,
    val contentResource: Int
)