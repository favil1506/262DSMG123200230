package problemas.practicos.kotline


//Deberás implementar una función que acepte un parámetro operatingSystem y un parámetro emailId, cree un mensaje en el formato dado y lo muestre.
//

//Paso 1
//¿Puedes implementar la función displayAlertMessage() en este programa de modo que imprima el resultado que se muestra?
//
//fun main() {
//    val operatingSystem = "Chrome OS"
//    val emailId = "sample@gmail.com"
//
//    println(displayAlertMessage(operatingSystem, emailId))
//}
//
//// Define your displayAlertMessage() below this line.
//¿El programa imprime este resultado?
//
//There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.


fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

//1. Se define la funcion displayAlertMesssage()

fun displayAlertMessage(operatingSystem : String, emailId : String) : String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}


