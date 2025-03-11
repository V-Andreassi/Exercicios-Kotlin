fun main() {
    var primeiro = 1
    var segundo = 1
    print("$primeiro $segundo ")
    for (i in 3..10) {
        val proximo = primeiro + segundo
        print("$proximo ")
        primeiro = segundo
        segundo = proximo
    }
}