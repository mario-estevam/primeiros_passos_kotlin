open class Pessoa(nome:String, data_nascimento:String, altura:Int, anoNascimento:Int){
    var nome:String;
    var data_nascimento:String;
    var altura:Int;
    var idade:Int;
    
    init{
        this.nome = nome;
        this.altura = altura;
        this.data_nascimento = data_nascimento;
        this.idade = calculo(anoNascimento)
    }
    
    
    fun calculo(anoNascimento:Int): Int{
        return 2021 - anoNascimento;
    }
    override fun toString() = "$nome ($data_nascimento, $altura)";
}

fun main(){
    var objeto:Pessoa
    objeto = Pessoa("mario","04/05/2001", 180, 2001)
    println(objeto.idade)
    println(objeto)
}