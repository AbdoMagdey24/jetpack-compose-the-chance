package com.example.jetpackcomposethechance.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.ui.theme.DetailsCardColor
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS
import com.example.jetpackcomposethechance.ui.theme.MainBlue
import com.example.jetpackcomposethechance.ui.theme.PriceCardColor

@Composable
fun PriceCard(
    iconResource: Int = R.drawable.mone_bocket,
    discount: Int? = null,
    price: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .wrapContentWidth()
            .background(DetailsCardColor, RoundedCornerShape(8.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(iconResource),
            contentDescription = "money"
        )
        Spacer(modifier = Modifier.width(4.dp))
        discount?.let {
            BlueText(
                blueText = discount.toString(),
                isStrikethrough = true
            )
            Spacer(modifier = Modifier.width(4.dp))
        }
        BlueText(blueText = price.toString())
        Spacer(modifier = Modifier.width(4.dp))
        BlueText(blueText = stringResource(R.string.cheese))

    }

}

@Composable
fun BlueText(
    blueText: String,
    isStrikethrough: Boolean = false,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = blueText,
        color = MainBlue,
        fontFamily = IBM_PLEX_SANS,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        style = if (isStrikethrough) {
            TextStyle(textDecoration = TextDecoration.LineThrough)
        } else {
            TextStyle.Default
        }
    )
}

@BasePreview
@Composable
fun PreviewPriceCard() {
    PriceCard(
        iconResource = R.drawable.mone_bocket,
        price = 3,
        discount = 2
    )
}