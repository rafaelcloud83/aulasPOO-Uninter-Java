package edu.rafael.aula1;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Olá Mundo!!!");
		
		int idade = 10;
		idade = idade + 2;
		double peso = 72.5;
		String nome = "Rafael";
		
		Scanner teclado = new Scanner(System.in);
		
		/*System.out.println("Digite idade, peso e nome: "); 
		idade = teclado.nextInt();
		peso = teclado.nextDouble(); 
		nome = teclado.next();
		  
		System.out.println("Nome: " + nome); 
		System.out.printf("Idade: %d\n", idade);
		System.out.printf("Peso: %.2f\n", peso);
		*/
		
		/*
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		
		if (idade < 18) {
			System.out.println("Acesso bloqueado");
		}
		else if (idade < 65) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Adulto idoso");
		}
		*/
		
		/*
		for (int i=0; i<10; i++) {
			System.out.println("Valor: " + i);
		}
		*/
		
		//array
		//lista
		int megaSena[] = {11,14,21,30,37,56};
		int numeros[] = new int[200];
		
		System.out.println(megaSena[1]);
		
		numeros[60] = 50;
		megaSena[1] = 16;
		
		System.out.println(megaSena[1]);
		System.out.println(numeros[60]);
	}

}
