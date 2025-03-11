fun main() {
    print("Digite um valor: ")
    val valor = readLine()!!.toInt()
    if (valor >= 0) {
        print("Contagem: ")
        for (i in 0..valor) {
            print("$i")
            if (i < valor) {
                print(", ")
            }
        }
        println(", FIM!")
    } else {
        println("Por favor, digite um valor inteiro positivo.")
    }
}