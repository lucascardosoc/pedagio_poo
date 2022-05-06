package br.com.fiap.pedagio;

public class Motos extends Veiculos {

	private int cilindradas;

	public Motos(String marca, String modelo, double valor, String nomeDoProprietario) {
		super(marca, modelo, valor, nomeDoProprietario);
	}

	public Motos(String marca, String modelo, double valor, String nomeDoProprietario, int cilindradas) {
		super(marca, modelo, valor, nomeDoProprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double getValor() {
		return super.getValor() * 0.8;
	}

	public int getCilindradas() {
		return cilindradas;
	}

}
