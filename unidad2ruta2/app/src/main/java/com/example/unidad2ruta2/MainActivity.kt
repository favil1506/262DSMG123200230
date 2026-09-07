package com.example.unidad2ruta2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unidad2ruta2.ui.theme.Unidad2Ruta2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Unidad2Ruta2Theme {
                LemonApp()
            }
        }
    }
}

@Composable
fun LemonApp() {

    // Indica en qué paso de la preparación de la limonada estamos.
    var currentStep by remember { mutableStateOf(1) }

    // Cuenta cuántas veces se ha presionado el limón.
    var squeezeCount by remember { mutableStateOf(0) }

    // Determina aleatoriamente cuántas veces se debe presionar el limón.
    var squeezeTarget by remember { mutableStateOf((2..4).random()) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        when (currentStep) {

            // Paso 1: seleccionar un limón.
            1 -> {
                LemonTextAndImage(
                    text = stringResource(R.string.lemon_tree_description),
                    imageResource = R.drawable.lemon_tree,
                    contentDescription = stringResource(
                        R.string.lemon_tree_content_description
                    ),
                    onImageClick = {
                        // Cada vez que se selecciona un nuevo limón,
                        // se genera una cantidad aleatoria entre 2 y 4.
                        squeezeTarget = (2..4).random()
                        squeezeCount = 0
                        currentStep = 2
                    }
                )
            }

            // Paso 2: exprimir el limón.
            2 -> {
                LemonTextAndImage(
                    text = stringResource(R.string.lemon_description),
                    imageResource = R.drawable.lemon_squeeze,
                    contentDescription = stringResource(
                        R.string.lemon_content_description
                    ),
                    onImageClick = {
                        // Aumentamos el contador cada vez que se presiona.
                        squeezeCount++

                        // Cuando se alcanza la cantidad requerida,
                        // pasamos al paso de beber la limonada.
                        if (squeezeCount >= squeezeTarget) {
                            currentStep = 3
                        }
                    }
                )
            }

            // Paso 3: beber la limonada.
            3 -> {
                LemonTextAndImage(
                    text = stringResource(R.string.lemonade_description),
                    imageResource = R.drawable.lemon_drink,
                    contentDescription = stringResource(
                        R.string.lemonade_content_description
                    ),
                    onImageClick = {
                        currentStep = 4
                    }
                )
            }

            // Paso 4: reiniciar.
            4 -> {
                LemonTextAndImage(
                    text = stringResource(R.string.empty_glass_description),
                    imageResource = R.drawable.lemon_restart,
                    contentDescription = stringResource(
                        R.string.empty_glass_content_description
                    ),
                    onImageClick = {
                        currentStep = 1
                    }
                )
            }
        }
    }
}

@Composable
fun LemonTextAndImage(
    text: String,
    imageResource: Int,
    contentDescription: String,
    onImageClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Texto que indica al usuario qué debe hacer.
        Text(
            text = text,
            fontSize = 18.sp
        )

        // Espacio de 16dp entre el texto y la imagen.
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        // Imagen que funciona como un botón.
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = contentDescription,
            modifier = Modifier
                .wrapContentSize()
                .border(
                    width = 2.dp,
                    color = Color(105, 205, 216),
                    shape = RoundedCornerShape(4.dp)
                )
                .clickable {
                    onImageClick()
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Unidad2Ruta2Theme {
        LemonApp()
    }
}

