package com.example.jetpackcomposethechance.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS
import com.example.jetpackcomposethechance.ui.theme.MainBlue
import com.example.jetpackcomposethechance.ui.theme.PriceCardColor

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
            .wrapContentWidth()
            .padding(12.dp),
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