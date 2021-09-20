import kotlin.random.Random

fun main() {
    ifUsage()
    whenUsageWithParameters()
    whenUsageWithoutParameters()
    ejercicioIf(-1, "Miguel")
    ejercicioWhen(-1, "Jose")
}

fun ifUsage(){
    val numero = Random.nextInt(0,12)
    // If - Else Clasico
    if (numero == 0) {
        println("$numero es igual a 0 ")
    } else {
        println("$numero es diferente a 0 ")
    }
    // If - Else Rango
    if (numero in 0..9){
        println("$numero es un numero comprendido entre 0 y 9")
    } else {
        println("$numero es mayor que 9")
    }
}

fun whenUsageWithParameters(){
    val numero = Random.nextInt(-10,103)

    when (numero) {
        0 -> println("$numero es igual a 0 ")
        in 1..99 -> println("$numero es un numero comprendido entre 1 y 99")
        100, 101 -> println("$numero es 100 o 101")
        else -> println("$numero es menor de 0 o mayor de 101")
    }
}

fun whenUsageWithoutParameters(){
    val condicion1 = Random.nextBoolean()
    val condicion2 = Random.nextBoolean()

    when  {
        condicion1 && condicion2 -> println("Ambas son true")
        (!condicion1 && condicion2) || (condicion1 && !condicion2) -> println("Una es true")
        !condicion1 && !condicion2 -> println("Ambas son false")
    }
}

fun ejercicioIf(edad: Int, nombre: String){

    if (edad in 0..17) println("$nombre debes abonar 5€")
    else if (edad in 18..65 ) println("$nombre debes abonar 10€")
    else println("$nombre para ti es gratis")

    }

fun ejercicioWhen(edadw: Int, nombrew: String){

    when (edadw){
        in 0..17 -> println("$nombrew debes abonar 5€")
        in 18..65 -> println("$nombrew debes abonar 10€")
        else -> println("$nombrew para ti es gratis")
    }
}

