package com.example.clock.View.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clock.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import com.example.clock.ui.theme.LPrimary

@Composable
fun Title(
    image1: Painter?,
    image2: Painter?,
    text: String,
    onClick1: (() -> Unit)?,
    onClick2: (() -> Unit)?,
) {
    Box(
        modifier = Modifier
            .background(Color.White),
    ) {
        Row (
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp),
        ) {
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(end = 60.dp)
                    .weight(1f)
            ) {
                if (image1 != null) {
                    Image(
                        painter = image1,
                        contentDescription = "null",
                        colorFilter = ColorFilter.tint(LPrimary),
                        modifier = Modifier
                            .size(50.dp)
                            .clickable { onClick1 }
                    )
                }
            }

            Text(
                text = text,
                color = Color.Black,
                fontSize = 38.sp
            )
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(start = 70.dp)
                    .weight(1f)
            ) {
                if (image2 != null) {
                    Image(
                        painter = image2,
                        contentDescription = "image",
                        colorFilter = ColorFilter.tint(LPrimary),
                        modifier = Modifier
                            .size(50.dp)
                            .clickable { onClick2 }
                    )
                }
            }

        }
    }
}

@Preview
@Composable
fun TitlePreview() {
    Title(
        image1 = painterResource(R.drawable.ic_arrow_back),
        image2 = painterResource(R.drawable.ic_cog),
        text = "Hello",
        onClick1 = {},
        onClick2 = {}
    )
}