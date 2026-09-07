package problemas.practicos.kotline

//En este programa, se muestra el clima de diferentes ciudades. Incluye el nombre de la ciudad, las temperaturas máxima y mínima del día, y las probabilidades de lluvia.
//
//
//fun main() {
//    println("City: Ankara")
//    println("Low temperature: 27, High temperature: 31")
//    println("Chance of rain: 82%")
//    println()
//
//    println("City: Tokyo")
//    println("Low temperature: 32, High temperature: 36")
//    println("Chance of rain: 10%")
//    println()
//
//    println("City: Cape Town")
//    println("Low temperature: 59, High temperature: 64")
//    println("Chance of rain: 2%")
//    println()
//
//    println("City: Guatemala City")
//    println("Low temperature: 50, High temperature: 55")
//    println("Chance of rain: 7%")
//    println()
//}
//Hay muchas similitudes en el código que imprime el clima de cada ciudad. Por ejemplo, hay frases que se repiten varias veces, como "City:" y "Low temperature:". Los códigos similares y repetidos crean el riesgo de que se produzcan errores en tu programa. Puede que hayas escrito mal una de las ciudades o que hayas olvidado uno de los detalles del clima.
//
//¿Puedes crear una función que imprima los detalles del clima de una sola ciudad para reducir la repetición en la función main() y, luego, hacer lo mismo en las ciudades restantes?
//¿Puedes actualizar la función main() para llamar a la función que creaste para cada ciudad y pasar los detalles apropiados del clima como argumentos?

fun main() {
    printWeather("Ankara", 27, 31, 82)
    printWeather("Tokyo", 32, 36, 10)
    printWeather("Cape Town", 59, 64, 2)
    printWeather("Guatemala City", 50, 55, 7)
}

fun printWeather(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}
