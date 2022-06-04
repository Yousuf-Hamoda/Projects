package com.example.clock.View.Components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clock.R
import com.example.clock.ui.theme.LPrimary
import com.example.clock.ui.theme.LSecondary

@Composable
fun CButton(
    image: Painter?,
    text: String,
    textColor: Color,
    bgColor: Color,
    onClick: () -> Unit
) {
    Button(
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = bgColor
        ),
        onClick = { onClick() }
    ) {
        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier.wrapContentSize()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (image != null) {
                    Image(
                        painter = image,
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp)
                    )
                }
                Text(text = text, color = textColor, fontSize = 25.sp)
            }
        }
    }
}

@Preview
@Composable
fun ButtonPreview() {
    CButton(
        image = painterResource(R.drawable.ic_create),
        text = "Create",
        textColor = LSecondary,
        bgColor = LPrimary) {
    }
}