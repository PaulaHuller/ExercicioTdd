package br.com.gft.model;

import java.util.ArrayList;

public class VideoGame extends Produto {

	public VideoGame(String nome, String tema, double imposto, boolean usado) {
		super(nome, tema, imposto, usado);
	}
	
	ArrayList<String> qtdDeVideogame = new ArrayList<String>();
	

	public ArrayList<String> getQtdDeVideogame() {
		return qtdDeVideogame;
	}

	public void setQtdDeVideogame(ArrayList<String> qtdDeVideogame) {
		this.qtdDeVideogame = qtdDeVideogame;
	}
	
	

}
