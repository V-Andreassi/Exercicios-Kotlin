fun main() {
    var maiorPreco = Double.MIN_VALUE
    var menorPreco = Double.MAX_VALUE
    for (i in 1..8) {
        print("Digite o preço do produto: ")
        val preco = readLine()!!.toDouble()
        if (preco > maiorPreco) {
            maiorPreco = preco
        }
        if (preco < menorPreco) {
            menorPreco = preco
        }
    }
    println("Maior preço: R\$${"%.2f".format(maiorPreco)}")
    println("Menor preço: R\$${"%.2f".format(menorPreco)}")
}