fun somador(num1: Int, num2: Int) {
    val soma = num1 + num2
    println("A soma de $num1 e $num2 é: $soma")
}

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    somador(num1, num2)
}