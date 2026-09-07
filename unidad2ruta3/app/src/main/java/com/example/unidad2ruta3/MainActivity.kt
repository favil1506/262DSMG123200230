package com.example.unidad2ruta3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.unidad2ruta3.ui.theme.Unidad2Ruta3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unidad2Ruta3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    // Variable para rastrear el ID de la obra de arte actual
    var currentArtwork by remember { mutableStateOf(1) }

    // Referencias a los nombres exactos de tus archivos en res/drawable
    val imageResource = when (currentArtwork) {
        1 -> R.drawable.monalisa
        2 -> R.drawable.picasso
        else -> R.drawable.vanghog
    }

    val titleResource = when (currentArtwork) {
        1 -> "La Gioconda (Mona Lisa)"
        2 -> "Obra Cubista"
        else -> "La Noche Estrellada"
    }

    val artistResource = when (currentArtwork) {
        1 -> "Leonardo da Vinci"
        2 -> "Pablo Picasso"
        else -> "Vincent van Gogh"
    }

    val yearResource = when (currentArtwork) {
        1 -> "1503"
        2 -> "1937"
        else -> "1889"
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Sección 1: Muro con la obra de arte
        ArtworkWall(
            imageResource = imageResource,
            contentDescription = titleResource,
            modifier = Modifier.weight(1f)
        )

        // Sección 2: Descriptor de la obra
        ArtworkDescriptor(
            title = titleResource,
            artist = artistResource,
            year = yearResource
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Sección 3: Controlador de pantalla
        DisplayController(
            onPreviousClick = {
                currentArtwork = if (currentArtwork == 1) 3 else currentArtwork - 1
            },
            onNextClick = {
                currentArtwork = if (currentArtwork == 3) 1 else currentArtwork + 1
            }
        )
    }
}

@Composable
fun ArtworkWall(imageResource: Int, contentDescription: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .padding(24.dp)
            .border(3.dp, Color.LightGray)
            .background(Color.White),
        shadowElevation = 8.dp
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = contentDescription,
            modifier = Modifier.padding(32.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun ArtworkDescriptor(title: String, artist: String, year: String) {
    Column(
        modifier = Modifier
            .widthIn(max = 500.dp)
            .background(Color(0xFFECEFF1))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Row {
            Text(
                text = artist,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "($year)",
                color = Color.Gray
            )
        }
    }
}

@Composable
fun DisplayController(onPreviousClick: () -> Unit, onNextClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp, bottom = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = onPreviousClick,
            modifier = Modifier.width(120.dp)
        ) {
            Text("Anterior")
        }

        Button(
            onClick = onNextClick,
            modifier = Modifier.width(120.dp)
        ) {
            Text("Siguiente")
        }
    }
}