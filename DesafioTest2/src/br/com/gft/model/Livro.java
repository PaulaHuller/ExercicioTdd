package br.com.gft.model;

import java.util.ArrayList;

public class Livro extends Produto {

	public Livro(String nome, String tema, double imposto, boolean usado) {
		super(nome, tema, imposto, usado);
		
}
	ArrayList<String> qtdDeLivros = new ArrayList<String>();
	

	public ArrayList<String> getQtdDeLivros() {
		return qtdDeLivros;
	}

	public void setQtdDeLivros(ArrayList<String> qtdDeLivros) {
		this.qtdDeLivros = qtdDeLivros;
	}
	
	

}
