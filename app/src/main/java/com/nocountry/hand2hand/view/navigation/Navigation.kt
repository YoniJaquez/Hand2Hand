package com.nocountry.hand2hand.view.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nocountry.hand2hand.view.screens.HomeScreen
import com.nocountry.hand2hand.view.screens.InformacionPersonalScreen
import com.nocountry.hand2hand.view.screens.LoginScreen
import com.nocountry.hand2hand.view.screens.MiCuentaScreen
import com.nocountry.hand2hand.view.screens.PerfilScreen
import com.nocountry.hand2hand.view.screens.RegisterScreen

@Composable
fun Navigation(context: Context, navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = MainDestinations.LOGIN_ROUTE
    ){
        composable(MainDestinations.REGISTER_ROUTE){
            RegisterScreen(navigation = navController)
        }
        composable(MainDestinations.HOME_ROUTE){
            HomeScreen(navigation = navController)
        }
        composable(MainDestinations.LOGIN_ROUTE){
            LoginScreen(navigation = navController)
        }
        composable(MainDestinations.ACCOUNT_ROUTE){
            PerfilScreen(navigation = navController)
        }
        composable("MiCuenta"){
            MiCuentaScreen(navigation = navController)
        }
        composable("InformacionPersonal"){
            InformacionPersonalScreen(navigation = navController)
        }

    }
}