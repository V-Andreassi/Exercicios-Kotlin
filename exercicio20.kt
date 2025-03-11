fun main() {
    print("Digite um ano: ")
    val ano = readLine()!!.toInt()
    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
        println("BISSEXTO")
    } else {
        println("NÃO BISSEXTO")
    }
}