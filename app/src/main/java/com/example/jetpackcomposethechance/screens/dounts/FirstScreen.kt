package com.example.jetpackcomposethechance.screens.dounts

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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.composables.tom_and_jerry.BasePreview

@Composable
fun DountsFisrtScreen() {
    Box(modifier = Modifier)
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffFED8DF))
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.donut1),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
                        .height(
                            LocalConfiguration.current.screenWidthDp.dp * 0.4f
                        )
                )

                Image(
                    painter = painterResource(R.drawable.donut2),
                    contentDescription = "",
                    modifier = Modifier
                        .width(LocalConfiguration.current.screenWidthDp.dp * 0.6f)
                        .align(Alignment.Bottom)
                        .height(
                            LocalConfiguration.current.screenWidthDp.dp * 0.4f
                        )
                        .padding(top = 35.dp, end = 35.dp)
                        .offset(y = LocalConfiguration.current.screenHeightDp.times(0.05).dp)
                )
            }

            Image(
                painter = painterResource(R.drawable.donuts),
                contentDescription = "",
                modifier = Modifier
                    .requiredWidth(LocalConfiguration.current.screenWidthDp.dp + 272.dp)
                    .rotate(
                        16.18f
                    )
                    .padding(start = 35.dp)
            )

            Image(
                painter = painterResource(R.drawable.pink_donut),
                contentDescription = "donut",
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .align(Alignment.Start)
                    .height(
                        LocalConfiguration.current.screenWidthDp.dp * 0.15f
                    )
                    .offset(y = LocalConfiguration.current.screenHeightDp.dp * -0.1f)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(R.string.gonuts_with_donuts),
                    style = TextStyle(
                        fontSize = 54.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFF7074),
                    ),
                    modifier = Modifier.padding(start = 40.dp, top = 32.dp)
                )

                Image(
                    painter = painterResource(R.drawable.donut4),
                    contentDescription = "donut",
                    modifier = Modifier
                        .height(
                            LocalConfiguration.current.screenWidthDp.dp * 0.4f
                        )
                        .offset(x = LocalConfiguration.current.screenHeightDp.dp * 0.07f)
                        .rotate(8.61f),
                    contentScale = ContentScale.Fit
                )
            }

            Text(
                text = stringResource(R.string.gonuts_with_donuts_desc),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFF9494),
                ),
                modifier = Modifier.padding(start = 40.dp, top = 19.dp, end = 40.dp)
            )

            Spacer(Modifier.weight(1f))

            DonutsButton(
                onClick = {},
                backgroundColor = Color.White,
                contentColor = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 46.dp, start = 40.dp, end = 40.dp, top = 12.dp)
                    .align(Alignment.End)
            ){
                Text(
                    text = stringResource(R.string.get_started_button),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight(600),
                    )
                )
            }
        }
    }
}

@Composable
fun DonutsButton(
    onClick: () -> Unit,
    backgroundColor: Color,
    contentColor: Color,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(50.dp),
        colors = ButtonColors(
            containerColor = backgroundColor,
            contentColor = contentColor,
            disabledContainerColor = backgroundColor,
            disabledContentColor = contentColor
        ),
        contentPadding = PaddingValues(vertical = 22.dp),
        modifier = modifier
    ) {
        content()
    }
}

@BasePreview
@Composable
fun MyScreenPreview() {
    DountsFisrtScreen()
}