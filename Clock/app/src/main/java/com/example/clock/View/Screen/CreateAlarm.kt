package com.example.clock.View.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.clock.R

@Composable
fun CreateAlarm() {
    Scaffold(
        topBar = {
            Title(
                image1 = painterResource(R.drawable.ic_arrow_back),
                image2 = null,
                text = "Create Alarm",
                onClick1 = { /*TODO*/ },
                onClick2 = null
            )
        }

    ) {
        Box (
            modifier = Modifier
                .fillMaxSize()
        ) {

        }
    }
}

@Preview
@Composable
fun CreateAlarmPreview() {
    CreateAlarm()
}