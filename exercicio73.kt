fun main() {
    val idades = IntArray(8)
    for (i in 0 until 8) {
        print("Digite a idade da pessoa ${i + 1}: ")
        idades[i] = readLine()!!.toInt()
    }
    val mediaIdades = idades.average()
    println("Média de idade: $mediaIdades")
    print("Pessoas com mais de 25 anos nas posições: ")
    for (i in 0 until 8) {
        if (idades[i] > 25) {
            print("$i ")
        }
    }
    println()
    val maiorIdade = idades.maxOrNull() ?: 0
    println("Maior idade: $maiorIdade")
    print("Posições da maior idade: ")
    for (i in 0 until 8) {
        if (idades[i] == maiorIdade) {
            print("$i ")
        }
    }
    println()
}