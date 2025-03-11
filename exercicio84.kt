fun contador(inicio: Int, fim: Int, incremento: Int) {
    var numero = inicio
    while (numero <= fim) {
        print("$numero >> ")
        numero += incremento
    }
    println("FIM")
}

fun main() {
    print("Digite o valor inicial: ")
    val inicio = readLine()!!.toInt()
    print("Digite o valor final: ")
    val fim = readLine()!!.toInt()
    print("Digite o incremento: ")
    val incremento = readLine()!!.toInt()
    contador(inicio, fim, incremento)
}