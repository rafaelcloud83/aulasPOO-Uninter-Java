package edu.rafael.aula4.Ex2;

public class IngressoVip extends Ingresso {
	double adicional;
	
	public IngressoVip() {}

	public IngressoVip(String nomeEvento, double valor, double adicional) {
		super(nomeEvento, valor);
		this.adicional = adicional;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Valor adicional: "+ adicional);
		System.out.println("Total do ingresso: "+ (valor + adicional));
	}
}
