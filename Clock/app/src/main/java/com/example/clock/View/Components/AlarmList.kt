package com.example.clock.View.Components

import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clock.Models.Alarm
import com.example.clock.R
import com.example.clock.ui.theme.LPrimary
import com.example.clock.ui.theme.LSeperation

fun Int.length() = when (this) {
    0 -> 1
    else -> kotlin.math.log10(kotlin.math.abs(toDouble())).toInt() + 1
}

@Preview
@Composable
fun AlarmListPreview() {
    AlarmList(
        alarm = Alarm(
            id = 0,
            name = "My Alarm Name",
            hours = 3,
            minutes = 21,
            zone = "AM",
            toggled = remember { mutableStateOf(true) },
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
        )
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AlarmList(
    alarm: Alarm
) {
    var black: Color
    var primary: Color
    var expanded = remember { mutableStateOf(false) }

    if (alarm.toggled.value) {
        black = Color.Black
        primary = LPrimary
    } else {
        black = LSeperation
        primary = LSeperation
    }

    Box(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.White)
            .combinedClickable(
                onClick = { },
                onLongClick = {
                    expanded.value = !expanded.value
                    Log.d("TAG", expanded.value.toString())
                },
            )


    ) {
        DropdownMenu(
            expanded = expanded.value,
            onDismissRequest = { expanded.value = false }
        ) {
            Divider()
            DropdownMenuItem(
                onClick = {

                }
            ) {
                Text("Settings")
            }

        }

        Box(
            modifier = Modifier
                .wrapContentSize()
                .padding(all = 5.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentSize()
                    ) {
                        Row {
                            var alarmTime: String = ""

                            when {
                                (alarm.hours.length() != 2) && (alarm.minutes.length() != 2) -> {
                                    alarmTime = "0${alarm.hours}:0${alarm.minutes}"
                                }
                                (alarm.hours.length() != 2) && (alarm.minutes.length() == 2) -> {
                                    alarmTime = "0${alarm.hours}:${alarm.minutes}"
                                }
                                (alarm.hours.length() == 2) && (alarm.minutes.length() != 2) -> {
                                    alarmTime = "${alarm.hours}:0${alarm.minutes}"
                                }
                                (alarm.hours.length() == 2) && (alarm.minutes.length() == 2) -> {
                                    alarmTime = "${alarm.hours}:${alarm.minutes}"
                                }
                            }

                            Text(
                                text = alarmTime,
                                fontSize = 34.sp,
                                color = black,
                            )

                            Text(
                                text = alarm.zone,
                                fontSize = 18.sp,
                                color = black,
                                modifier = Modifier
                                    .align(Alignment.Bottom)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(start = 7.dp)
                                .size(width = 220.dp, height = 50.dp)
                                .align(Alignment.Top)
                        ) {
                            var textRepeat: String = ""

                            if (alarm.repeate) {
                                textRepeat = alarm.days!!.joinToString(separator = ", ")
                            } else {
                                textRepeat = alarm.date.toString()
                            }
                            Text(
                                text = textRepeat,
                                fontSize = 12.sp,
                                letterSpacing = 1.sp,
                                color = primary,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                            )

                        }

                    }

                    Text(
                        text = alarm.name,
                        fontSize = 12.sp,
                        color = black,
                        letterSpacing = 1.sp,
                    )
                }

                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .wrapContentSize()
                ) {
                    Switch(
                        checked = alarm.toggled.value,
                        onCheckedChange = { alarm.toggled.value = it },
                        colors = SwitchDefaults.colors(LPrimary),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(35.dp)
                    )

                    if (alarm.toggled.value) {

                    } else {

                    }

                    Image(
                        painter = painterResource(R.drawable.ic_more_horiz),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier
                            .size(35.dp)
                            .clickable {

                            }
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }
}
