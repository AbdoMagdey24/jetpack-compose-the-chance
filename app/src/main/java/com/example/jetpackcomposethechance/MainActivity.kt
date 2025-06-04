package com.example.jetpackcomposethechance

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.example.jetpackcomposethechance.screens.dounts.DetailScreen
import com.example.jetpackcomposethechance.screens.dounts.DonutsHomeScreen
import com.example.jetpackcomposethechance.screens.dounts.DountsFisrtScreen
import com.example.jetpackcomposethechance.screens.tom_and_jerry.JerryStoreScreen
import com.example.jetpackcomposethechance.ui.theme.JetpackComposeTheChanceTheme

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            JetpackComposeTheChanceTheme {
                Scaffold {
                    DountsFisrtScreen()
                    //DonutsHomeScreen()
                    //DetailScreen()
                }
            }
        }
    }
}

