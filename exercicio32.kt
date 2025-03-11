fun main() {
    print("Salário atual: R\$")
    val salario = readLine()!!.toDouble()

    print("Gênero (M/F): ")
    val genero = readLine()!!.uppercase()

    print("Anos na empresa: ")
    val anos = readLine()!!.toInt()

    val aumento = when {
        genero == "F" && anos < 15 -> 0.05
        genero == "F" && anos in 15..20 -> 0.12
        genero == "F" && anos > 20 -> 0.23
        genero == "M" && anos < 20 -> 0.03
        genero == "M" && anos in 20..30 -> 0.13
        genero == "M" && anos > 30 -> 0.25
        else -> 0.0
    }

    val novoSalario = salario * (1 + aumento)

    println("Novo salário: R\$${"%.2f".format(novoSalario)}")
}