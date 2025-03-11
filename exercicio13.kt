fun main() {
    print("Salário do funcionário: R\$")
    val salario = readLine()!!.toDouble()
    val aumento = salario * 0.15
    val novoSalario = salario + aumento
    println("Novo salário: R\$${"%.2f".format(novoSalario)}")
}