fun main() {
    print("Digite uma distância em metros: ")
    val metros = readLine()!!.toDouble()
    val km = metros / 1000
    val hm = metros / 100
    val dam = metros / 10
    val dm = metros * 10
    val cm = metros * 100
    val mm = metros * 1000
    println("A distância de $metros m corresponde a:")
    println("${km}Km")
    println("${hm}Hm")
    println("${dam}Dam")
    println("${dm}dm")
    println("${cm}cm")
    println("${mm}mm")
}