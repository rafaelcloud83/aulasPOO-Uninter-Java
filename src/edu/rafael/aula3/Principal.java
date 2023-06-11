package edu.rafael.aula3;

import java.util.Collections;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		//ArrayList<String> pessoas = new ArrayList<>();
		LinkedList<String> pessoas = new LinkedList<>();
		
		pessoas.add("Mario");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		
		System.out.println(pessoas.get(0));
		//pessoas.remove(1);
		
		System.out.println("Ordem original");
		System.out.println(pessoas);
		
		System.out.println("Ordem alfabética");
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
		System.out.println("Ordem reversa");
		Collections.reverse(pessoas);
		System.out.println(pessoas);
		
		System.out.println("Ordem misturada");
		Collections.shuffle(pessoas);
		System.out.println(pessoas);
		
		System.out.println(Collections.min(pessoas));
		System.out.println(Collections.max(pessoas));
	}

}
