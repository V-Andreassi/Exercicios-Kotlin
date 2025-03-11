fun main() {
    val nomes = Array(7) { "" }
    for (i in 0 until 7) {
        print("Digite o nome da pessoa ${i + 1}: ")
        nomes[i] = readLine()!!
    }
    println("Nomes na ordem inversa:")
    for (i in 6 downTo 0) {
        println(nomes[i])
    }
}