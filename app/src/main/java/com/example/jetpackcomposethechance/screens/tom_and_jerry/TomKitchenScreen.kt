package com.example.jetpackcomposethechance.screens.tom_and_jerry

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.composables.tom_and_jerry.BasePreview
import com.example.jetpackcomposethechance.composables.tom_and_jerry.DetailsCard
import com.example.jetpackcomposethechance.composables.tom_and_jerry.PriceCard
import com.example.jetpackcomposethechance.composables.tom_and_jerry.StepItem
import com.example.jetpackcomposethechance.composables.tom_and_jerry.TextWithIcon
import com.example.jetpackcomposethechance.data.mealDetailsList
import com.example.jetpackcomposethechance.data.prepartionSteps
import com.example.jetpackcomposethechance.ui.theme.BackgroundEliipse
import com.example.jetpackcomposethechance.ui.theme.GrayText99
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS
import com.example.jetpackcomposethechance.ui.theme.MainBlue
import com.example.jetpackcomposethechance.ui.theme.ScreenColour
import com.example.jetpackcomposethechance.ui.theme.TitleColor

@Composable
fun TomKitchenScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        DishDefinition(
            modifier = Modifier.align(Alignment.TopCenter)
        )
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 150.dp)
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
            color = ScreenColour,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MealNamePrice(
                        mealName = stringResource(R.string.meal_title),
                        price = 5,
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(R.drawable.heart),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(end = 18.dp, top = 28.dp)
                        // .weight(.9f)
                    )
                }

                Text(
                    modifier = Modifier.padding(16.dp),
                    text = stringResource(R.string.meal_desc),
                    color = GrayText99,
                    fontSize = 14.sp
                )

                Column(
                    modifier = Modifier.padding(top = 8.dp),
                ) {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = stringResource(R.string.details),
                        color = TitleColor,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        mealDetailsList.forEach { mealDetails ->
                            DetailsCard(
                                iconResource = mealDetails.icon,
                                title = mealDetails.title,
                                value = mealDetails.value,
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        modifier = Modifier.padding(start = 16.dp, top = 24.dp),
                        text = stringResource(R.string.preparation_method),
                        color = TitleColor,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        prepartionSteps.forEach { step ->
                            StepItem(
                                stepNumber = step.count,
                                stepText = stringResource(step.contentResource),
                            )
                        }
                    }
                }
            }
        }

        Image(
            painter = painterResource(id = R.drawable.dish),
            contentDescription = null,
            modifier = Modifier
                .width(220.dp)
                .height(200.dp)
                .padding(end = 24.dp)
                .align(Alignment.TopEnd)
        )

        Column(
            modifier =
                Modifier
                    .background(color = Color.White)
                    .padding(
                        horizontal = 2.dp,
                        vertical = 2.dp,
                    )
                    .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(space = 5.dp),
        ) {
            BottomActionButton(
                onClick = {},
                text = stringResource(R.string.add_to_cart),
            )
        }
    }
}

@Composable
fun DishDefinition(modifier: Modifier = Modifier) {
    val c = LocalLayoutDirection.current
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(BackgroundEliipse)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                TextWithIcon(
                    iconResource = R.drawable.tension,
                    text = stringResource(id = R.string.high_tension),
                    textColor = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))
                TextWithIcon(
                    iconResource = R.drawable.shocking,
                    text = stringResource(id = R.string.shocking_foods),
                    textColor = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Image(
            painter = painterResource(R.drawable.ellipse),
            contentDescription = "ellipse",
            modifier = Modifier
                .width(384.7502.dp)
                .height(414.21.dp)
                .offset(x = (-95).dp, y = (-25).dp)
                .graphicsLayer {
                    scaleX = if (c == LayoutDirection.Rtl) -1f else 1f
                }
        )
    }
}


@Composable
fun MealNamePrice(
    modifier: Modifier = Modifier,
    mealName: String,
    price: Int,
    discount: Int? = null,
) {
    Column(
        modifier = modifier.padding(start = 16.dp, top = 32.dp)
    ) {
        Text(
            text = mealName,
            color = TitleColor,
            fontFamily = IBM_PLEX_SANS,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
        )
        Spacer(modifier = Modifier.height(12.dp))
        PriceCard(
            price = price,
            discount = discount,
        )
    }

}

@Composable
fun BottomActionButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MainBlue,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                Text(
                    text = text,
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        fontFamily = IBM_PLEX_SANS,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xDEFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                )

                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.small_dot),
                    contentDescription = "small dot",
                    modifier = Modifier.size(5.dp)
                )

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "3 cheeses",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 16.sp,
                            fontFamily = IBM_PLEX_SANS,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        )
                    )

                    Text(
                        text = "5 cheeses",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontFamily = IBM_PLEX_SANS,
                            fontWeight = FontWeight(500),
                            color = Color(0xCCFFFFFF),
                            textAlign = TextAlign.Center,
                            letterSpacing = 0.5.sp,
                            textDecoration = TextDecoration.LineThrough,
                        )
                    )
                }
            }
        }
    }
}

@BasePreview
@Composable
fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}