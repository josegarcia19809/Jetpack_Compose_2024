package com.example.iconos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MostrarIconos()
        }
    }
}

@Composable
fun MostrarIconos() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF2d98da))
    ) {
        Text(
            text = "Iconos ‍💻",
            fontSize = 60.sp,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.Center)
        )

        Icon(
            imageVector = Icons.Filled.Phone, contentDescription = "Phone",
            tint = Color(0xFFfc5c65),
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.TopStart)
        )

        Icon(
            imageVector = Icons.Filled.Email, contentDescription = "Email",
            tint = Color(0xFFfed330),
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.TopEnd)
        )

        Icon(
            imageVector = Icons.Filled.Delete, contentDescription = "Delete",
            tint = Color(0xFFfd9644),
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.BottomStart)
        )

        Icon(
            imageVector = Icons.Filled.Star, contentDescription = "Star",
            tint = Color(0xFF4b6584),
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.BottomEnd)
        )
    }
}

@Preview(
    name = "Vista previa",
    showSystemUi = true,
    showBackground = true
)
@Composable
private fun MostrarIconosPreview() {
    MostrarIconos()
}
