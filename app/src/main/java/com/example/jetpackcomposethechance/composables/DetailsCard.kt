package com.example.jetpackcomposethechance.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.ui.theme.DetailsCardColor
import com.example.jetpackcomposethechance.ui.theme.GrayText5E
import com.example.jetpackcomposethechance.ui.theme.GrayText99
import com.example.jetpackcomposethechance.ui.theme.MainBlue

@Composable
fun DetailsCard(
    modifier: Modifier = Modifier,
    iconResource: Int,
    iconColor: Color= MainBlue,
    backGroundColor: Color = DetailsCardColor,
    title: String,
    value: String
) {
    Column(
        modifier = modifier
            .background(backGroundColor, RoundedCornerShape(12.dp))
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            modifier = Modifier.padding(top = 12.dp),
            painter = painterResource(iconResource),
            tint = iconColor,
            contentDescription = ""
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = value,
            fontSize = 14.sp,
            color = GrayText99,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = title,
            fontSize = 12.sp,
            color = GrayText5E
        )
    }
}