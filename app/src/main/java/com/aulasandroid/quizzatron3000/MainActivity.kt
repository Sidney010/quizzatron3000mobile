package com.aulasandroid.quizzatron3000

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aulasandroid.quizzatron3000.screens.HomeScreen
import com.aulasandroid.quizzatron3000.screens.QuestionarioScreen
import com.aulasandroid.quizzatron3000.ui.theme.Quizzatron3000Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Quizzatron3000Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // HomeScreen()
                    QuestionarioScreen()

                }
            }
        }
    }
}
