fun somador(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    val resultado = somador(num1, num2)
    println("A soma de $num1 e $num2 é: $resultado")
}