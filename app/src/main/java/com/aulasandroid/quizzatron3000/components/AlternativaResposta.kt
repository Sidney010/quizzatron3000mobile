package com.aulasandroid.quizzatron3000.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AltertivaResposta(
    alternativaTexto: String = "",
    onClick: () -> Unit,
    corFundo: Color = Color.White,

) {

    Card(
        modifier = Modifier
            .padding(16.dp,0.dp)
            .fillMaxWidth()
            .height(50.dp),
        border = BorderStroke(1.dp, Color(159, 159, 159, 255)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
            pressedElevation = 4.dp
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = corFundo),
            contentAlignment = Alignment.Center
        ){

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                OutlinedButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { onClick()
                    },
                    border = null,
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "$alternativaTexto",
                            textAlign = TextAlign.Start,
                            fontSize = 18.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Normal

                        )
                    }

                }

            }
        }
    }
}