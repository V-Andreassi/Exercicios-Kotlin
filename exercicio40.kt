fun main() {
    print("Digite o primeiro valor: ")
    val primeiroValor = readLine()!!.toInt()
    print("Digite o último valor: ")
    val ultimoValor = readLine()!!.toInt()
    print("Digite o incremento: ")
    val incremento = readLine()!!.toInt()

    if(primeiroValor <= ultimoValor){
        for (i in primeiroValor..ultimoValor step incremento) {
            print("$i ")
        }
    } else {
        for(i in primeiroValor downTo ultimoValor step incremento){
            print("$i ")
        }
    }

    println("Acabou!")
}