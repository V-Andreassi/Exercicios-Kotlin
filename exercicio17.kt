import java.util.Calendar

fun main() {
    print("Ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()
    val anoAtual = Calendar.getInstance().get(Calendar.YEAR)
    val idade = anoAtual - anoNascimento
    if (idade >= 16) {
        println("Você pode votar.")
    } else {
        println("Você não pode votar.")
    }
}