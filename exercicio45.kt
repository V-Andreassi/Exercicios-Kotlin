import kotlin.random.Random

fun main() {
    val numeros = mutableListOf<Int>()
    var acimaDe5 = 0
    var divisiveisPor3 = 0
    for (i in 1..20) {
        val numero = Random.nextInt(0, 11)
        numeros.add(numero)
        if (numero > 5) {
            acimaDe5++
        }
        if (numero % 3 == 0) {
            divisiveisPor3++
        }
    }
    println("Números sorteados: $numeros")
    println("Números acima de 5: $acimaDe5")
    println("Números divisíveis por 3: $divisiveisPor3")
}