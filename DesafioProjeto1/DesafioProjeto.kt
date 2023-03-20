enum class Nivel{INICIANTE, INTERMEDIARIO, AVANÇADO}

data class Usuario(val nomeU: String, val id: Int)

data class ConteudoEducacional(val nomeC: String, val stack: String, val duracao: Int = 60)

data class Formacao(val nomeF: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel){
	
	val matriculados = mutableListOf<Usuario>()

	infix fun matricular(usuario: Usuario){
		matriculados.add(usuario)
	}

	fun matricular(vararg usuarios: Usuario){
		for (usuario in usuarios) {
			matriculados.add(usuario)
		}
	}

	fun mostrarConteudo(){
		for (conteudo in conteudos) {
			println(conteudo.nomeC)
		}
	}

	fun mostrarMatriculados(){
		for (matriculado in matriculados) {
			println(matriculado.nomeU)
		}
	}
}

fun main(){

	val paulo = Usuario("Paulo", 21)
	val vitor = Usuario("Vitor", 12)
	val boo   = Usuario("Boo", 13)
	val bla   = Usuario("Bla", 31)

	val listaConteudoKotlin: List<ConteudoEducacional> = listOf(
		ConteudoEducacional("Aula 1 ", "Kotlin"),
		ConteudoEducacional("Aula 2 ", "Kotlin"),
		ConteudoEducacional("Aula 3 ", "Kotlin")
	)

	val kotlin = Formacao("Kotlin", listaConteudoKotlin, Nivel.INICIANTE)

	kotlin?.let{
		kotlin.matricular(boo, paulo)
	} 

	println("Curso: ${kotlin.nomeF}")
	println("Conteúdos:")
	kotlin.mostrarConteudo()
	println("Estudantes matriculados:")
	kotlin.mostrarMatriculados()
}