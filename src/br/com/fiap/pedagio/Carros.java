package br.com.fiap.pedagio;

public class Carros extends Veiculos {

	private String categoria;
	private int qtdePassageiros;
	private double novoValor;

	public Carros(String marca, String modelo, double valor, String nomeDoProprietario) {
		super(marca, modelo, valor, nomeDoProprietario);
	}

	public Carros(String marca, String modelo, double valor, String nomeDoProprietario, String categoria,
			int qtdePassageiros, double novoValor) {
		super(marca, modelo, valor, nomeDoProprietario);
		this.categoria = categoria;
		this.qtdePassageiros = qtdePassageiros;
		this.novoValor = novoValor;
	}

	@Override
	public double getValor() {
		return super.getValor() * 0.001;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public double getNovoValor() {
		if (categoria == "SUV")
			novoValor = (qtdePassageiros * 5) + getValor();
		return novoValor;
	}

}
