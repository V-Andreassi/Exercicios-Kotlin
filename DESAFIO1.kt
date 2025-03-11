fun main() {
    print("Quantidade de cigarros fumados por dia: ")
    val cigarrosPorDia = readLine()!!.toInt()
    print("Anos fumando: ")
    val anosFumando = readLine()!!.toInt()
    val totalCigarros = cigarrosPorDia * 365 * anosFumando
    val minutosPerdidos = totalCigarros * 10
    val diasPerdidos = minutosPerdidos / (24 * 60)
    println("Total de dias de vida perdidos: $diasPerdidos")
}