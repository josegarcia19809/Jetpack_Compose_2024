package com.example.restart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            principal()
        }
    }
}

@Composable
fun fondo() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF53A4D6))
                .padding(16.dp)
        ) {
            Circulos()
        }
        Image(
            painter = painterResource(id = R.drawable.character_1),
            contentDescription = "Character",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun Circulos() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        drawCircle(
            color = Color.White,
            radius = 390f,
            center = center,
            style = Fill
        )

        drawCircle(
            color = Color(0x80FFFFFF),
            radius = 450f,
            center = center,
            style = Stroke(width = 100f)
        )
        drawCircle(
            color = Color(0x8053A4D6),
            radius = 250f,
            center = center,
            style = Stroke(width = 100f)
        )
    }
}

@Composable
fun principal() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF53A4D6))
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.weight(3f))
        Text(
            text = "Share",
            fontSize = 72.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = "It's not how much we give but how much love we put into giving.",
            fontSize = 16.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        fondo()
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
private fun vistaPrevia() {
    principal()
}

