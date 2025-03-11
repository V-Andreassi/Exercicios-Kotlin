fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()
    val dobro = numero * 2
    val tercaParte = numero / 3
    println("O dobro de $numero é $dobro")
    println("A terça parte de $numero é ${"%.5f".format(tercaParte)}")
}