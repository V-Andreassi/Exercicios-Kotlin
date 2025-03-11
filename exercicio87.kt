fun maior(num1: Int, num2: Int, num3: Int): Int {
    return maxOf(num1, num2, num3)
}

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Digite o terceiro número: ")
    val num3 = readLine()!!.toInt()
    val resultado = maior(num1, num2, num3)
    println("O maior número é: $resultado")
}