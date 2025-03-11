fun main() {
    print("Digite um valor: ")
    val valor = readLine()!!.toInt()
    for (i in 1..valor) {
        print("$i ")
    }
    println("Acabou!")
}