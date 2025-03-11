fun main() {
    var pares = 0
    var impares = 0
    for (i in 1..6) {
        print("Digite o número: ")
        val numero = readLine()!!.toInt()
        if (numero % 2 == 0) {
            pares++
        } else {
            impares++
        }
    }
    println("Pares: $pares, Ímpares: $impares")
}