fun main() {
    var somaIdades = 0
    var maioresDe18 = 0
    var menoresDe5 = 0
    var maiorIdade = Int.MIN_VALUE
    for (i in 1..10) {
        print("Digite a idade da pessoa: ")
        val idade = readLine()!!.toInt()
        somaIdades += idade
        if (idade > 18) {
            maioresDe18++
        }
        if (idade < 5) {
            menoresDe5++
        }
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    val mediaIdades = somaIdades.toDouble() / 10
    println("Média de idade: ${"%.2f".format(mediaIdades)}")
    println("Pessoas com mais de 18 anos: $maioresDe18")
    println("Pessoas com menos de 5 anos: $menoresDe5")
    println("Maior idade: $maiorIdade")
}