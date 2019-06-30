package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banco {
	
	private List<String> palavras;
	
	public Banco() {
		this.palavras = new ArrayList<String>();
		this.palavras.add("machado");
		this.palavras.add("espada");
		this.palavras.add("creeper");
		this.palavras.add("porco");
		this.palavras.add("galinha");
	}

	public List<String> getPalavras() {
		return palavras;
	}

	public String sorteio() {
		Random gerador = new Random();
		int index = gerador.nextInt(this.palavras.size());
		return palavras.get(index);
	}
}
