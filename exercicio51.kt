fun main() {
    var salarioHomens = 0.0
    var salarioMulheres = 0.0
    while (true) {
        print("Digite o salário do funcionário: ")
        val salario = readLine()!!.toDouble()
        print("Digite o sexo do funcionário (M/F): ")
        val sexo = readLine()!!
        if (sexo.equals("M", ignoreCase = true)) {
            salarioHomens += salario
        } else if (sexo.equals("F", ignoreCase = true)) {
            salarioMulheres += salario
        }
        print("Deseja continuar (S/N)? ")
        val resposta = readLine()!!
        if (resposta.equals("N", ignoreCase = true)) {
            break
        }
    }
    println("Total de salários pagos aos homens: R$ $salarioHomens")
    println("Total de salários pagos às mulheres: R$ $salarioMulheres")
}