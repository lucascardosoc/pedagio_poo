package br.com.fiap.pedagio;

public class Veiculos {

	private String marca;
	private String modelo;
	private double valor;
	private String nomeDoProprietario;

	public Veiculos(String marca, String modelo, double valor, String nomeDoProprietario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.nomeDoProprietario = nomeDoProprietario;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getValor() {
		return valor;
	}

	public String getNomeDoProprietario() {
		return nomeDoProprietario;
	}

}
