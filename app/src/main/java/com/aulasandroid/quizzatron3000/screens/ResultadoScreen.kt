package com.aulasandroid.quizzatron3000.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.aulasandroid.quizzatron3000.components.ButtonJogar
import com.aulasandroid.quizzatron3000.components.ConteinerTitulo
import com.aulasandroid.quizzatron3000.components.ImagemQuizzLogo

@Composable
fun ResultadoScreen(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = Modifier
            .background(Color(255, 255, 255, 0))
            .fillMaxSize()
            .padding(0.dp,32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        ImagemQuizzLogo(modifier = Modifier, sizeImage = 50.dp)
        Spacer(modifier = Modifier.height(2.dp))
        Column(
            modifier = Modifier
                .background(Color(0xFF86D5F4))
                .fillMaxWidth()
                .height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ConteinerTitulo(conteudoTitulo = "Bom Trabalho!")
            Text(
                text = "Você acertou 1 de 3 perguntas",
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        ButtonJogar(
            conteudoTexto = "JOGAR NOVAMENTE!",
            color = Color.Yellow,
            largura = 280.dp,
            altura = 60.dp,
            sizeConteudo = 20.sp,
            navController = navController
        )

    }
}