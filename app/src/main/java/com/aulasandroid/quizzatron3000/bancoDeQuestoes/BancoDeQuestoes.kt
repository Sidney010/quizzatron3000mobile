package com.aulasandroid.quizzatron3000.bancoDeQuestoes

object BancoDeQuestoes {
    data class QuestaoModel(
        val enunciado: String,
        val alternativas: List<AlternativaModel>
    )

    data class AlternativaModel(
        val texto: String,
        val correta: Boolean = false
    )

    val lista = listOf(
        QuestaoModel(
            enunciado = "Qual é a capital da França?",
            alternativas = listOf(
                AlternativaModel("Londres"),
                AlternativaModel("Berlim"),
                AlternativaModel("Paris", true),
                AlternativaModel("Madri")
            )
        ),
        QuestaoModel(
            enunciado = "Qual é a capital do Brasil?",
            alternativas = listOf(
                AlternativaModel("Rio de Janeiro"),
                AlternativaModel("Brasília", true),
                AlternativaModel("São Paulo"),
                AlternativaModel("Salvador")
            )
        )
    )
}