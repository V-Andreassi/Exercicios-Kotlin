fun main() {
    print("Número de dias trabalhados: ")
    val dias = readLine()!!.toInt()
    val horasTrabalhadas = dias * 8
    val salario = horasTrabalhadas * 25
    println("Salário do funcionário: R\$${"%.2f".format(salario)}")
}