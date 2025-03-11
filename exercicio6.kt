fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()
    val antecessor = numero - 1
    val sucessor = numero + 1
    println("O antecessor de $numero é $antecessor")
    println("O sucessor de $numero é $sucessor")
}