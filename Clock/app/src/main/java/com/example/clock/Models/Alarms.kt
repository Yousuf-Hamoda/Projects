package com.example.clock.Models
import androidx.compose.runtime.MutableState
import java.time.LocalDate

data class Alarm(
    val id: Int,
    var name: String,
    var hours: Int,
    var minutes: Int,
    var zone: String,
    var toggled: MutableState<Boolean>,
    var repeate: Boolean,
    var preAlarm: Boolean,
    var days: List<String>?,
    var date: LocalDate?
)


