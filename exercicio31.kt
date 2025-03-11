fun main() {
    print("Horas de atividade física no mês: ")
    val horas = readLine()!!.toInt()
    val pontos = when {
        horas <= 10 -> horas * 2
        horas <= 20 -> horas * 5
        else -> horas * 10
    }
    val dinheiro = pontos * 0.05
    println("Pontos: $pontos")
    println("Dinheiro ganho: R\$${"%.2f".format(dinheiro)}")
}