fun main() {
    val nomes = Array(5) { "" }
    val sexos = Array(5) { "" }
    val salarios = DoubleArray(5)
    for (i in 0 until 5) {
        print("Digite o nome do funcionário ${i + 1}: ")
        nomes[i] = readLine()!!
        print("Digite o sexo do funcionário ${i + 1} (M/F): ")
        sexos[i] = readLine()!!
        print("Digite o salário do funcionário ${i + 1}: ")
        salarios[i] = readLine()!!.toDouble()
    }
    println("Funcionárias com salário acima de R$5 mil:")
    for (i in 0 until 5) {
        if (sexos[i].equals("F", ignoreCase = true) && salarios[i] > 5000) {
            println("Nome: ${nomes[i]}, Salário: ${salarios[i]}")
        }
    }
}