fun main() {
    print("Valor da casa: R\$")
    val valorCasa = readLine()!!.toDouble()
    print("Salário do comprador: R\$")
    val salario = readLine()!!.toDouble()
    print("Anos para pagar: ")
    val anos = readLine()!!.toInt()
    val prestacaoMensal = valorCasa / (anos * 12)
    if (prestacaoMensal > salario * 0.3) {
        println("Empréstimo negado.")
    } else {
        println("Empréstimo aprovado.")
    }
}