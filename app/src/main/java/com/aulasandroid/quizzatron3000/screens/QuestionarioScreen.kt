package com.aulasandroid.quizzatron3000.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.aulasandroid.quizzatron3000.components.ImagemQuizzLogo

@Composable
fun QuestionarioScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(Color(250, 74, 247, 2))
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ImagemQuizzLogo(modifier = Modifier, sizeImage = 50.dp)
        Card() { }
        Card() { }
    }
    
}