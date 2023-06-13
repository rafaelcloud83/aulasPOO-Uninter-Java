package edu.rafael.aula5.Ex1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Desktop d = new Desktop(8, 4, 600);
		Notebook n = new Notebook(8, 4, 15);
		
		/*
		Computador comp;
		comp = d;
		System.out.println("Valor: "+ comp.calculaValor());
		comp = n;
		System.out.println("Valor: "+ comp.calculaValor());
		*/
		
		ArrayList<Computador> listaComputadores = new ArrayList<>();
		listaComputadores.add(d);
		listaComputadores.add(n);
		listaComputadores.add(new Desktop(16, 8, 1200));		
		listaComputadores.add(new Notebook(16, 8, 18));
		
		double total = 0;
		for (Computador c : listaComputadores) {
			total += c.calculaValor();
		}
		System.out.println("Total do valor: "+ total);
	}

}
