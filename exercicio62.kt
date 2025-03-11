fun main() {
    var mulheres = 0
    var homensPesados = 0
    var somaPesosMulheres = 0.0
    var maiorPesoHomens = 0.0
    for (i in 1..8) {
        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!
        print("Digite o peso: ")
        val peso = readLine()!!.toDouble()
        if (sexo.equals("F", ignoreCase = true)) {
            mulheres++
            somaPesosMulheres += peso
        } else if (sexo.equals("M", ignoreCase = true)) {
            if (peso > 100) {
                homensPesados++
            }
            if (peso > maiorPesoHomens) {
                maiorPesoHomens = peso
            }
        }
    }
    val mediaPesosMulheres = if (mulheres > 0) somaPesosMulheres / mulheres else 0.0
    println("Mulheres cadastradas: $mulheres")
    println("Homens com mais de 100Kg: $homensPesados")
    println("Média de peso das mulheres: $mediaPesosMulheres")
    println("Maior peso entre os homens: $maiorPesoHomens")
}