import java.util.*

fun main(args: Array<String>) {
    ifUsage()
    whenUsage()
}

fun ifUsage(){
    val numero = 0
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

fun whenUsage(){
    val numero = 0

    when (numero) {
        0 -> println("$numero es igual a 0 ")
        in 1..99 -> println("$numero es un numero comprendido entre 0 y 9")
        100, 101 -> println("$numero es 100 o 101")
        else -> println("$numero es menor de 0 y mayor de 101")
    }
}