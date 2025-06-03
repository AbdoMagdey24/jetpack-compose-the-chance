package com.example.jetpackcomposethechance.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.composables.BasePreview
import com.example.jetpackcomposethechance.composables.CustomGridCard
import com.example.jetpackcomposethechance.composables.GreatingHeader
import com.example.jetpackcomposethechance.composables.ItemCard
import com.example.jetpackcomposethechance.composables.NotificationIcon
import com.example.jetpackcomposethechance.composables.SearchBar
import com.example.jetpackcomposethechance.composables.ViewAllArrow
import com.example.jetpackcomposethechance.data.tomList
import com.example.jetpackcomposethechance.ui.theme.BlackTextTitle
import com.example.jetpackcomposethechance.ui.theme.IBM_PLEX_SANS
import com.example.jetpackcomposethechance.ui.theme.JetpackComposeTheChanceTheme
import com.example.jetpackcomposethechance.ui.theme.MainBlue
import com.example.jetpackcomposethechance.ui.theme.ScreenColour

@Composable
fun JerryStoreScreen(
    notificationCount: Int,
    //  paddingValues: PaddingValues
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenColour),
    ) {
        item {
            Header(
                profileImageResource = R.drawable.jerry_first_screen,
                greetingMessageResource = R.string.greating_jerry,
                greetingQuestionResource = R.string.which_tom,
                notificationCount = notificationCount
            )
        }

        item {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                SearchBar(
                    searchPlaceHolder = stringResource(R.string.search_placeholder),
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Button(
                    modifier = Modifier
                        .width(48.dp)
                        .height(48.dp),
                    onClick = {},
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MainBlue),
                    contentPadding = PaddingValues(0.dp),
                ) {
                    Image(
                        painter = painterResource(R.drawable.filter),
                        contentDescription = ""
                    )
                }
            }
        }
        item {
            CustomLinearCard(modifier = Modifier.padding(12.dp))
        }
        item {

            Spacer(modifier = Modifier.height(8.dp))


            Row(
                modifier = Modifier.padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(R.string.cheap_section),
                    color = BlackTextTitle,
                    fontFamily = IBM_PLEX_SANS,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f)
                )
                ViewAllArrow()
            }
            Spacer(Modifier.height(16.dp))
        }
        item {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(28.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 0.dp, max = 2000.dp)
                    .padding(horizontal = 12.dp),
                contentPadding = PaddingValues(top = 16.dp, bottom = 12.dp)
            ) {
                items(6) { index ->
                    CustomGridCard(
                        modifier = Modifier
                            .height(220.dp)
                            .fillMaxWidth(),
                        image = painterResource(tomList[index].imageResource),
                        isDiscountApplied = tomList[index].discount != null,
                        title = stringResource(tomList[index].nameResource),
                        description = stringResource(tomList[index].descriptionResource),
                        cheeseCount = tomList[index].price,
                        purchaseIcon = ImageVector.vectorResource(R.drawable.add_to_cart_icon),
                        onPurchaseClick = {}
                    )
                }
            }
        }
    }
}

