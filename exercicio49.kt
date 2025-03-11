fun main() {
    var somaAlturas = 0.0
    var maisDe90Kg = 0
    var menos50KgMenos160m = 0
    var mais190mMais100Kg = 0

    for (i in 1..7) {
        print("Digite o peso da ${i}ª pessoa (Kg): ")
        val peso = readLine()!!.toDouble()

        print("Digite a altura da ${i}ª pessoa (m): ")
        val altura = readLine()!!.toDouble()

        somaAlturas += altura

        if (peso > 90) {
            maisDe90Kg++
        }

        if (peso < 50 && altura < 1.60) {
            menos50KgMenos160m++
        }

        if (altura > 1.90 && peso > 100) {
            mais190mMais100Kg++
        }
    }

    val mediaAlturas = somaAlturas / 7
    println("Média de altura do grupo: ${"%.2f".format(mediaAlturas)}m")
    println("Pessoas com mais de 90Kg: $maisDe90Kg")
    println("Pessoas com menos de 50Kg e menos de 1.60m: $menos50KgMenos160m")
    println("Pessoas com mais de 1.90m e mais de 100Kg: $mais190mMais100Kg")
}