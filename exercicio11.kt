import kotlin.math.pow

fun main() {
    print("Digite o valor de A: ")
    val a = readLine()!!.toDouble()
    print("Digite o valor de B: ")
    val b = readLine()!!.toDouble()
    print("Digite o valor de C: ")
    val c = readLine()!!.toDouble()
    val delta = b.pow(2) - 4 * a * c
    println("O valor de Delta é: $delta")
}