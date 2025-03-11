fun main() {
    print("Nome do aluno: ")
    val nome = readLine()
    print("Nota 1: ")
    val nota1 = readLine()!!.toDouble()
    print("Nota 2: ")
    val nota2 = readLine()!!.toDouble()
    val media = (nota1 + nota2) / 2
    println("Média: ${"%.2f".format(media)}")
    if (media >= 7) {
        println("Bom aproveitamento!")
    } else {
        println("Aproveitamento abaixo da média.")
    }
}