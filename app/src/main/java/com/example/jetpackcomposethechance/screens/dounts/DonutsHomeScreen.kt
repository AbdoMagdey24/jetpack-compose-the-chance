package com.example.jetpackcomposethechance.screens.dounts

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.composables.dounts.BottomNavBar
import com.example.jetpackcomposethechance.composables.tom_and_jerry.BasePreview
import com.example.jetpackcomposethechance.data.dounts.lastSectionDonuts
import com.example.jetpackcomposethechance.data.dounts.lastSectionPrices
import com.example.jetpackcomposethechance.data.dounts.lastSectionTitles
import com.example.jetpackcomposethechance.data.dounts.todayOfferCardColors
import com.example.jetpackcomposethechance.data.dounts.todayOfferDescriptions
import com.example.jetpackcomposethechance.data.dounts.todayOfferDonutShapes
import com.example.jetpackcomposethechance.data.dounts.todayOfferNewPrices
import com.example.jetpackcomposethechance.data.dounts.todayOfferOldPrices
import com.example.jetpackcomposethechance.data.dounts.todayOfferTitles
import com.example.jetpackcomposethechance.ui.theme.INTER_FONT

@Composable
fun DonutsHomeScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color.White, Color(0xffECECEC)),
                    start = Offset(0f, 0f),
                    end = Offset(0f, Float.POSITIVE_INFINITY)
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(start = 38.dp, bottom = 16.dp)
                    .navigationBarsPadding()
            ) {
                Spacer(Modifier.height(41.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Header()

                    Image(
                        imageVector = ImageVector.vectorResource(R.drawable.search_icon),
                        contentDescription = "Search icon",
                        modifier = Modifier
                            .padding(end = 40.dp)
                            .background(
                                color = Color(0xffFED8DF), shape = RoundedCornerShape(15.dp)
                            )
                            .padding(12.dp)
                    )
                }

                Spacer(Modifier.height(54.dp))

                Text(
                    text = "Today Offers", style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = INTER_FONT,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF000000),
                    )
                )

                Spacer(Modifier.height(25.dp))

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(47.dp)
                ) {
                    items(2) {
                        TodayOfferCard(
                            title = todayOfferTitles[it],
                            description = todayOfferDescriptions[it],
                            oldPrice = todayOfferOldPrices[it],
                            newPrice = todayOfferNewPrices[it],
                            cardColor = todayOfferCardColors[it],
                            isReachedLastItem = it == 1,
                            donutShape = todayOfferDonutShapes[it]
                        )
                    }
                }

                Spacer(Modifier.height(36.dp))

                Text(
                    text = "Donuts", style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = INTER_FONT,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF000000),
                    )
                )

                Spacer(Modifier.height(11.dp))

                LazyRow(
                    contentPadding = PaddingValues(top = 54.dp),
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                ) {
                    items(3) {
                        CustomDonutCard(
                            backgroundColor = Color.White,
                            donutImage = lastSectionDonuts[it],
                            donutName = lastSectionTitles[it],
                            donutPrice = lastSectionPrices[it],
                            modifier = Modifier
                        )
                    }
                }
            }


            BottomNavBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            )
        }
    }
}



@Composable
fun Header() {
    Column(
        verticalArrangement = Arrangement.spacedBy(3.dp)
    ) {
        Text(
            text = stringResource(R.string.let_s_gonuts), style = TextStyle(
                fontSize = 30.sp,
                fontFamily = INTER_FONT,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFFF7074),
            )
        )

        Text(
            text = stringResource(R.string.order_your_favourite_), style = TextStyle(
                fontSize = 14.sp,
                fontFamily = INTER_FONT,
                fontWeight = FontWeight(500),
                color = Color(0x99000000),
            )
        )
    }
}

@Composable
fun TodayOfferCard(
    title: String,
    description: String,
    oldPrice: String,
    newPrice: String,
    cardColor: Color,
    isReachedLastItem: Boolean,
    @DrawableRes donutShape: Int
) {
    Box(
        modifier = Modifier
            .padding(end = if (isReachedLastItem) 35.dp else 0.dp)
            .wrapContentWidth()
            .width(193.dp)
            .background(
                color = cardColor, shape = RoundedCornerShape(20.dp)
            )
    ) {
        Column(
            modifier = Modifier.padding(
                start = 15.dp,
                bottom = 15.dp,
            ),
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.heart_icon),
                contentDescription = "",
                tint = Color(0xffFF7074),
                modifier = Modifier
                    .padding(top = 15.dp)
                    .background(
                        color = Color.White, shape = CircleShape
                    )
                    .padding(8.dp)
            )

            Image(
                painter = painterResource(donutShape),
                contentDescription = "",
                modifier = Modifier
                    .size(178.dp)
                    .offset(55.dp)
            )

            Text(
                text = title, style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = INTER_FONT,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF000000),
                )
            )

            Spacer(Modifier.height(9.dp))

            Text(
                text = description, style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = INTER_FONT,
                    fontWeight = FontWeight(400),
                    color = Color(0x99000000),
                    letterSpacing = 0.6.sp,
                ), maxLines = 3, modifier = Modifier.padding(end = 16.dp)
            )
            Spacer(Modifier.height(5.dp))
            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 15.dp),
                verticalAlignment = Alignment.Bottom,
            ) {
                Text(
                    text = oldPrice, style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = INTER_FONT,
                        fontWeight = FontWeight(600),
                        color = Color(0x99000000),
                        textDecoration = TextDecoration.LineThrough,
                    ), modifier = Modifier.padding(bottom = 2.dp)
                )
                Spacer(Modifier.width(5.dp))
                Text(
                    text = newPrice, style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = INTER_FONT,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF000000),
                    )
                )
            }
        }
    }
}

@Composable
fun CustomDonutCard(
    backgroundColor: Color,
    @DrawableRes donutImage: Int,
    donutName: String,
    donutPrice: String,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.background(
            backgroundColor,
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 20.dp,
                bottomStart = 10.dp,
                bottomEnd = 10.dp,
            )
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .layout { measurable, constraints ->
                    val placeable = measurable.measure(constraints)
                    layout(placeable.width, placeable.height - 54.dp.roundToPx()) {
                        placeable.place(0, -54.dp.roundToPx())
                    }
                }
                .width(180.dp)
                .padding(start = 10.dp, end = 10.dp)
        ) {
            Image(
                painter = painterResource(donutImage),
                contentDescription = "",
                modifier = Modifier
                    .height(112.dp)
                    .width(104.dp),
                contentScale = ContentScale.FillBounds
            )

            Text(
                text = donutName, maxLines = 1, overflow = TextOverflow.Ellipsis, style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = INTER_FONT,
                    fontWeight = FontWeight(500),
                    color = Color(0x99000000),
                    textAlign = TextAlign.Center,
                )
            )

            Spacer(Modifier.height(10.dp))

            Text(
                text = donutPrice,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = INTER_FONT,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFF7074),
                ),
                modifier = Modifier.padding(bottom = 20.dp)
            )
        }
    }
}

@BasePreview
@Composable
fun DonutsHomeScreenPreview() {
    DonutsHomeScreen()
}