fun main() {
    var somaIdades = 0
    var numAlunos = 0
    while (true) {
        print("Digite a idade do aluno (999 para sair): ")
        val idade = readLine()!!.toInt()
        if (idade == 999) {
            break
        }
        somaIdades += idade
        numAlunos++
    }
    val mediaIdades = if (numAlunos > 0) somaIdades.toDouble() / numAlunos else 0.0
    println("Total de alunos: $numAlunos")
    println("Média de idade dos alunos: $mediaIdades")
}