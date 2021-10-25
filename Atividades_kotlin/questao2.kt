open class Pessoa(nome: String, altura: Double) {
    private var nome: String = nome
    private var altura: Double = altura
    private var idade: Int = 0
    private var dataNascimento: Int = 0;



    constructor(nome: String, altura: Double, dataNascimento: Int) : this(nome, altura) {
        this.nome = nome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
        this.idade = calculo(dataNascimento)
    }

  	fun calculo(anoNascimento:Int): Int{
        return 2021 - dataNascimento;
    }

    fun getNome(): String {
        return this.nome;
    }

    override fun toString(): String {
        return "${this.nome}(${this.dataNascimento}, ${this.altura})";
    }
}




class Agenda() {
    var pessoas= Array(10) { Pessoa("", 0.0) }
    var quantP = 0;

    fun armazenaPessoa(pessoa: Pessoa) {
        if(quantP < 10) {
            pessoas[quantP++] = pessoa;
        } else {
            println("Agenda cheia!")
        }
    }
    fun removePessoa(nome: String): Boolean {
        for (i in 0 until quantP) {
            if(pessoas[i].getNome() == nome) {
                pessoas[i] = pessoas[--quantP];
                return true;
            }
        }
        println("Nao achei essa pessoa");
        return false;
    }

    fun buscaPessoa(nome: String): Boolean {
        for(i in 0 until quantP) {
            if (pessoas[i].getNome() == nome) {
                println(pessoas[i])
                return true;
            }
        }
        return false;
    }
    fun printAgenda() {
        for(i in 0 until quantP) {
            println(pessoas[i]);
        }
    }
}

fun main() {
    
    //val pessoa = Pessoa("mario", 1.80,  2001)
    //println(pessoa.toString());
    
    
    val agenda = Agenda();
    val contato0 = Pessoa("marioneto", altura = 1.80, 2001);
    agenda.armazenaPessoa(contato0);
    
    //agenda.printAgenda();
    
   // agenda.buscaPessoa("marioneto");

  // agenda.armazenaPessoa(p5);

}
