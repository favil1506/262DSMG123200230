package practica

//5. Catálogo de canciones
//Imagina que necesitas crear una app de reproducción de música.
//
//Crea una clase que pueda representar la estructura de una canción. La clase Song debe incluir estos elementos de código:
//
//Propiedades para el título, el artista, el año de publicación y el recuento de reproducciones
//Propiedad que indica si la canción es popular (si el recuento de reproducciones es inferior a 1,000, considera que es poco popular)
//Un método para imprimir la descripción de una canción en este formato:
//"[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".

class Song(
    val titulo: String,
    val artista: String,
    val anioPublicacion: Int,
    val reproducciones: Int
) {

    val esPopular: Boolean
        get() = reproducciones >= 1000

    fun imprimirDescripcion() {
        println("$titulo, interpretada por $artista, se lanzo en $anioPublicacion")
    }
}

fun main() {
    val cancion = Song("Imagine", "John Lennon", 1971, 500000)
    cancion.imprimirDescripcion()
    println("Es popular? ${cancion.esPopular}")
}