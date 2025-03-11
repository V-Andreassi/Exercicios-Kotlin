fun main() {
    print("Quantidade de Km percorridos: ")
    val km = readLine()!!.toDouble()
    print("Quantidade de dias alugados: ")
    val dias = readLine()!!.toInt()
    val precoKm = km * 0.20
    val precoDias = dias * 90
    val precoTotal = precoKm + precoDias
    println("Preço total a pagar: R\$${"%.2f".format(precoTotal)}")
}