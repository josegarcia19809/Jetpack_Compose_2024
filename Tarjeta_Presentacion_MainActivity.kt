package com.example.tarjeta_presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPrincipal()
        }
    }
}

@Composable
fun TarjetaPrincipal() {
    // Carga las fuentes
    val pacificoRegular = FontFamily(Font(R.font.pacifico_regular))
    val sourceSans = FontFamily(Font(R.font.source_sans3))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF008080)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.woman),
            contentDescription = "Programadora",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Angela Yu",
            color = Color.White,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = pacificoRegular
        )

        Text(
            text = "JETPACK COMPOSE DEVELOPER",
            style = TextStyle(
                fontFamily = sourceSans,
                fontSize = 20.sp,
                color = Color(0xFF80CBC4),
                letterSpacing = 2.5.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Divider(
            color = Color(0xFFB2DFDB),
            thickness = 1.dp,
        )

        Spacer(modifier = Modifier.height(16.dp))

        ContactoTelefono()
        ContactoCorreo()
    }
}

@Preview
@Composable
private fun TarjetaPrincipalPreview() {
    TarjetaPrincipal()
}


@Composable
fun ContactoTelefono() {
    val sourceSans = FontFamily(Font(R.font.source_sans3))
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 25.dp, vertical = 10.dp
            ),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.Phone, contentDescription = "Phone",
                tint = Color(0xFF004D4D)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "+55 712 456 789",
                style = TextStyle(
                    color = Color(0xFF004D4D),
                    fontFamily = sourceSans,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(900)
                )
            )
        }
    }
}

@Preview
@Composable
private fun ContactoTelefonoPreview() {
    ContactoTelefono()
}

@Composable
fun ContactoCorreo() {
    val sourceSans = FontFamily(Font(R.font.source_sans3))
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 25.dp,
                vertical = 10.dp
            ),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.Email, contentDescription = "Email",
                tint = Color(0xFF004D4D)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "josegarcia@gmail.com",
                style = TextStyle(
                    color = Color(0xFF004D4D),
                    fontFamily = sourceSans,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(900)
                )
            )

        }
    }
}

@Preview
@Composable
private fun ContactoCorreoPreview() {
    ContactoCorreo()
}