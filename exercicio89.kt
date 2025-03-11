import kotlin.math.pow

fun potencia(base: Double, expoente: Double): Double {
    return base.pow(expoente)
}

fun main() {
    print("Digite a base: ")
    val base = readLine()!!.toDouble()
    print("Digite o expoente: ")
    val expoente = readLine()!!.toDouble()
    val resultado = potencia(base, expoente)
    println("O resultado da exponenciação é: $resultado")
}