package com.aulasandroid.quizzatron3000.screens

import android.R.attr.contentDescription
import android.R.attr.onClick
import android.R.attr.text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.quizzatron3000.R
import com.aulasandroid.quizzatron3000.components.CaixaDeEntrada
import com.aulasandroid.quizzatron3000.components.ImagemQuizzLogo

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp,32.dp,32.dp,50.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)

        ) {
            ImagemQuizzLogo(
            modifier = Modifier,
            sizeImage = 50.dp
            )
            Text(
                text = "Quizzatron 100"
            )
            CaixaDeEntrada(
                label = "Nome",
                placeholder = "Qual é o seu nome?",
                keyboardType = KeyboardType.Email,
                modifier = Modifier.fillMaxWidth(),
                value = "",
                corTema = Color(255,255,255),
                atualizarValor = {
                }
            )

            Image(
                modifier = Modifier.height(200.dp),
                painter = painterResource(R.drawable.outline_energy_program_saving_24),
                contentDescription = "Image",
            )

            Button(
                modifier = Modifier.padding(80.dp,12.dp).fillMaxWidth().height(40.dp),
                onClick = {
                    /*TODO*/
                }
            ) {
                Text(
                    color = Color.White,
                    text = "ENTRAR"
                )
            }
        }

        Row(
            modifier = Modifier
        ) {
            Text(
                text = "Versão 1.0",
                fontWeight = FontWeight.Light,
                fontSize = 12.sp
            )
            Text(
                text = " | Sidney Campos Aragão | ",
                fontWeight = FontWeight.Light,
                fontSize = 12.sp
            )
            LinkedinLink()
        }

    }
}

@Composable
fun LinkedinLink() {
    val annotatedString = buildAnnotatedString {

        pushStringAnnotation(tag = "URL", annotation = "https://www.linkedin.com/in/sidney-campos-aragão")

        withStyle(style = SpanStyle(
            color = Color(0xFF0A66C2),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp
        )) {
            append("linkedin@")
        }

        pop()
    }
    val uriHandler = LocalUriHandler.current

    ClickableText(
        text = annotatedString,
        onClick = { offset ->
            // Verifica se o usuário clicou exatamente na parte com a tag "URL"
            annotatedString.getStringAnnotations(tag = "URL", start = offset, end = offset)
                .firstOrNull()?.let { annotation ->
                    uriHandler.openUri(annotation.item) // Abre o link no navegador
                }
        }
    )
}