package com.example.jetpackcomposethechance.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.ui.theme.BlackTextTitle
import com.example.jetpackcomposethechance.ui.theme.DetailsCardColor
import com.example.jetpackcomposethechance.ui.theme.GrayText5E
import com.example.jetpackcomposethechance.ui.theme.GrayText99
import com.example.jetpackcomposethechance.ui.theme.GrayTextNormal
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS
import com.example.jetpackcomposethechance.ui.theme.Lemon
import com.example.jetpackcomposethechance.ui.theme.Pink
import com.example.jetpackcomposethechance.ui.theme.Pink80

@Composable
fun AccountColoredCard(
    modifier: Modifier = Modifier,
    iconResource: Int,
    valueResource: Int,
    descriptionResource: Int,
    cardColor: Color,
) {
    Row(
        modifier = modifier
            .background(cardColor, RoundedCornerShape(12.dp)),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(iconResource),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 12.dp)
                .size(40.dp)
        )


        Column(
            modifier = Modifier.padding(start = 10.dp).weight(1f)
        ) {
            Text(
                text = stringResource(valueResource),
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 16.sp,
                    fontFamily = IBM_PLEX_SANS,
                    fontWeight = FontWeight.Bold,
                    color = Color(0x99121212),
                    textAlign = TextAlign.Center,
                )
            )

            Text(
                text =
                    stringResource(descriptionResource),
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 12.sp,
                    fontFamily = IBM_PLEX_SANS,
                    fontWeight = FontWeight.Medium,
                    color = Color(0x5E121212),
                    textAlign = TextAlign.Center,
                )
            )
        }
    }
//    Row(
//        modifier = modifier
//            .wrapContentWidth()
//            .background(cardColor, RoundedCornerShape(12.dp))
//            .padding(12.dp),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center
//    ) {
//        Image(
//            painter = painterResource(iconResource),
//            contentDescription = "",
//        )
//        Spacer(modifier = Modifier.width(4.dp))
//        Column {
//            Text(
//                text = stringResource(valueResource),
//                color = GrayText99,
//                fontFamily = IBM_PLEX_SANS,
//                fontWeight = FontWeight.Bold,
//                fontSize = 16.sp,
//                modifier = Modifier.padding(end = 2.dp)
//            )
//
//            Text(
//                text = stringResource(descriptionResource),
//                color = GrayText5E,
//                fontFamily = IBM_PLEX_SANS,
//                fontWeight = FontWeight.Normal,
//                fontSize = 12.sp
//            )
//        }
//    }
}

@BasePreview
@Composable
fun AccountColoredCardPreview() {
    AccountColoredCard(
        iconResource = R.drawable.chase,
        valueResource = R.string.view_all,
        descriptionResource = R.string.sport_tom,
        cardColor = Lemon,
    )
}