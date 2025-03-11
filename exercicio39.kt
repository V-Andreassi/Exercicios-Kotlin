fun main() {
    print("Digite o primeiro valor: ")
    val primeiroValor = readLine()!!.toInt()
    print("Digite o último valor: ")
    val ultimoValor = readLine()!!.toInt()
    print("Digite o incremento: ")
    val incremento = readLine()!!.toInt()
    for (i in primeiroValor..ultimoValor step incremento) {
        print("$i ")
    }
    println("Acabou!")
}