package br.com.fiap.pedagio;

public class Caminhoes extends Veiculos {

	private int qtdeEixos;

	public Caminhoes(String marca, String modelo, double valor, String nomeDoProprietario) {
		super(marca, modelo, valor, nomeDoProprietario);
	}

	public Caminhoes(String marca, String modelo, double valor, String nomeDoProprietario, int qtdeEixos) {
		super(marca, modelo, valor, nomeDoProprietario);
		this.qtdeEixos = qtdeEixos;
	}

	@Override
	public double getValor() {
		return super.getValor() * qtdeEixos;
	}

	public int getQtdeEixos() {
		return qtdeEixos;
	}

}
