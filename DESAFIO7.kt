fun main() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readLine()!!.toInt()
    print("Digite a razão da PA: ")
    val razao = readLine()!!.toInt()
    var soma = 0
    print("PA: ")
    for (i in 0..9) {
        val termo = primeiroTermo + i * razao
        print("$termo ")
        soma += termo
    }
    println("\nSoma dos termos: $soma")
}