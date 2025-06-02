package com.example.jetpackcomposethechance.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.composables.AccountColoredCard
import com.example.jetpackcomposethechance.composables.BasePreview
import com.example.jetpackcomposethechance.composables.TitledList
import com.example.jetpackcomposethechance.data.Rate
import com.example.jetpackcomposethechance.data.cardColorList
import com.example.jetpackcomposethechance.data.rateList
import com.example.jetpackcomposethechance.data.tomFavoriteFoodList
import com.example.jetpackcomposethechance.data.tomSettingsList
import com.example.jetpackcomposethechance.ui.theme.ScreenColour

@Composable
fun TomAccountScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        AccountHeader()
//        Surface(
//            modifier = Modifier
//                .fillMaxWidth()
//                .fillMaxHeight()
//                .padding(top = 130.dp)
//                .align(Alignment.BottomCenter),
//            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
//            color = ScreenColour,
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(16.dp)
//            ) {
//                RateCards(rateList)
//                Spacer(modifier = Modifier.height(8.dp))
//                TitledList(
//                    title = stringResource(R.string.settings),
//                    listItems = tomSettingsList
//                )
//                TitledList(
//                    title = stringResource(R.string.fav_food),
//                    listItems = tomFavoriteFoodList
//                )
//            }
        }

 //   }
}

@Composable
fun RateCards(
    cards: List<Rate>
) {

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        cards.chunked(2).forEach { rowCards ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                rowCards.forEach { card ->
                    AccountColoredCard(
                        iconResource = card.iconResource,
                        valueResource = card.valueResource,
                        descriptionResource = card.titleResource,
                        cardColor = card.color
                    )
                }


                if (rowCards.size < 2) {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun AccountHeader(
    modifier: Modifier = Modifier,
    imageResource: Int = 0,
    userNameResource: Int = 0,
    infoResource: Int = 0,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = stringResource(userNameResource)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = stringResource(infoResource)
        )

    }
}

@BasePreview
@Composable
fun TomAccountScreenPreview() {
    //  RateCards(rateList)
    TomAccountScreen()
}