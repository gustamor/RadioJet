package es.gustavomoreno.radiojet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import es.gustavomoreno.radiojet.domain.Routes
import es.gustavomoreno.radiojet.ui.screens.PlayerScreen.PlayerScreen
import es.gustavomoreno.radiojet.ui.screens.PlayerScreen.PlayerScreenViewModel
import es.gustavomoreno.radiojet.ui.theme.RadioJetTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val playerScreenViewModel: PlayerScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RadioJetTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentColor = Color(0xFF1C1C1C),
                    color = Color(0xFF1C1C1C)
                ) {

                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.PlayerScreen.route,
                    ) {
                        composable(Routes.PlayerScreen.route) {
                            PlayerScreen(
                                navigationController,
                                playerScreenViewModel
                            )
                        }
                    }
                }
            }
        }
    }
}