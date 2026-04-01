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
import com.aulasandroid.quizzatron3000.screens.LoginScreen
import com.aulasandroid.quizzatron3000.screens.LoginScreenViewModel
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
                        startDestination = "login",
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
                        },

                    ) {
                    composable(
                            route = "login",
                            exitTransition = {
                                slideOutOfContainer(
                                    towards = AnimatedContentTransitionScope
                                        .SlideDirection.Left,
                                    animationSpec = tween(1000)
                                ) + fadeOut( animationSpec = tween(1000))
                            }

                        ) {
                            LoginScreen(
                                navController = navController,
                                loginScreenViewModel = LoginScreenViewModel()
                            )
                        }
                        composable(
                            route = "home/{nome}",
                            arguments = listOf(
                                navArgument(name ="nome"){
                                    type = NavType.StringType
                                },
                            ),
                            exitTransition = {
                                slideOutOfContainer(
                                    towards = AnimatedContentTransitionScope
                                        .SlideDirection.Left,
                                    animationSpec = tween(1000)
                                ) + fadeOut( animationSpec = tween(1000))
                            }
                        ) {
                            val nome = it.arguments?.getString("nome")
                            HomeScreen(
                                navController = navController,
                                nome = nome!!,
                            )
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
                        composable(
                            route = "resultado/{pontos}",
                            arguments = listOf(navArgument("pontos") { type = NavType.IntType })
                        ) {
                            val pontos = it.arguments?.getInt("pontos") ?: 0
                            ResultadoScreen(navController = navController, totalAcertos = pontos)
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
