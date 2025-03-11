fun main() {
    var soma = 0
    while (true) {
        print("Digite um número (1111 para sair): ")
        val num = readLine()!!.toInt()
        if (num == 1111) {
            break
        }
        soma += num
    }
    println("O somatório dos números é: $soma")
}