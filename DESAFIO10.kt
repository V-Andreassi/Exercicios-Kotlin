fun fibonacci(termos: Int) {
    var primeiro = 1
    var segundo = 1
    print("$primeiro >> $segundo >> ")
    for (i in 3..termos) {
        val proximo = primeiro + segundo
        print("$proximo >> ")
        primeiro = segundo
        segundo = proximo
    }
    println("FIM")
}

fun main() {
    print("Digite o número de termos da sequência de Fibonacci: ")
    val termos = readLine()!!.toInt()
    fibonacci(termos)
}