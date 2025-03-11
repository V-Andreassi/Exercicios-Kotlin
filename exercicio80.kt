fun gerador(mensagem: String, repeticoes: Int, borda: Int) {
    val borda1 = "+ ======= +"
    val borda2 = "~~~~~~~~:::::::~~~~~~~"
    val borda3 = "<<<<<<<<------->>>>>>>>>>"
    val bordaSelecionada = when (borda) {
        1 -> borda1
        2 -> borda2
        3 -> borda3
        else -> borda1 // Borda padrão
    }
    println(bordaSelecionada)
    for (i in 1..repeticoes) {
        println(mensagem)
    }
    println(bordaSelecionada)
}

fun main() {
    gerador("Aprendendo Kotlin", 3, 2)
}