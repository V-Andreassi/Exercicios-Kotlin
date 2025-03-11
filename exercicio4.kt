fun main() {
    print("Digite um valor: ")
    val valor1 = readLine()!!.toInt()
    print("Digite outro valor: ")
    val valor2 = readLine()!!.toInt()
    val soma = valor1 + valor2
    println("A soma entre $valor1 e $valor2 é igual a $soma.")
}