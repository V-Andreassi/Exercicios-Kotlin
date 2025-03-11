fun maior(num1: Int, num2: Int) {
    if (num1 > num2) {
        println("O maior número é: $num1")
    } else if (num2 > num1) {
        println("O maior número é: $num2")
    } else {
        println("Os números são iguais.")
    }
}

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    maior(num1, num2)
}