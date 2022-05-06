package br.com.fiap.pedagio;

public class Pedagio {

	public static void main(String[] args) {

		Carros carros = new Carros("Chevrolet", "Tracker", 60000, "Lucas", "SUV", 4, 0);
		Motos motos = new Motos("Honda", "CB600", 5, "Jo�o", 600);
		Caminhoes caminhoes = new Caminhoes("Mercedes", "1620", 15, "Jos�", 3);

		System.out.println("O carro da " + carros.getMarca() + ", modelo " + carros.getModelo() + ". Paga: R$ "
				+ carros.getNovoValor() + " de ped�gio" + ", caso esteja transportando " + carros.getQtdePassageiros()
				+ " passageiros.");

		System.out.println("A moto da " + motos.getMarca() + ", modelo " + motos.getModelo() + ". Paga: R$ "
				+ motos.getValor() + " de ped�gio, segundo o propriet�rio " + motos.getNomeDoProprietario()
				+ ". A moto possui " + motos.getCilindradas() + " cilindradas.");

		System.out.println("O caminh�o da " + caminhoes.getMarca() + ", modelo " + caminhoes.getModelo() + ". Paga: R$ "
				+ caminhoes.getValor() + " de ped�gio, segundo o propriet�rio " + caminhoes.getNomeDoProprietario()
				+ ", por ter " + caminhoes.getQtdeEixos() + " eixos.");

	}

}
