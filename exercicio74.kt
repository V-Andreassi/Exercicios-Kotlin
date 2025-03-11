fun main() {
    val notas = DoubleArray(10)
    for (i in 0 until 10) {
        print("Digite a nota do aluno ${i + 1}: ")
        notas[i] = readLine()!!.toDouble()
    }
    val mediaTurma = notas.average()
    println("Média da turma: $mediaTurma")
    var alunosAcimaMedia = 0
    for (nota in notas) {
        if (nota > mediaTurma) {
            alunosAcimaMedia++
        }
    }
    println("Alunos acima da média: $alunosAcimaMedia")
    val maiorNota = notas.maxOrNull() ?: 0.0
    println("Maior nota: $maiorNota")
    print("Posições da maior nota: ")
    for (i in 0 until 10) {
        if (notas[i] == maiorNota) {
            print("$i ")
        }
    }
    println()
}