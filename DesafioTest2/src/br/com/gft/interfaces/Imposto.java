package br.com.gft.model;

import java.util.ArrayList;

import br.com.gft.model.Produto;

public class Imposto extends Produto {
	
	public Imposto (int qtdDeLivros, int qtdDeVideoGame) {
		super(qtdDeLivros, qtdDeVideoGame);
	}

	ArrayList<String> calPatrimonio = new ArrayList<String>();

	public ArrayList<String> getCalPatrimonio() {
		return calPatrimonio;
	}

	public void setCalPatrimonio(ArrayList<String> calPatrimonio) {
		this.calPatrimonio = calPatrimonio;
	}
	
	
}
