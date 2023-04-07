package com.rob.calorytracker.navigation

import androidx.navigation.NavController
import com.rob.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}