package com.example.jetpackcomposethechance.screens.dounts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.composables.tom_and_jerry.BasePreview
import com.example.jetpackcomposethechance.ui.theme.INTER_FONT

@Composable
fun DetailScreen() {
    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xffFED8DF))
            ) {
                Image(
                    painter = painterResource(R.drawable.details_big_donut),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 65.dp)
                )

                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.arrow_back),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top = 45.dp, start = 32.dp)
                        .size(30.dp)
                        .align(Alignment.TopStart).clickable {  },
                    tint = Color(0xffFF7074)
                )

            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .layout { measurable, constraints ->
                        val placeable = measurable.measure(constraints)

                        layout(placeable.width, placeable.height - 60.dp.roundToPx()) {
                            placeable.place(0, -60.dp.roundToPx())
                        }
                    }
                    .background(
                        color = Color(0xffFEFEFE),
                        shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                    )
                    .padding(horizontal = 40.dp)

            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.heart_icon),
                    contentDescription = "",
                    tint = Color(0xffFF7074),
                    modifier = Modifier
                        .offset(y = (-23).dp)
                        .shadow(
                            elevation = 0.3.dp,
                            shape = RoundedCornerShape(15.dp),
                            clip = true
                        )
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(15.dp)
                        )
                        .size(45.dp)
                        .padding(10.dp)
                        .align(Alignment.End).clickable {  }

                )

                Text(
                    text = stringResource(R.string.strawberry_wheel),
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontFamily = INTER_FONT,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFF7074),
                    )
                )

                Spacer(Modifier.height(33.dp))

                Text(
                    text = stringResource(R.string.about_gonut),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = INTER_FONT,
                        fontWeight = FontWeight(500),
                        color = Color(0xCC000000),
                    )
                )

                Spacer(Modifier.height(16.dp))

                Text(
                    text = stringResource(R.string.wheel_donut_description),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = INTER_FONT,
                        fontWeight = FontWeight(400),
                        color = Color(0x99000000),
                        letterSpacing = 0.7.sp,
                    )
                )

                Spacer(Modifier.height(26.dp))

                Text(
                    text = stringResource(R.string.quantity),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = INTER_FONT,
                        fontWeight = FontWeight(500),
                        color = Color(0xCC000000),
                    )
                )

                Spacer(Modifier.height(19.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Box(
                        modifier = Modifier.clickable {}
                    ) {
                        QuantityComponent(
                            backgroundColor = Color.White,
                            content = "-",
                            contentColor = Color.Black
                        )
                    }
                    QuantityComponent(
                        backgroundColor = Color.White,
                        content = "1",
                        contentColor = Color.Black
                    )
                    Box(
                        modifier = Modifier.clickable {}
                    ) {
                        QuantityComponent(
                            backgroundColor = Color.Black,
                            content = "+",
                            contentColor = Color.White
                        )
                    }
                }

                Spacer(Modifier.height(47.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(26.dp)
                ) {
                    Text(
                        text = "£16",
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontFamily = INTER_FONT,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF000000),
                        )
                    )

                    DonutsButton(
                        onClick = {},
                        backgroundColor = Color(0xFFFF7074),
                        contentColor = Color.White,
                        modifier = Modifier
                            .weight(1f)
                            .height(67.dp),
                    ) {
                        Text(
                            text = "Add to Cart",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = INTER_FONT,
                                fontWeight = FontWeight(600),
                                color = Color(0xFFFFFFFF),
                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun QuantityComponent(
    backgroundColor: Color,
    content: String,
    contentColor: Color
) {
    Box(
        modifier = Modifier
            .shadow(2.dp, shape = RoundedCornerShape(15.dp))
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(15.dp)
            )
            .size(45.dp)
    ) {
        Text(
            text = content,
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = INTER_FONT,
                fontWeight = FontWeight(500),
                color = contentColor,
            ),
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@BasePreview
@Composable
fun PreviewAddToCartScreen() {
    DetailScreen()
}