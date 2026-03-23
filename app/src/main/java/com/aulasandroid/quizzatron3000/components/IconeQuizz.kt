package com.aulasandroid.quizzatron3000.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.aulasandroid.quizzatron3000.R

@Composable
fun ImagemQuizzLogo(modifier: Modifier = Modifier, sizeImage: Dp) {
    Image(
        painter = painterResource(R.drawable.quiz),
        contentDescription = "Icone de quizz",
        modifier = modifier.size(sizeImage),
    )
}
