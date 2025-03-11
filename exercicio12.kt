fun main() {
    print("Preço do produto: R\$")
    val preco = readLine()!!.toDouble()
    val desconto = preco * 0.05
    val precoPromocional = preco - desconto
    println("Preço promocional: R\$${"%.2f".format(precoPromocional)}")
}