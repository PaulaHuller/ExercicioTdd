package br.com.gft.model;

public class Produto {

	String nome;
	String tema;
	double imposto;
	boolean usado;
	int qtdDeLivros;
	int  qtdDeVideoGame;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public double getImposto(double d) {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public boolean isUsado() {
		return usado;
	}
	public void setUsado(boolean usado) {
		this.usado = usado;
	}
	public int getqtdDeLivros() {
		return qtdDeLivros;
	}
	public void setqtdDeLivros(int qtdDeLivros) {
		this.qtdDeLivros = qtdDeLivros;
	}
	public void setqtdDeVideogame(int qtdDeVideogame) {
		this.qtdDeVideoGame = qtdDeVideogame;
	}
	public int getqtdDeVideogame() {
		return qtdDeVideoGame;
	}
	public Produto(String nome, String tema, double imposto, boolean usado) {
		super();
		this.nome = nome;
		this.tema = tema;
		this.imposto = imposto;
		this.usado = usado;
	}
	public Produto(int qtdDeLivros2, int qtdDeVideoGame2) {
	}
	
	
	
	
}

