fun main() {
    print("Nome do funcionário: ")
    val nome = readLine()
    print("Salário atual: R\$")
    val salario = readLine()!!.toDouble()
    print("Anos na empresa: ")
    val anos = readLine()!!.toInt()
    val aumento = when {
        anos < 3 -> 0.03
        anos < 10 -> 0.125
        else -> 0.20
    }
    val novoSalario = salario * (1 + aumento)
    println("Novo salário de $nome: R\$${"%.2f".format(novoSalario)}")
}