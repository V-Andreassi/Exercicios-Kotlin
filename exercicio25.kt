fun main() {
    print("Nota 1: ")
    val nota1 = readLine()!!.toDouble()
    print("Nota 2: ")
    val nota2 = readLine()!!.toDouble()
    val media = (nota1 + nota2) / 2
    if (media <= 4.9) {
        println("REPROVADO")
    } else if (media <= 6.9) {
        println("RECUPERAÇÃO")
    } else {
        println("APROVADO")
    }
}