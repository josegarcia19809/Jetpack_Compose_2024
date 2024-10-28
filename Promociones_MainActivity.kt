package com.example.promociones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ficha()
        }
    }
}

@Composable
fun Ficha() {
    Column(
        modifier = Modifier
            .padding(all = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center

    )
    {
        Encabezado()
        Spacer(modifier = Modifier.weight(.1f))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            FichaBasic()
            FichaPro()
        }
        Spacer(modifier = Modifier.weight(.25f))
        FichaTeam()
        Spacer(modifier = Modifier.weight(1f))

    }
}

@Preview(showBackground = true)
@Composable
fun FichaPreview() {
    Ficha()
}

@Composable
fun Encabezado() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "Choose",
            style = MaterialTheme.typography.titleLarge,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "Your Plan",
            style = MaterialTheme.typography.titleLarge,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EncabezadoPreview() {
    Encabezado()
}

@Composable
fun FichaBasic() {
    Column(
        modifier = Modifier
            .background(Color(155, 89, 182), shape = RoundedCornerShape(20.dp))
            .clip(shape = RoundedCornerShape(20.dp))
            .padding(all = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Basic",
            color = Color.White,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            //modifier = Modifier.fillMaxWidth(.4f)
        )
        Text(
            text = "$9",
            color = Color.White,
            fontSize = 40.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "Per month",
            color = Color.White,
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Black,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FichaBasicPreview() {
    FichaBasic()
}

@Composable
fun FichaPro() {
    Box {
        Column(
            modifier = Modifier
                .background(
                    Color(189, 195, 199),
                    shape = RoundedCornerShape(20.dp)
                )
                .clip(shape = RoundedCornerShape(20.dp))
                .padding(all = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

            ) {
            Text(
                text = "Pro",
                color = Color.Black,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                //modifier = Modifier.fillMaxWidth(.4f)
            )
            Text(
                text = "$16",
                color = Color.Black,
                fontSize = 40.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Per month",
                color = Color.Black,
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Black,
            )
        }
        Text(
            text = "Best for Designer",
            modifier = Modifier
                .offset(x = 20.dp, y = (-10).dp)
                .background(
                    Color(241, 196, 15),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(all = 5.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FichaProPreview() {
    FichaPro()
}

@Composable
fun FichaTeam() {
    Box {
        Column(
            modifier = Modifier
                .background(
                    Color(52, 73, 94),
                    shape = RoundedCornerShape(20.dp)
                )
                .clip(shape = RoundedCornerShape(20.dp))
                .padding(all = 30.dp)
                .fillMaxWidth(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Icon(
                imageVector = Icons.Rounded.DateRange,
                contentDescription = "",
                tint = Color.White
            )
            Text(
                text = "Team",
                color = Color.White,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                //modifier = Modifier.fillMaxWidth(.4f)
            )
            Text(
                text = "$32",
                color = Color.White,
                fontSize = 40.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Per month",
                color = Color.White,
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Black,
            )
        }
        Text(
            text = "Perfect for teams with 20 members",
            modifier = Modifier
                .offset(x = 40.dp, y = (-10).dp)
                .background(
                    Color(241, 196, 15),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(all = 5.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FichaTeamPreview() {
    FichaTeam()
}
