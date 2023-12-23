package com.example.gdsc_app.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gdsc_app.SplashScreen1
import com.example.gdsc_app.SplashScreen2
import com.example.gdsc_app.SplashScreen3


@Composable
fun AppNavigation(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = "splashScreen1"
    ){
        // routes
        composable("screen1")
        {
            SplashScreen1(navController)
        }
        composable("splashScreen2")
        {
            SplashScreen2(navController)
        }
        composable("screen3")
        {
            SplashScreen3(navController)
        }
        composable("login")
        {
            LoginForm(navController)
        }
        composable("signup")
        {
            SignUpForm(navController)
        }


    }
}