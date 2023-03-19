fun main() {

	open class Estudantes(vararg nomeE: String){
		init{
			for (n in nomeE) {
				println("Estudante: ${n}, adicionado com sucesso!")
			}
		}
	}
	val addEstudantes = Estudantes("Paulo", "Vitor")

	open class ConteudoEdu(var nome: String, var duracao: Int)
	val addConteudo = ConteudoEdu("Aula 1 - Introdução", 2)
	println("Conteudo: ${addConteudo.nome}, tem duração de ${addConteudo.duracao} horas, foi adicionado com sucesso!")

	open class Formacao(var nomedocurso: String, var nivel: String, val conteudos: String){
		init{
			println("Curso: ${nomedocurso}.")
			println("Nível: ${nivel}.")
			println("Conteudo: ${conteudos}")
		}
		fun matricular(nomeES: List<String?>): String?{
			return = null
		}
	}
	Formacao("Kotlin", "Basico", addConteudo.nome)
	val matricular = listOf(*nomeE)

}