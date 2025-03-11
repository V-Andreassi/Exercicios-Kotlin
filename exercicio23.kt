fun main() {
    print("Distância a percorrer (Km): ")
    val distancia = readLine()!!.toDouble()
    val preco = if (distancia <= 200) distancia * 0.50 else distancia * 0.45
    println("Preço da passagem: R\$${"%.2f".format(preco)}")
}