package com.project.aiohelp

sealed class Screen(val route: String) {
    object SetupScreen : Screen("SetupScreen")
    object WorkerForm : Screen("WorkerForm")
    object UserForm : Screen("UserForm")
    object UserMain : Screen("UserMain")
    object WorkerList : Screen("WorkerList")
    object WorkerInfo : Screen("WorkerInfo")
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach {arg->
                append("/$arg")
            }
        }
    }
}