//        LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(ScreenColour)
//            .padding(paddingValues),
//        contentPadding = PaddingValues(bottom = 16.dp)
//    ) {
//        item {
//            Header(
//                profileImageResource = R.drawable.jerry_first_screen,
//                greetingMessageResource = R.string.greating_jerry,
//                greetingQuestionResource = R.string.which_tom,
//                notificationCount = notificationCount
//            )
//
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 16.dp, vertical = 8.dp),
//                verticalAlignment = Alignment.CenterVertically,
//            ) {
//                SearchBar(
//                    searchPlaceHolder = stringResource(R.string.search_placeholder),
//                    modifier = Modifier.weight(1f)
//                )
//                Spacer(modifier = Modifier.width(8.dp))
//                Button(
//                    modifier = Modifier
//                        .width(48.dp)
//                        .height(48.dp),
//                    onClick = {},
//                    shape = RoundedCornerShape(12.dp),
//                    colors = ButtonDefaults.buttonColors(containerColor = MainBlue),
//                    contentPadding = PaddingValues(0.dp),
//                ) {
//                    Image(
//                        painter = painterResource(R.drawable.filter),
//                        contentDescription = ""
//                    )
//                }
//            }
//
//            CustomLinearCard(modifier = Modifier.padding(16.dp))
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Row(
//                modifier = Modifier.padding(12.dp),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Text(
//                    text = stringResource(R.string.cheap_section),
//                    color = BlackTextTitle,
//                    fontFamily = IBM_PLEX_SANS,
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 20.sp,
//                    modifier = Modifier.weight(1f)
//                )
//                ViewAllArrow()
//            }
//        }
//
//        item {
//            Box(modifier = Modifier.fillMaxSize()) {
//                LazyVerticalGrid(
//                    columns = GridCells.Fixed(2),
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .heightIn(max = 2000.dp),
//                    contentPadding = PaddingValues(16.dp),
//                    verticalArrangement = Arrangement.spacedBy(32.dp),
//                    horizontalArrangement = Arrangement.spacedBy(32.dp)
//                ) {
//                    items(tomList.size) { index ->
//                        ItemCard(
//                            itemImageResource = tomList[index].imageResource,
//                            itemNameResource = tomList[index].nameResource,
//                            itemDescriptionResource = tomList[index].descriptionResource,
//                            discount = tomList[index].discount,
//                            price = tomList[index].price
//                        )
//                    }
//                }
//            }
//        }
//    }
//}


@Composable
fun Header(
    profileImageResource: Int,
    greetingMessageResource: Int,
    greetingQuestionResource: Int,
    notificationCount: Int,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(profileImageResource),
            contentDescription = "jerry",
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp)),
        )
        Spacer(modifier = Modifier.width(12.dp))
        GreatingHeader(
            message = stringResource(greetingMessageResource),
            question = stringResource(greetingQuestionResource),
        )
        Spacer(modifier = Modifier.weight(1f))
        NotificationIcon(notificationCount)
    }
}

@Composable
fun CustomLinearCard(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(top = 24.dp)
            .height(92.dp)
            .fillMaxWidth()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF03446A),
                        Color(0xFF0685D0)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset.Infinite
                ),
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Row(
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White,
                    disabledContainerColor = Color.Transparent,
                    disabledContentColor = Color.White
                )
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .weight(2f)
                ) {
                    Text(
                        text = "Buy 1 Tom and get 2 for free",
                        fontFamily = IBM_PLEX_SANS,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = "Adopt Tom!(Free Fail-Free\nGuarantee)",
                        fontFamily = IBM_PLEX_SANS,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White.copy(alpha = 0.8f),
                        lineHeight = 19.sp
                    )
                }
            }

            Box(
                modifier = Modifier
                    .height(92.dp)
                    .weight(1f),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ellipse_2),
                    contentDescription = "ellipse",
                    modifier = Modifier
                        .offset(x = 29.dp)
                        .requiredWidth(132.05.dp),
                    contentScale = ContentScale.FillWidth
                )

                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ellipse_1),
                    contentDescription = "ellipse",
                    modifier = Modifier
                        .offset(x = 30.dp)
                        .requiredWidth(139.22.dp)
                        .padding(start = 10.dp),
                    contentScale = ContentScale.FillWidth
                )

                Box(
                    modifier = Modifier
                        .offset(y = (-10).dp, x = (23).dp)
                        .requiredHeight(108.dp)
                        .requiredWidth(80.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.offer_tom),
                        contentDescription = "tom",
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    }
}

@BasePreview
@Composable
fun JerryStoreScreenPreivew() {
    JetpackComposeTheChanceTheme {
        //  OfferCard()

        JerryStoreScreen(2)

    }
}