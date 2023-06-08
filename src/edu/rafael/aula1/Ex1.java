package edu.rafael.aula1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//programa IMC
		//int peso;
		//double altura;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso seguido de altura: ");
		int peso = teclado.nextInt();
		double altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f",imc);
	}

}
