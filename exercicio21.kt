import java.util.Calendar

fun main() {
    print("Ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()
    val anoAtual = Calendar.getInstance().get(Calendar.YEAR)
    val idade = anoAtual - anoNascimento
    if (idade < 18) {
        println("Faltam ${18 - idade} anos para o alistamento.")
    } else if (idade > 18) {
        println("Já se passaram ${idade - 18} anos do alistamento.")
    } else {
        println("Hora de se alistar!")
    }
}