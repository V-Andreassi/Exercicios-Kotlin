fun main() {
    print("Nome do cliente: ")
    val nome = readLine()
    print("Sexo (M/F): ")
    val sexo = readLine()
    print("Valor das compras: R\$")
    val valorCompras = readLine()!!.toDouble()
    val desconto = if (sexo.equals("F", ignoreCase = true)) 0.13 else 0.05
    val precoComDesconto = valorCompras * (1 - desconto)
    println("Preço com desconto: R\$${"%.2f".format(precoComDesconto)}")
}