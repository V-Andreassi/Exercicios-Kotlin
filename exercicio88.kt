fun superSomador(num1: Int, num2: Int): Int {
    var soma = 0
    for (i in minOf(num1, num2)..maxOf(num1, num2)) {
        soma += i
    }
    return soma
}

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    val resultado = superSomador(num1, num2)
    println("A soma dos valores no intervalo é: $resultado")
}