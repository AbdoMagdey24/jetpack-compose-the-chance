package com.example.jetpackcomposethechance.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.ui.theme.MainBlue

@Composable
fun NotificationIcon(
    count: Int,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.size(40.dp)) {
        Image(
            painter = painterResource(R.drawable.notification),
            contentDescription = "Notifications",
            modifier = Modifier
                .fillMaxSize()
                .border(1.dp, Color.Gray, RoundedCornerShape(12.dp))
                .padding(8.dp)
        )

        if (count > 0) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 4.dp, y = -5.dp)
                    .size(16.dp)
                    .background(color = MainBlue, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = count.toString(),
                    color = Color.White,
                    fontSize = 10.sp
                )
            }
        }
    }
}

@BasePreview
@Composable
fun PreviewNotification() {
    NotificationIcon(count = 3)
}
