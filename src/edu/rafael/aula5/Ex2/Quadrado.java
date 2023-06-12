package edu.rafael.aula5.Ex2;

public class Quadrado implements Imprimivel{
	int medidaLado;

	public Quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}

	@Override
	public void imprimir() {
		System.out.println("Quadrado");		
		System.out.println("Medida lado: "+ medidaLado);
		System.out.println("Area: "+ (4*medidaLado));
		System.out.println();
	}
}