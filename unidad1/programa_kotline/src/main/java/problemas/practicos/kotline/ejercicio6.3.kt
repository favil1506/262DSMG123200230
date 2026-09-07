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
//Paso 2
//El código funciona, pero la lógica para sumar dos números se encuentra dentro de la variable de resultado, lo que hace que el código sea menos flexible a la hora de volver a usarlo. En su lugar, puedes extraer la operación de suma en una función add() para que el código se pueda volver a usar. Para ello, actualiza el código con el que se muestra a continuación. Observa que el código ahora presenta una nueva variable val, llamada thirdNumber, e imprime el resultado de esta variable nueva con firstNumber.
//
//
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8
//
//    val result = add(firstNumber, secondNumber)
//    val anotherResult = add(firstNumber, thirdNumber)
//
//    println("$firstNumber + $secondNumber = $result")
//    println("$firstNumber + $thirdNumber = $anotherResult")
//}
//
//// Define add() function below this line
//¿Puedes definir la función add() de modo que el programa imprima este resultado?
//
//10 + 5 = 15
//10 + 8 = 18
//Paso 3
//Ahora tienes una función reutilizable capaz de sumar dos números.
//
//¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()? Modifica la función main() también para usar la función subtract(), de modo que puedas verificar que funcione como se espera.

//RESPUESTA

//3 FUNCION SUBSTRAC
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add1(firstNumber, secondNumber)
    val anotherResult = add1(firstNumber, thirdNumber)

    val subtractionResult = subtract(firstNumber, secondNumber)
    val anotherSubtractionResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = $subtractionResult")
    println("$firstNumber - $thirdNumber = $anotherSubtractionResult")
}
fun add1(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber+secondNumber
}
fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}