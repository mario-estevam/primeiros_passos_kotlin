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
        return "nome: ${this.nome}, data de nascimento: ${this.dataNascimento}, a altura é: ${this.altura}";
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
    
    val pessoa = Pessoa("mario", 1.80,  2001)
    println(pessoa.toString())
    println("idade: " + pessoa.calculo(2001));
    
    
    val agenda = Agenda();
    val contato0 = Pessoa("marioneto", altura = 1.80, 2001);
    val contato1 = Pessoa("marione", altura = 1.80, 2001);
    val contato2 = Pessoa("marion", altura = 1.80, 2001);
    val contato3 = Pessoa("mario", altura = 1.80, 2001);
    val contato4 = Pessoa("mari", altura = 1.80, 2001);
    val contato5 = Pessoa("mar", altura = 1.80, 2001);
    val contato6 = Pessoa("ma", altura = 1.80, 2001);
    val contato7 = Pessoa("m", altura = 1.80, 2001);
    val contato8 = Pessoa("mariaa", altura = 1.80, 2001);
    val contato9 = Pessoa("mariasa", altura = 1.80, 2001);
    val contato10 = Pessoa("marilu", altura = 1.80, 2001);
    agenda.armazenaPessoa(contato0);
    agenda.armazenaPessoa(contato1);
    agenda.armazenaPessoa(contato2);
    agenda.armazenaPessoa(contato3);
    agenda.armazenaPessoa(contato4);
    agenda.armazenaPessoa(contato5);
    agenda.armazenaPessoa(contato6);
    agenda.armazenaPessoa(contato7);
    agenda.armazenaPessoa(contato8);
    agenda.armazenaPessoa(contato9);
    
    agenda.removePessoa("marioneto")
    agenda.printAgenda();
    println("atualizando")
    agenda.armazenaPessoa(contato10);
    agenda.printAgenda();
 
   //agenda.buscaPessoa("mario");



}

