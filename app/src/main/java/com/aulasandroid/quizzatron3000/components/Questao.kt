package com.aulasandroid.quizzatron3000.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.aulasandroid.quizzatron3000.bancoDeQuestoes.BancoDeQuestoes
import com.aulasandroid.quizzatron3000.screens.QuestionarioScreenViewModel

@Composable
fun Questao(
    modifier: Modifier = Modifier,
    indiceQuestao: Int = 0,
    viewModel: QuestionarioScreenViewModel = viewModel()
) {
    val questoes = BancoDeQuestoes.lista


    val questao = questoes[indiceQuestao]

    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(350.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
            pressedElevation = 4.dp
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = questao.enunciado,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(20.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {

                    questao.alternativas.forEach { alternativa ->
                        AltertivaResposta(
                            alternativaTexto = alternativa.texto,
                            pontuacaoFalsaOuVerdadeira = alternativa.correta,
                            onClick = {   viewModel.proximaPergunta()}
                        )
                    }

                }
            }

        }
    }
}