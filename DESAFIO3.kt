fun main() {
    print("Comprimento do segmento 1: ")
    val segmento1 = readLine()!!.toDouble()
    print("Comprimento do segmento 2: ")
    val segmento2 = readLine()!!.toDouble()
    print("Comprimento do segmento 3: ")
    val segmento3 = readLine()!!.toDouble()
    if (segmento1 < segmento2 + segmento3 &&
        segmento2 < segmento1 + segmento3 &&
        segmento3 < segmento1 + segmento2
    ) {
        println("É possível formar um triângulo.")
        if (segmento1 == segmento2 && segmento2 == segmento3) {
            println("EQUILÁTERO")
        } else if (segmento1 == segmento2 || segmento1 == segmento3 || segmento2 == segmento3) {
            println("ISÓSCELES")
        } else {
            println("ESCALENO")
        }
    } else {
        println("Não é possível formar um triângulo.")
    }
}