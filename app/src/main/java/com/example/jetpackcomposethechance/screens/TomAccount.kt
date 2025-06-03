package com.example.jetpackcomposethechance.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.composables.AccountColoredCard
import com.example.jetpackcomposethechance.composables.BasePreview
import com.example.jetpackcomposethechance.composables.TextWithIcon
import com.example.jetpackcomposethechance.data.Rate
import com.example.jetpackcomposethechance.data.rateList
import com.example.jetpackcomposethechance.data.tomFavoriteFoodList
import com.example.jetpackcomposethechance.data.tomSettingsList
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS

@Composable
fun TomAccountScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        AccountHeader(
            imageResource = R.drawable.tom_profile,
            userNameResource = R.string.tom_username,
            bioResource = R.string.user_bio
        )

        Card(
            colors = CardColors(
                containerColor = Color(0xffEEF4F6),
                contentColor = Color.Black,
                disabledContainerColor = Color(0xffEEF4F6),
                disabledContentColor = Color.Black,
            ),
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 202.dp)
                .requiredHeight(LocalConfiguration.current.screenHeightDp.dp - 202.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp)
            ) {
                Spacer(Modifier.height(23.dp))
                RateCards(rateList)

                Spacer(Modifier.height(24.dp))

                Text(
                    text = stringResource(R.string.settings),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = IBM_PLEX_SANS,
                        fontWeight = FontWeight(700),
                        color = Color(0xDE1F1F1E),
                    )
                )
                Column(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .heightIn(max = 160.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    tomSettingsList.forEach { item ->
                        TextWithIcon(
                            iconResource = item.icon,
                            text = stringResource(item.contentResource),
                            textColor = Color(0xDE1F1F1E),
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                Spacer(Modifier.height(12.dp))

                HorizontalDivider(
                    thickness = 1.dp,
                    color = Color(0x140B001F),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(Modifier.height(12.dp))

                Text(
                    text = stringResource(R.string.fav_food),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = IBM_PLEX_SANS,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xDE1F1F1E)
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Column(
                    modifier = Modifier
                        .heightIn(max = 160.dp)
                        .padding(top = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    tomFavoriteFoodList.forEach { item ->
                        TextWithIcon(
                            iconResource = item.icon,
                            text = stringResource(item.contentResource),
                            textColor = Color(0xDE1F1F1E),
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 32.dp)
                ) {
                    Text(
                        text = "v.TomBeta",
                        modifier = Modifier.align(Alignment.Center),
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = IBM_PLEX_SANS,
                            fontWeight = FontWeight.Normal,
                            color = Color(0x99121212),
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
        }
    }
}


@Composable
fun AccountHeader(
    modifier: Modifier = Modifier,
    imageResource: Int ,
    userNameResource: Int ,
    bioResource: Int ,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(242.dp)
            .background(Color(0xff226993))
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(600.dp)
                .requiredHeight(300.dp)
                .offset(x = (35).dp, y = (-120.82).dp)
                .rotate(32.5f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color.White.copy(alpha = 0.43f), Color(0xff226993))
                    )
                )
        )

        Box(
            modifier = Modifier
                .requiredWidth(508.dp)
                .requiredHeight(208.dp)
                .offset(x = (-10.51).dp, y = (-80.65).dp)
                .rotate(-15.92f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xff226993),
                            Color.White.copy(alpha = 0.20f),
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .offset(y = 16.dp)
                .align(alignment = Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = "",
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                text = stringResource(userNameResource),
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 23.4.sp,
                    fontFamily = IBM_PLEX_SANS,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                )
            )

            Text(
                text = stringResource(bioResource),
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 21.6.sp,
                    fontFamily = IBM_PLEX_SANS,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xCCFFFFFF),
                ),
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Button(
                onClick = {},
                Modifier
                    .height(25.dp),
                colors = ButtonColors(
                    containerColor = Color(0x1FFFFFFF),
                    contentColor = Color.White,
                    disabledContainerColor = Color(0x1FFFFFFF),
                    disabledContentColor = Color.White
                ),
                shape = RoundedCornerShape(size = 40.dp),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = "Edit foolishness",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = IBM_PLEX_SANS,
                        fontWeight = FontWeight(500),
                        color = Color.White,
                    ),
                )
            }
        }
    }
}

@Composable
fun RateCards(
    cards: List<Rate>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(max = 200.dp)
    ) {

        items(cards.take(4)) { card ->
            AccountColoredCard(
                modifier = Modifier
                    .height(70.dp),
                iconResource = card.iconResource,
                valueResource = card.valueResource,
                descriptionResource = card.titleResource,
                cardColor = card.color
            )
        }
    }
}

@BasePreview
@Composable
fun TomAccountScreenPreview() {
    // RateCards(rateList)
    TomAccountScreen()
}