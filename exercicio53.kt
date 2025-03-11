fun main() {
    var maiorIdade = 0
    var numHomens = 0
    var idadeMulherMaisJovem = Int.MAX_VALUE
    var somaIdadesHomens = 0
    var numHomensComIdade = 0
    while (true) {
        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!
        print("Digite a idade: ")
        val idade = readLine()!!.toInt()
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
        if (sexo.equals("M", ignoreCase = true)) {
            numHomens++
            somaIdadesHomens += idade
            numHomensComIdade++
        } else if (sexo.equals("F", ignoreCase = true) && idade < idadeMulherMaisJovem) {
            idadeMulherMaisJovem = idade
        }
        print("Deseja continuar (S/N)? ")
        val resposta = readLine()!!
        if (resposta.equals("N", ignoreCase = true)) {
            break
        }
    }
    val mediaIdadeHomens = if (numHomensComIdade > 0) somaIdadesHomens.toDouble() / numHomensComIdade else 0.0
    println("Maior idade lida: $maiorIdade")
    println("Total de homens cadastrados: $numHomens")
    println("Idade da mulher mais jovem: $idadeMulherMaisJovem")
    println("Média de idade dos homens: $mediaIdadeHomens")
}