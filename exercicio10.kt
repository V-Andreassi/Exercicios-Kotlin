fun main() {
    print("Largura da parede: ")
    val largura = readLine()!!.toDouble()
    print("Altura da parede: ")
    val altura = readLine()!!.toDouble()
    val area = largura * altura
    val tinta = area / 2
    println("Área a ser pintada: ${area}m²")
    println("Quantidade de tinta necessária: ${tinta} litros")
}