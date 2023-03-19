fun main() {

    open class Estudante <E>(vararg nomeES: E){
        
    }
    val nome = Estudante("Paulo", "Vitor")

	open class ConteudoEdu(var nome: String, var duracao: Int)
	val addConteudo = ConteudoEdu("Aula 1 - Introdução", 2)
	println("Conteudo: ${addConteudo.nome}, tem duração de ${addConteudo.duracao} horas, foi adicionado com sucesso!")

	class Formacao(var nomedocurso: String, var nivel: String, val conteudos: String){
		init{
			println("Curso: ${nomedocurso}.")
			println("Nível: ${nivel}.")
			println("Conteudo: ${conteudos}")
		}
	}
	Formacao("Kotlin", "Basico", addConteudo.nome)

}