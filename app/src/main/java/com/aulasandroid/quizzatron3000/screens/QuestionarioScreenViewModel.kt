package com.aulasandroid.quizzatron3000.screens

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.aulasandroid.quizzatron3000.bancoDeQuestoes.BancoDeQuestoes

class QuestionarioScreenViewModel : ViewModel() {
    var respondido = mutableStateOf(false)
    var indiceAtual = mutableIntStateOf(0) // Mude de mutableStateOf para mutableIntStateOf
    var alternativaSelecionadaIndex = mutableIntStateOf(-1)
    var totalAcertos = mutableIntStateOf(0)
    val listaQuestoes = BancoDeQuestoes.lista
    val questaoAtual get() = listaQuestoes[indiceAtual.value]

    fun conferirResposta(index: Int) {
        alternativaSelecionadaIndex.value = index
        respondido.value = true
        if (questaoAtual.alternativas[index].correta) {
            totalAcertos.value++
        }
    }

    fun proximaPergunta(onFinalizado: (Int) -> Unit) {
        if (indiceAtual.value < listaQuestoes.lastIndex) {
            indiceAtual.value++
            respondido.value = false
            alternativaSelecionadaIndex.value = -1
        } else {
            onFinalizado(totalAcertos.value)
        }
    }
}