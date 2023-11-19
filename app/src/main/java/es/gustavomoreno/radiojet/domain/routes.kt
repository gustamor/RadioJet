package es.gustavomoreno.radiojet.domain

sealed class Routes (val route: String){
    object PlayerScreen:Routes("playerScreen")

}