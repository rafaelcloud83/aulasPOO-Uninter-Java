package edu.rafael.aula3;

import java.util.ArrayList;
import java.util.Iterator;

public class ExIterator {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(2);
		lista.add(5);
		lista.add(8);
		//HashSet<Integer> conjunto = new HashSet<>();
		//HashMap<String, Integer> mapa = new HashMap<>();
		
		int soma;
		soma = 0;
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}
		System.out.println("For padrão: " + soma);
		
		soma = 0;
		for (int item : lista) {
			soma += item;
		}
		System.out.println("Foreach: " + soma);
		
		soma = 0;
		//Iterator it = mapa.entrySet().iterator();
		//Iterator it = conjunto.iterator();
		Iterator<Integer> it = lista.iterator();
		while (it.hasNext()) {
			soma += (int) it.next();
		}
		System.out.println("Iterator: " + soma);
	}

}
