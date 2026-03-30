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
        ),
        QuestaoModel(
            enunciado = "Qual o maior planeta do sistema solar?",
            alternativas = listOf(
                AlternativaModel("Marte"),
                AlternativaModel("Saturno"),
                AlternativaModel("Júpiter", true),
                AlternativaModel("Netuno")
            )
        ),
        QuestaoModel(
            enunciado = "Quem pintou a 'Mona Lisa'?",
            alternativas = listOf(
                AlternativaModel("Vincent van Gogh"),
                AlternativaModel("Leonardo da Vinci", true),
                AlternativaModel("Pablo Picasso"),
                AlternativaModel("Salvador Dalí")
            )
        ),
        QuestaoModel(
            enunciado = "Em que ano o homem pisou na Lua pela primeira vez?",
            alternativas = listOf(
                AlternativaModel("1962"),
                AlternativaModel("1969", true),
                AlternativaModel("1972"),
                AlternativaModel("1958")
            )
        ),
        QuestaoModel(
            enunciado = "Qual é o metal cujo símbolo químico é Au?",
            alternativas = listOf(
                AlternativaModel("Prata"),
                AlternativaModel("Alumínio"),
                AlternativaModel("Ouro", true),
                AlternativaModel("Cobre")
            )
        ),
        QuestaoModel(
            enunciado = "Qual oceano banha a costa leste do Brasil?",
            alternativas = listOf(
                AlternativaModel("Oceano Pacífico"),
                AlternativaModel("Oceano Índico"),
                AlternativaModel("Oceano Ártico"),
                AlternativaModel("Oceano Atlântico", true)
            )
        )
    )
}