package com.example.jetpackcomposethechance.composables.tom_and_jerry

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.ui.theme.GrayTextNormal
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS

@Composable
fun SearchBar(
    searchPlaceHolder: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(12.dp))
            .padding(12.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.search_normal),
            contentDescription = ""
        )

        Text(
            text = searchPlaceHolder,
            fontSize = 14.sp,
            fontFamily = IBM_PLEX_SANS,
            fontWeight = FontWeight.Normal,
            color = GrayTextNormal,
            modifier = Modifier
                .padding(start = 8.dp)
        )
    }
}

@BasePreview
@Composable
fun SearchBarCompose() {
    SearchBar(stringResource(R.string.search_placeholder))
}