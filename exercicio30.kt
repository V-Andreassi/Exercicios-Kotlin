fun main() {
    print("Tipo de carro (popular/luxo): ")
    val tipoCarro = readLine()
    print("Dias de aluguel: ")
    val dias = readLine()!!.toInt()
    print("Km percorridos: ")
    val km = readLine()!!.toDouble()
    val precoDia = if (tipoCarro.equals("popular", ignoreCase = true)) 90.0 else 150.0
    val precoKm = if (tipoCarro.equals("popular", ignoreCase = true)) {
        if (km <= 100) km * 0.20 else km * 0.10
    } else {
        if (km <= 200) km * 0.30 else km * 0.25
    }
    val precoTotal = precoDia * dias + precoKm
    println("Preço total: R\$${"%.2f".format(precoTotal)}")
}