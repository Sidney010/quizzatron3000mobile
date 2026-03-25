package com.aulasandroid.quizzatron3000.screens

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.aulasandroid.quizzatron3000.bancoDeQuestoes.BancoDeQuestoes

class QuestionarioScreenViewModel : ViewModel() {

    var indiceAtual = mutableStateOf(0)
        private set

    val listaQuestoes = BancoDeQuestoes.lista

    val questaoAtual
        get() = listaQuestoes[indiceAtual.value]

    fun proximaPergunta() {
        if (indiceAtual.value < listaQuestoes.lastIndex) {
            indiceAtual.value++
        } else {
            // acabou o quiz (pode navegar ou mostrar resultado)
        }
    }
}