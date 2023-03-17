
fun main(){
enum class Nivel {BASICO, INTEMEDIARIO, AVANCADO}


open class ConteudoEducacional (vararg nomeCE: String, var duracao: Int)

class Estudantes (val nomeE: String, val idE: Int)

data class Formacao (val nomeF: String, val nivelF: Nivel, var ContEdu: List<ConteudoEducacional>)

Estudantes("Paulo", 1)
Estudantes("Marta", 2)
ConteudoEducacional("Intro", 2)
ConteudoEducacional("Aula 2", 4)
ConteudoEducacional("Aula 3", 3)
Formacao("Curso de Kotlin", "BASICO")

    fun matricular(matriculados:Estudantes){
        matriculados: List  = mutableListOF<Estudantes>()
        println("Todos os matriculados no curso $nomeCE são: $matriculados")
    }
}
