package com.aulasandroid.quizzatron3000

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.aulasandroid.quizzatron3000.screens.HomeScreen
import com.aulasandroid.quizzatron3000.screens.QuestionarioScreen
import com.aulasandroid.quizzatron3000.screens.ResultadoScreen
import com.aulasandroid.quizzatron3000.ui.theme.Quizzatron3000Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Quizzatron3000Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "home",
                        exitTransition =  {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope
                                    .SlideDirection.Left,
                                animationSpec = tween(1000)
                            )
                        },
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope
                                    .SlideDirection.Left,
                                animationSpec = tween(1000)
                            )
                        }
                    ) {
                        composable(
                            route = "home",
                            exitTransition = {
                                slideOutOfContainer(
                                    towards = AnimatedContentTransitionScope
                                        .SlideDirection.Left,
                                    animationSpec = tween(1000)
                                ) + fadeOut( animationSpec = tween(1000))
                            }
                        ) {
                            HomeScreen(navController = navController)
                        }
                        composable(
                            route = "questionario",
                            exitTransition = {
                                slideOutOfContainer(
                                    towards = AnimatedContentTransitionScope
                                        .SlideDirection.Left,
                                    animationSpec = tween(1000)
                                ) + fadeOut( animationSpec = tween(1000))
                            }
                        ) {
                            QuestionarioScreen(navController = navController)
                        }
                    }
                    // HomeScreen()
                    // QuestionarioScreen()
                    // ResultadoScreen()


                }
            }
        }
    }
}
