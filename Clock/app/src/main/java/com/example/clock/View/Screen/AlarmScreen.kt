package com.example.clock.View.Screen

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clock.ModelRepository.AlarmRepository
import com.example.clock.Models.Alarm
import com.example.clock.R
import com.example.clock.View.Components.AlarmList
import com.example.clock.View.Components.CButton
import com.example.clock.View.Components.NavBar
import com.example.clock.ui.theme.LError
import com.example.clock.ui.theme.LPrimary
import com.example.clock.ui.theme.LSecondary

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AlarmScreen() {
    Scaffold(
        topBar = {
            Title(
                image1 = painterResource(R.drawable.ic_arrow_back),
                image2 = painterResource(R.drawable.ic_cog),
                text = "Alarms",
                onClick1 = {},
                onClick2 = {}
            )
        },
        bottomBar = {
            NavBar(
                onScreen = 1,
                onClick1 = {},
                onClick2 = {},
                onClick3 = {},
                onClick4 = {},
            )
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Box(
                        modifier = Modifier
                            .padding(top = 40.dp, end = 15.dp)
                            .align(Alignment.End)
                    ) {
                        CButton(
                            image = painterResource(R.drawable.ic_create),
                            text = "Create",
                            textColor = LSecondary,
                            bgColor = LPrimary,
                        ) {}
                    }

                    val boxTop = 60
                    Box(
                        modifier = Modifier
                            .padding(top = boxTop.dp)
                            .fillMaxSize()
                    ) {
                        val alarmRepo = AlarmRepository()
                        val items = alarmRepo.getAllData()

                        LazyColumn {
                            itemsIndexed(
                                items = items,
                                key = { index, alarm ->
                                    alarm.id
                                }
                            ) { index, alarm ->
                                AlarmList(alarm = alarm)
                            }

                        }
                    }
                }


            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun AlarmPreview() {
    AlarmScreen()
}