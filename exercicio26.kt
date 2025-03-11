fun main() {
    print("Largura do terreno: ")
    val largura = readLine()!!.toDouble()
    print("Comprimento do terreno: ")
    val comprimento = readLine()!!.toDouble()
    val area = largura * comprimento
    println("Área do terreno: ${"%.2f".format(area)}m²")
    if (area < 100) {
        println("TERRENO POPULAR")
    } else if (area <= 500) {
        println("TERRENO MASTER")
    } else {
        println("TERRENO VIP")
    }
}