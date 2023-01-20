package com.project.aiohelp

sealed class Screen(val route: String) {
    object SetupScreen : Screen("SetupScreen")
    object WorkerForm : Screen("WorkerForm")
    object UserForm : Screen("UserForm")
    object UserMain : Screen("UserMain")
    object WorkerList : Screen("WorkerList")
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach {arg->
                append("/$arg")
            }
        }
    }
}
