fun gerador(mensagem: String, repeticoes: Int) {
    println("+ ======= +")
    for (i in 1..repeticoes) {
        println(mensagem)
    }
    println("+ ======= +")
}

fun main() {
    gerador("Aprendendo Kotlin", 4)
}