package com.aulasandroid.quizzatron3000.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginScreenViewModel: ViewModel() {
    private val _nomeState = MutableLiveData<String>()
    var nome: LiveData<String> = _nomeState

    fun onNomeChange(novoNome: String) {
        _nomeState.value = novoNome
    }
    private val _senhaState = MutableLiveData<String>()

    var senha: LiveData<String> = _senhaState

    fun onSenhaChange(novaSenha: String) {
        _senhaState.value = novaSenha
    }

}