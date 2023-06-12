package edu.rafael.aula5.Ex2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Mario", "11111111111");
		Carro c = new Carro("Palio", "cinza", 4);
		Quadrado q = new Quadrado(10);
		
		/*
		Imprimivel i;
		i = f;
		i.imprimir();
		i = c;
		i.imprimir();
		i = q;
		i.imprimir();
		*/
		
		ArrayList<Imprimivel> lista = new ArrayList<>();
		lista.add(f);
		lista.add(c);
		lista.add(q);
		for (Imprimivel imprimivel : lista) {
			imprimivel.imprimir();
		}
	}
}
