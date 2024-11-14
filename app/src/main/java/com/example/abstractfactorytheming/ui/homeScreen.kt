package com.example.abstractfactorytheming.ui

import CustomAppText
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farouk.androidtask.art_core.components.CustomAppButton

@Composable
fun HomeScreen(){
    Column(verticalArrangement = Arrangement.SpaceEvenly , horizontalAlignment = Alignment.CenterHorizontally ,modifier = Modifier.fillMaxWidth().padding(50.dp)) {
        Spacer(Modifier.height(250.dp))
        CustomAppText( text = "This is a sample for applying Android Compose theming with abstract factory pattern", textAlign = TextAlign.Center,
             fontSize = 20f , maxLines = 4)
        Spacer(Modifier.height(250.dp))
        CustomAppButton(text = "button example")
    }
}