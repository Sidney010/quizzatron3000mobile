package com.aulasandroid.quizzatron3000.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ButtonJogar(
    modifier: Modifier = Modifier,
    altura: Dp,
    largura:Dp,
    conteudoTexto: String,
    sizeConteudo: TextUnit,
    color: Color,
    navController: NavController
) {
    Button(
        modifier = Modifier
            .width(largura)
            .height(altura),
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            ),
        onClick = { navController.navigate("questionario")},
        shape = RoundedCornerShape(altura),
        border = BorderStroke(width = 1.dp, color = Color.Black)

    ){
        Text(
            fontSize = sizeConteudo,
            text = conteudoTexto,
            color = Color.Black
        )
    }
}