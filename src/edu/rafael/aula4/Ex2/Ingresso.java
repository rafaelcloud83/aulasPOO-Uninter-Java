package edu.rafael.aula4.Ex2;

public class Ingresso {
	String nomeEvento;
	double valor;
	
	public Ingresso() {}
		
	public Ingresso(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}

	public void info() {
		System.out.println("Nome evento: "+ nomeEvento);
		System.out.println("Valor ingresso: "+ valor);
	}
}
