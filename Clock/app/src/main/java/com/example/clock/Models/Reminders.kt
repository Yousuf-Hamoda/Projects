package com.example.clock.Models

import androidx.compose.runtime.MutableState
import java.time.LocalDateTime

data class Reminders(
    val id: Int,
    var name: String,
    var time: LocalDateTime?,
    var zone: String,
    var toggled: MutableState<Boolean>,
    var repeate: Boolean,
    var days: List<String>?,
    var place: String?
 )
