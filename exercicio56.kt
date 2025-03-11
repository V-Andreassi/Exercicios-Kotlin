fun main() {
    var totalIdades = 0
    var somaIdades = 0
    var maioresDe21 = 0
    do {
        print("Digite a idade: ")
        val idade = readLine()!!.toInt()
        totalIdades++
        somaIdades += idade
        if (idade >= 21) {
            maioresDe21++
        }
        print("Deseja continuar (S/N)? ")
        val resposta = readLine()!!
    } while (resposta.equals("S", ignoreCase = true))
    val mediaIdades = if (totalIdades > 0) somaIdades.toDouble() / totalIdades else 0.0
    println("Total de idades digitadas: $totalIdades")
    println("Média das idades: $mediaIdades")
    println("Pessoas com 21 anos ou mais: $maioresDe21")
}