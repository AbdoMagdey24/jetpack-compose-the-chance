package com.example.jetpackcomposethechance.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.ui.theme.BlackTextTitle
import com.example.jetpackcomposethechance.ui.theme.GrayTextNormal
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS
import com.example.jetpackcomposethechance.ui.theme.MainBlue

@Composable
fun ItemCard(
    itemImageResource: Int,
    itemNameResource: Int,
    itemDescriptionResource: Int,
    discount: Int? = null,
    price: Int,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Card(
            modifier = Modifier
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        ) {
            Spacer(modifier = Modifier.height(92.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxHeight()
            ) {
                Text(
                    text = stringResource(itemNameResource),
                    fontFamily = IBM_PLEX_SANS,
                    fontSize = 18.sp,
                    color = BlackTextTitle,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = stringResource(itemDescriptionResource),
                    fontFamily = IBM_PLEX_SANS,
                    fontSize = 12.sp,
                    color = GrayTextNormal,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    maxLines = 3,
                    lineHeight = 17.sp,
                    modifier = Modifier.padding(top = 4.dp, bottom = 8.dp)
                )

                Spacer(modifier = Modifier.weight(1f))


                Row(
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PriceCard(
                        discount = discount,
                        price = price
                    )

                    Spacer(modifier = Modifier.width(12.dp))
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .border(1.dp, MainBlue, RoundedCornerShape(12.dp))
                            .background(Color.White)
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.add_to_cart_icon),
                            contentDescription = "Add to Cart",
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }


        Image(
            painter = painterResource(itemImageResource),
            contentDescription = "Tom",
            modifier = Modifier
                .width(98.44.dp)
                .height(100.dp)
                .align(Alignment.TopCenter)
                .offset(y = (-16).dp)
        )
    }
}


@BasePreview
@Composable
fun PreviewItemCard() {
    ItemCard(
        itemImageResource = R.drawable.sport_tom,
        itemNameResource = R.string.sport_tom,
        itemDescriptionResource = R.string.sport_tomـdescription,
        discount = 3,
        price = 2
    )
}