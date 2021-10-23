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



class AgendaList(){
    var listaPessoas: ArrayList<Pessoa>
    
    init{
        this.listaPessoas = ArrayList();
    }
    
    fun armazenarPessoaP(pessoa:Pessoa){
			this.listaPessoas.add(pessoa);
    }
    
    
    fun removerPessoaP(nome:String){
    	var i: Int? = buscarPessoa(nome)   
        if(i==null){
            println("pessoa nao encontrada")
        }else{
            this.listaPessoas.removeAt(i)
        }
    }
    
    
    fun printAgenda() {
        println(listaPessoas.toString());
    }
    
    fun printPessoa(index:Int){
        println(listaPessoas.get(index))
	}
  
    
}


fun main(){
    var objeto:Pessoa
    var objeto2:Pessoa
    objeto = Pessoa("mario","04/05/2001", 180, 2001)
    objeto2 = Pessoa("maria","04/05/2001", 180, 2001)
    println(objeto.idade)
    println(objeto)
    
    var lista:AgendaList
	lista = AgendaList();
    

    lista.armazenarPessoaP(objeto)
    lista.armazenarPessoaP(objeto2)
    //lista.removerPessoaP("maria")
    //lista.printPessoa(0)
    println("a primeira pessoa da lista é :")
    lista.printPessoa(0)
    println("Lista agenda:")
    lista.printAgenda()
    

}
