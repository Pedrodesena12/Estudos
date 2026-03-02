package Mercado;

public class Produtos {
//produtos 
	private String nome;
	private double preco;
	private int codigos;
	
	// construtor
	
	public Produtos(String nome,double preco,int codigos) {
		this.nome =  nome;
		this.preco = preco;
		this.codigos = codigos;	
	}
	
	//getters e setters 
	
	public String getNome(){
		return nome;}
	public void setNome(String nome) {this.nome = nome;}
		
	public double getPreco() {return preco;}
	public void setPreco(double preco) {this.preco = preco;}
	
	
	public int getCodigos() {return codigos;}
	public void setCodigos(int codigos) {this.codigos = codigos;}
	
	
	
	
	
	
	
	
	
	
	
}
