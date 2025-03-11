fun main() {
    val vetor = IntArray(10) { 9 - it }
    println(vetor.joinToString(" "))
    println("0 1 2 3 4 5 6 7 8 9")
}