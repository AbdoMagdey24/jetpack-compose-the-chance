package com.example.jetpackcomposethechance.data

import com.example.jetpackcomposethechance.R

val tomList = listOf(
    Tom(
        imageResource = R.drawable.sport_tom,
        nameResource = R.string.sport_tom,
        descriptionResource = R.string.sport_tomـdescription,
        price = 3,
        discount = 5
    ),
    Tom(
        imageResource = R.drawable.scaring_tom,
        nameResource = R.string.scaring_tom,
        descriptionResource = R.string.scaring_tomـdescription,
        price = 15,
    ),
    Tom(
        imageResource = R.drawable.crying_tom,
        nameResource = R.string.crying_tom,
        descriptionResource = R.string.crying_tomـdescription,
        price = 12,
    ),
    Tom(
        imageResource = R.drawable.bomb_tom,
        nameResource = R.string.bob_tom,
        descriptionResource = R.string.bob_tomـdescription,
        price = 10,
    ),

    Tom(
        imageResource = R.drawable.lover_tom,
        nameResource = R.string.lover_tom,
        descriptionResource = R.string.lover_tomـdescription,
        price = 9,
    ),
    Tom(
        imageResource = R.drawable.frozen_tom,
        nameResource = R.string.frozen_tom,
        descriptionResource = R.string.frozen_tomـdescription,
        price = 5,
    ),
)

data class Tom(
    val imageResource: Int,
    val nameResource: Int,
    val descriptionResource: Int,
    val price: Int,
    val discount: Int? = null
)