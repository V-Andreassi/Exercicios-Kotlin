fun main() {
    var homens = 0
    var mulheres = 0
    var somaIdades = 0
    var somaIdadesHomens = 0
    var mulheresMaisDe20 = 0

    for (i in 1..5) {
        print("Digite a idade da ${i}ª pessoa: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F) da ${i}ª pessoa: ")
        val sexo = readLine()!!.uppercase()

        somaIdades += idade

        if (sexo == "M") {
            homens++
            somaIdadesHomens += idade
        } else if (sexo == "F") {
            mulheres++
            if (idade > 20) {
                mulheresMaisDe20++
            }
        }
    }

    val mediaIdades = somaIdades.toDouble() / 5
    val mediaIdadesHomens = if (homens > 0) somaIdadesHomens.toDouble() / homens else 0.0

    println("Homens cadastrados: $homens")
    println("Mulheres cadastradas: $mulheres")
    println("Média de idade do grupo: ${"%.2f".format(mediaIdades)}")
    println("Média de idade dos homens: ${"%.2f".format(mediaIdadesHomens)}")
    println("Mulheres com mais de 20 anos: $mulheresMaisDe20")
}