package com.example.jetpackcomposethechance.composables.dounts


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R

@Composable
fun BottomNavBar(
    modifier : Modifier = Modifier
) {
    NavigationBar(
        containerColor = Color(0xffECECEC),
        modifier = modifier
            .padding(bottom = 38.dp, start = 40.dp, end = 40.dp)
            .height(35.dp),
        windowInsets = WindowInsets(0)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.home),
                    contentDescription = "Home icon",
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .size(35.dp),

                    )
            },
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterVertically) ,
            alwaysShowLabel = false,
            colors = NavigationBarItemColors(
                selectedIconColor = Color(0xffFF7074),
                selectedTextColor = Color(0xffFF7074),
                selectedIndicatorColor = Color.Transparent,
                unselectedIconColor = Color.Black,
                unselectedTextColor = Color.Black,
                disabledIconColor = Color.Gray,
                disabledTextColor = Color.Gray
            )
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.heart),
                    contentDescription = "Home icon",
                    tint = Color(0xffFF7074),
                    modifier = Modifier.padding(end = 10.dp)
                )
            },
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterVertically) ,
            alwaysShowLabel = false,
            colors = NavigationBarItemColors(
                selectedIconColor = Color(0xffFF7074),
                selectedTextColor = Color(0xffFF7074),
                selectedIndicatorColor = Color.Transparent,
                unselectedIconColor = Color.Black,
                unselectedTextColor = Color.Black,
                disabledIconColor = Color.Gray,
                disabledTextColor = Color.Gray
            )
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.notification),
                    contentDescription = "Home icon",
                    tint = Color(0xffFF7074),
                    modifier = Modifier.padding(end = 10.dp)
                )
            },
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterVertically) ,
            alwaysShowLabel = false,
            colors = NavigationBarItemColors(
                selectedIconColor = Color(0xffFF7074),
                selectedTextColor = Color(0xffFF7074),
                selectedIndicatorColor = Color.Transparent,
                unselectedIconColor = Color.Black,
                unselectedTextColor = Color.Black,
                disabledIconColor = Color.Gray,
                disabledTextColor = Color.Gray
            )
        )

        BadgedBox(
            badge = {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .offset(x = (-20).dp)
                        .width(11.dp)
                        .height(11.dp)
                        .border(width = 1.dp, color = Color(0xffECECEC))
                        .padding(1.dp)
                        .background(color = Color(0xFFFE554A), shape = RoundedCornerShape(100.dp))
                ) {
                    Text(
                        text = "2",
                        style = TextStyle(
                            fontSize = 6.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.dount_cart),
                    contentDescription = "Home icon",
                    tint = Color(0xffFF7074),
                    modifier = Modifier.padding(end = 10.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(start = 7.dp)
                ){
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.bottom_nav_bar_stroke),
                        contentDescription = "stroke icon",
                        tint = Color(0xffFF7074),
                        modifier = Modifier.padding(end = 10.dp)
                    )

                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.bottom_nav_bar_stroke),
                        contentDescription = "stroke icon",
                        tint = Color(0xffFF7074),
                        modifier = Modifier.padding(end = 10.dp)
                    )
                }
            }

        }


        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.person),
                    contentDescription = "Home icon",
                    tint = Color(0xffFF7074),
                    modifier = Modifier.padding(end = 10.dp)
                )
            },
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterVertically) ,
            alwaysShowLabel = false,
            colors = NavigationBarItemColors(
                selectedIconColor = Color(0xffFF7074),
                selectedTextColor = Color(0xffFF7074),
                selectedIndicatorColor = Color.Transparent,
                unselectedIconColor = Color.Black,
                unselectedTextColor = Color.Black,
                disabledIconColor = Color.Gray,
                disabledTextColor = Color.Gray
            )
        )
    }
}