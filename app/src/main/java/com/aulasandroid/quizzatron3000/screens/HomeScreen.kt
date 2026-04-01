package com.aulasandroid.quizzatron3000.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aulasandroid.quizzatron3000.components.ButtonJogar
import com.aulasandroid.quizzatron3000.components.ImagemQuizzLogo

@Composable
fun HomeScreen(navController: NavController, nome:String = "") {
    Box(
        modifier = Modifier
            .background(Color(0, 188, 212, 255))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            ImagemQuizzLogo(modifier = Modifier, sizeImage = 120.dp)
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "QUIZATRON 3000",
                fontSize = 30.sp
            )
            Text(
                text = "Bem vindo $nome !",
                fontSize = 30.sp
            )
            ButtonJogar(
                conteudoTexto = "COMECAR!",
                color = Color.Yellow,
                largura = 230.dp,
                altura = 50.dp,
                sizeConteudo = 20.sp,
                navController = navController
            )
        }
    }
}