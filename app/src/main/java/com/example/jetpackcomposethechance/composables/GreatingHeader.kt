package com.example.jetpackcomposethechance.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.ui.theme.BlackTextTitle
import com.example.jetpackcomposethechance.ui.theme.GrayTextNormal
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS

@Composable
fun GreatingHeader(
    modifier: Modifier = Modifier,
    message: String,
    question: String
) {
    Column {
        Text(
            text = message,
            color = BlackTextTitle,
            fontFamily = IBM_PLEX_SANS,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            modifier = Modifier.padding(end = 2.dp)
        )

        Text(
            text = question,
            color = GrayTextNormal,
            fontFamily = IBM_PLEX_SANS,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
        )
    }
}

@BasePreview
@Composable
fun PreviewHeader() {
    GreatingHeader(
        message = stringResource(R.string.greating_jerry),
        question = stringResource(R.string.which_tom)
    )
}