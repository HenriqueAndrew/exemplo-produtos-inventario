package Inventario;


//Exemplo "this" (12.a):
//Nesta classe Produto, podemos observar que temos uma variaveis de classe e campos de parametros do construtor representados pelo mesmo nome, neste caso foi utilizado a palavra-chave "this" + .variavel para se referir ao nome da variavel e não ao nome do parâmetro.


public class Produto {

	//Declaracoes de campo de instancia
	private int nrItem;
	private String nmProduto, status = "Ativo";
	private int qtde;
	private double preco, valor_invent;
	private boolean ativo = true;
	
	//construtor com valores padroes para variaveis. 
	public Produto () {}
	
	//construtor com parametros.
	public Produto (int nrItem, String nmProduto, int qtde, double preco) {
		this.nrItem = nrItem; //com o this. apontado antes da variavel podemos dizer que temos nessa linha a representação de uma variavel recebendo valor do parametro
		this.nmProduto = nmProduto;
		this.qtde = qtde;
		this.preco = preco;
	}
	
	public int getnrItem() {
		return nrItem;
		//metodo para acesso/retorna a variavel privada nrItem
	}
	public void setnrItem(int nrItem) {
		this.nrItem = nrItem;
		//metodo para definicao/alteracao da variavel privada nrItem 
	}
	public String getnmProduto() {
		return nmProduto;
		//metodo para acesso/retorna a variavel privada nmProduto
	}
	public void setnmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
		//metodo para definicao/alteracao da variavel privada nmProduto
	}
	public int getqtde() {
		return qtde;
		//metodo para acesso/retorna a variavel privada qtde
	}
	public void setqtde(int qtde) {
		this.qtde = qtde;
		//metodo para definicao/alteracao da variavel privada qtde
	}
	public double getpreco() {
		return preco;
		//metodo para acesso/retorna a variavel privada preco
	}
	public void setpreco(double preco) {
		this.preco = preco;
		//metodo para definicao/alteracao da variavel privada valor_invent 
	}
	public double getvalor_invent() {
		this.valor_invent = this.qtde * this.preco;
		return valor_invent;
		//metodo para acesso/retorna a variavel privada valor_invent recebendo a variavel quantidade multiplicada pela variavel preco
	}
	public boolean getativo() {
		return ativo;
		//metodo para acesso/retorna a variavel privada ativo
	}
	public void setativo(boolean ativo) {
		this.ativo = ativo;
		this.status = this.ativo == true ? (String) "Ativo" : (String) "Descontinuado";
		//metodo para definicao/alteracao da variavel privada preco e condicional para status ("true" como "ativo") e ("false" como "descontinuado")
	}
	
	public String toString() //convertendo metodos para String para serem impressos na classe driver
	{	
		String produto = "";
		produto = "Numero do Item: " 
		+ getnrItem() 
		+ "\n" 
		+ "Nome: " + getnmProduto() 
		+ "\n" 
		+ "Quantidade em estoque: " + getqtde() 
		+ "\n" 
		+ "Preço: " + getpreco()
		+ "\n"
		+ "Valor do Estoque: " + getvalor_invent()
		+ "\n"
	    + "Status do Produto: " + this.status;
		return produto;
	}
}
