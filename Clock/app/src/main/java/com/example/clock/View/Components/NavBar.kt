package com.example.clock.View.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clock.ui.theme.LPrimary
import com.example.clock.ui.theme.LSecondary

@Composable
fun NavBar(
    onScreen: Int,
    onClick1: () -> Unit,
    onClick2: () -> Unit,
    onClick3: () -> Unit,
    onClick4: () -> Unit,
) {
    val screen: ArrayList<String> = arrayListOf(
        "ALARMS",
        "REMINDERS",
        "TIMERS",
        "STOPWATCH"
    )

    Box(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(LPrimary)
    ) {
        Box(
            modifier = Modifier
                .padding(vertical = 20.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                if (onScreen == 1) {
                    Text (
                        text = screen[0],
                        color = LSecondary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                } else {
                    Text (
                        text = screen[0],
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .clickable{ onClick1 }
                    )
                }

                Divider(
                    modifier = Modifier
                        .background(Color.White)
                        .align(Alignment.CenterVertically)
                        .size(width = 3.dp, height = 3.dp)
                )

                if (onScreen == 2) {
                    Text(
                        text = screen[1],
                        color = LSecondary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                } else {
                    Text (
                        text = screen[1],
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .clickable{ onClick2 }
                    )
                }

                Divider(
                    modifier = Modifier
                        .background(Color.White)
                        .align(Alignment.CenterVertically)
                        .size(width = 3.dp, height = 3.dp)
                )

                if (onScreen == 3) {
                    Text(
                        text = screen[2],
                        color = LSecondary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                } else {
                    Text (
                        text = screen[2],
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .clickable{ onClick3 }
                    )
                }

                Divider(
                    modifier = Modifier
                        .background(Color.White)
                        .align(Alignment.CenterVertically)
                        .size(width = 3.dp, height = 3.dp)
                )

                if (onScreen == 4) {
                    Text(
                        text = screen[3],
                        color = LSecondary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                } else {
                    Text (
                        text = screen[3],
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .clickable{ onClick4 }
                    )
                }

            }
        }
    }
}

@Preview
@Composable
fun NavBarPreview() {
    NavBar(
        onScreen = 1,
        onClick1 = {},
        onClick2 = {},
        onClick3 = {},
        onClick4 = {},
    )
}