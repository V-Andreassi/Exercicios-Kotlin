fun main() {
    var soma = 0
    for (i in 1..7) {
        print("Digite o número: ")
        val numero = readLine()!!.toInt()
        soma += numero
    }
    println("Somatório: $soma")
}