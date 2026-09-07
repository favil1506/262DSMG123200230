package problemas.practicos.kotline

//Este programa muestra el salario total que recibe un empleado este mes. El salario total se divide en dos partes: la variable baseSalary, que es lo que el empleado recibe todos los meses, y la variable bonusAmount, que es una bonificación adicional otorgada al empleado.
//
//
//fun main() {
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary = "$baseSalary + $bonusAmount"
//    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
//}
//¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
//Cuando ejecutas el código en el Playground de Kotlin, ¿se imprime el resultado que esperabas?

//-------------------------------------------------------------------------------------

//RESPUESTA
//1. No se va a sumar debido a q la variable salida que es el totalSalary esta como un comentario
//2. No, se imprime tal cual esta, mas no la suma

//FUNCION CORREGIDA
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}