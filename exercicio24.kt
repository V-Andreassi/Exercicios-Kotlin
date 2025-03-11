fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    if (num1 > num2) {
        println("O primeiro valor é o maior")
    } else if (num2 > num1) {
        println("O segundo valor é o maior")
    } else {
        println("Não existe valor maior, os dois são iguais")
    }
}