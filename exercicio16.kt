fun main() {
    print("Velocidade do carro (Km/h): ")
    val velocidade = readLine()!!.toDouble()
    if (velocidade > 80) {
        val multa = (velocidade - 80) * 5
        println("Você foi multado! Valor da multa: R\$${"%.2f".format(multa)}")
    } else {
        println("Velocidade dentro do limite permitido.")
    }
}