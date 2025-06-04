package com.example.jetpackcomposethechance.composables.tom_and_jerry

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS

@Composable
fun TextWithIcon(
    modifier: Modifier = Modifier,
    iconResource: Int,
    text: String,
    textColor: Color = Color.Black,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 16.sp,
){
    Row(
        modifier = modifier
            .wrapContentWidth(),
          //  .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(iconResource),
            contentDescription = "money"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            modifier = Modifier,
            text = text,
            color = textColor,
            fontFamily = IBM_PLEX_SANS,
            fontWeight = fontWeight,
            fontSize = fontSize,
        )
    }
}