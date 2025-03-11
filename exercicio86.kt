fun media(nota1: Double, nota2: Double): Double {
    return (nota1 + nota2) / 2
}

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()
    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()
    val resultado = media(nota1, nota2)
    println("A média do aluno é: $resultado")
}