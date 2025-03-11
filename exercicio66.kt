fun main() {
    val vetor = IntArray(10) { if (it % 2 == 0) 5 else 3 }
    println(vetor.joinToString(" "))
    println("0 1 2 3 4 5 6 7 8 9")
}