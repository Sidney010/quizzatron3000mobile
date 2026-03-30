package com.aulasandroid.quizzatron3000.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.aulasandroid.quizzatron3000.components.ConteinerTitulo
import com.aulasandroid.quizzatron3000.components.ImagemQuizzLogo
import com.aulasandroid.quizzatron3000.components.Questao

@Composable
fun QuestionarioScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    viewModel: QuestionarioScreenViewModel = viewModel()
) {
    Column(
        modifier = Modifier
            .background(Color(0xFFE98CB5))
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ImagemQuizzLogo(modifier = Modifier, sizeImage = 50.dp)
        ConteinerTitulo(
            numeroPergunta = viewModel.indiceAtual.intValue + 1,
            numeroTotalPergunta = viewModel.listaQuestoes.size
        )
        Questao(
            viewModel = viewModel,
            onFinalizado = { pontos ->
                navController.navigate("resultado/$pontos")
            }
        )
    }


}