package com.example.helloworld2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.helloworld2024.ui.theme.HelloWorld2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Texto()
        }
    }
}

@Composable
fun Texto() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra " +
                    "persona. No te dejes atrapar por el dogma, que es vivir con los resultados " +
                    "del pensamiento de otras personas. No dejes que el ruido de las opiniones " +
                    "de los demás ahogue tu propia voz interior. Y lo más importante, ten el " +
                    "coraje de seguir tu corazón y tu intuición",
            fontWeight = FontWeight.Black,
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            //maxLines = 3,
            lineHeight = 35.sp
        )
    }
}

@Preview(
    name = "Vista previa",
    showSystemUi = true,
    showBackground = true
)
@Composable
fun TextoPreview() {
    Texto()
}