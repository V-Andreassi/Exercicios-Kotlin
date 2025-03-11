fun main() {
    print("Digite um valor: ")
    val valor = readLine()!!.toInt()
    for (i in 1..10) {
        println("$valor x $i = ${valor * i}")
    }
}