fun main() {
    print("Peso (kg): ")
    val peso = readLine()!!.toDouble()
    print("Altura (m): ")
    val altura = readLine()!!.toDouble()
    val imc = peso / (altura * altura)
    println("IMC: ${"%.2f".format(imc)}")
    when {
        imc < 18.5 -> println("Abaixo do peso")
        imc < 25 -> println("Peso ideal")
        imc < 30 -> println("Sobrepeso")
        imc < 40 -> println("Obesidade")
        else -> println("Obesidade mórbida")
    }
}