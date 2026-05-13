data class Produto(val nome: String, val preco: Double, val descricao: String)

fun main() {
    val produtos = listOf(
        Produto("Maçã", 2.5, "Fruta vermelha e crocante"),
        Produto("Banana", 3.0, "Fruta amarela e doce")
    )

    var encontrado: Produto? = null

    do {
        print("Digite um produto para procurar (ou 'sair' para encerrar): ")
        val entrada = readLine() ?: ""
        if (entrada.equals("sair", ignoreCase = true)) break

        encontrado = produtos.find { it.nome.equals(entrada, ignoreCase = true) }
        if (encontrado == null) {
            println("Produto não encontrado. Tente novamente.")
        }
    } while (encontrado == null)

    if (encontrado != null) {
        println("${encontrado.nome} - R$${encontrado.preco} - ${encontrado.descricao}")
    }
}