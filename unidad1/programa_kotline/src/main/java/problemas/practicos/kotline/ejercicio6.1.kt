package problemas.practicos.kotline

//La función main() contiene un error de compilación:
//
//
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//
//    println("$firstNumber + $secondNumber = $result")
//}
//¿Puedes corregir el error de modo que el programa imprima este resultado?
//
//10 + 5 = 15

//RESPUESTA
//1. el error esta en q no esta declarado el result

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}