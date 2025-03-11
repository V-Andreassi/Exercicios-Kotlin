fun main() {
    var nomeMaisVelho = ""
    var idadeMaisVelho = 0
    var nomeMulherMaisJovem = ""
    var idadeMulherMaisJovem = Int.MAX_VALUE
    var somaIdades = 0
    var numPessoas = 0
    var numHomensMais30 = 0
    var numMulheresMenos18 = 0
    while (true) {
        print("Digite o nome: ")
        val nome = readLine()!!
        print("Digite a idade: ")
        val idade = readLine()!!.toInt()
        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!
        if (idade > idadeMaisVelho) {
            idadeMaisVelho = idade
            nomeMaisVelho = nome
        }
        if (sexo.equals("F", ignoreCase = true) && idade < idadeMulherMaisJovem) {
            idadeMulherMaisJovem = idade
            nomeMulherMaisJovem = nome
        }
        somaIdades += idade
        numPessoas++
        if (sexo.equals("M", ignoreCase = true) && idade > 30) {
            numHomensMais30++
        }
        if (sexo.equals("F", ignoreCase = true) && idade < 18) {
            numMulheresMenos18++
        }
        print("Deseja continuar (S/N)? ")
        val resposta = readLine()!!
        if (resposta.equals("N", ignoreCase = true)) {
            break
        }
    }
    val mediaIdades = if (numPessoas > 0) somaIdades.toDouble() / numPessoas else 0.0
    println("Nome da pessoa mais velha: $nomeMaisVelho")
    println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
    println("Média de idade do grupo: $mediaIdades")
    println("Total de homens com mais de 30 anos: $numHomensMais30")
    println("Total de mulheres com menos de 18 anos: $numMulheresMenos18")
}