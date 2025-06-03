package com.example.jetpackcomposethechance

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposethechance.data.rateList
import com.example.jetpackcomposethechance.screens.JerryStoreScreen
import com.example.jetpackcomposethechance.screens.RateCards
import com.example.jetpackcomposethechance.screens.TomAccountScreen
import com.example.jetpackcomposethechance.screens.TomKitchenScreen
import com.example.jetpackcomposethechance.ui.theme.JetpackComposeTheChanceTheme
import com.example.jetpackcomposethechance.ui.theme.MainBlue

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            JetpackComposeTheChanceTheme {
                Scaffold {
                    JerryStoreScreen(2)
                    //TomAccountScreen()
                }
            }
        }
    }
}

