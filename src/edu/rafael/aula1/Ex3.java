package edu.rafael.aula1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//ArrayList<Integer> megaSena = new ArrayList<Integer>();
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = teclado.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o nome: ");
			String nome = teclado.next();
			listaNomes.add(nome);
		}
		
		/*
		for (int i = qtd - 1; i >= 0; i--) {
			System.out.println(listaNomes.get(i));
		}
		*/
		
		System.out.println("Ordem normal: ");
		System.out.println(listaNomes);
		
		Collections.reverse(listaNomes);
		
		System.out.println("Ordem reversa: ");
		System.out.println(listaNomes);
	}

}
