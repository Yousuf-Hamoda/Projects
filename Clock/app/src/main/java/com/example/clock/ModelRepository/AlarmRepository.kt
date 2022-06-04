package com.example.clock.ModelRepository

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.example.clock.Models.Alarm
import java.time.LocalDate

class AlarmRepository {
    @RequiresApi(Build.VERSION_CODES.O)
    @Composable
    fun getAllData(): SnapshotStateList<Alarm> {
        return remember {
            mutableStateListOf<Alarm>(
                Alarm(
                    id = 0,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = true,
                    preAlarm = true,
                    days = listOf<String>(
                        "Monday",
                        "Tuesday",
                        "Wednesday",
                        "Thursday",
                        "Friday",
                        "Saturday",
                        "Sunday"
                    ),
                    date = null,
                ),
                Alarm(
                    id = 1,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = true,
                    preAlarm = true,
                    days = listOf<String>(
                        "Monday",
                        "Tuesday",
                        "Wednesday",
                    ),
                    date = null,
                ),
                Alarm(
                    id = 2,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = false,
                    preAlarm = true,
                    days = listOf<String>(
                    ),
                    date = LocalDate.of( 2022, 12 , 21),
                ),
                Alarm(
                    id = 3,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = true,
                    preAlarm = true,
                    days = listOf<String>(
                        "Monday",
                        "Tuesday",
                        "Wednesday",
                        "Thursday",
                        "Friday",
                    ),
                    date = null,
                ),Alarm(
                    id = 4,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = true,
                    preAlarm = true,
                    days = listOf<String>(
                        "Thursday",
                        "Friday",
                        "Saturday",
                        "Sunday"
                    ),
                    date = null,
                ),
                Alarm(
                    id = 5,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = true,
                    preAlarm = true,
                    days = listOf<String>(
                        "Monday",
                        "Tuesday",
                        "Wednesday",
                        "Thursday",
                        "Friday",
                        "Saturday",
                        "Sunday"
                    ),
                    date = null,
                ),
                Alarm(
                    id = 6,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = true,
                    preAlarm = true,
                    days = listOf<String>(
                        "Monday",
                        "Tuesday",
                        "Wednesday",
                    ),
                    date = null,
                ),
                Alarm(
                    id = 7,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = false,
                    preAlarm = true,
                    days = listOf<String>(
                    ),
                    date = LocalDate.of( 2022, 12 , 21),
                ),
                Alarm(
                    id = 8,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = true,
                    preAlarm = true,
                    days = listOf<String>(
                        "Monday",
                        "Tuesday",
                        "Wednesday",
                        "Thursday",
                        "Friday",
                    ),
                    date = null,
                ),Alarm(
                    id = 9,
                    name = "My Alarm Name",
                    hours = 3,
                    minutes = 21,
                    zone = "AM",
                    toggled = mutableStateOf(true),
                    repeate = true,
                    preAlarm = true,
                    days = listOf<String>(
                        "Thursday",
                        "Friday",
                        "Saturday",
                        "Sunday"
                    ),
                    date = null,
                ),
            )
        }
    }
}