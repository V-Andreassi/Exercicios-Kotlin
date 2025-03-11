fun main() {
    print("Quantos reais você tem na carteira? R\$")
    val reais = readLine()!!.toDouble()
    val dolares = reais / 3.45
    println("Você pode comprar US\$${"%.2f".format(dolares)}")
}