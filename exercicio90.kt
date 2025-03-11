fun media(nota1: Double, nota2: Double): Double {
    return (nota1 + nota2) / 2
}

fun situacao(media: Double): String {
    return when {
        media >= 7.0 -> "APROVADO"
        media >= 5.0 -> "RECUPERAÇÃO"
        else -> "REPROVADO"
    }
}

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()
    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()
    val mediaAluno = media(nota1, nota2)
    val situacaoAluno = situacao(mediaAluno)
    println("Média: $mediaAluno, Situação: $situacaoAluno")
}