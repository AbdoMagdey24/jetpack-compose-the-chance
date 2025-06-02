package com.example.jetpackcomposethechance.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposethechance.R
import com.example.jetpackcomposethechance.data.AccountSettingsItem
import com.example.jetpackcomposethechance.data.tomSettingsList
import com.example.jetpackcomposethechance.ui.theme.TitleColor

@Composable
fun TitledList(
    modifier: Modifier = Modifier,
    title: String,
    listItems: List<AccountSettingsItem>
){
    Column(
        modifier = modifier
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = title,
            color = TitleColor,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            listItems.forEach { item ->
                TextWithIcon(
                    iconResource = item.icon,
                    text = stringResource(item.contentResource)
                )
            }
        }
    }
}

@BasePreview
@Composable
fun pe(){
    TitledList(
        title = stringResource(R.string.settings),
        listItems =  tomSettingsList
    )
}