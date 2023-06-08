package edu.rafael.aula1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String msg;
		int valorCorreto = 10000;
		System.out.println("Digite seu palpite: ");
		int palpite = teclado.nextInt();
		
		while (palpite != valorCorreto) {
			
			/*
			if (palpite > valorCorreto) {
				System.out.println("Um pouco menos...");
			}
			else {
				System.out.println("Um pouco mais...");
			}
			*/
			
			msg = palpite > valorCorreto ? "Um pouco menos...":"Um pouco mais...";
			System.out.println(msg);
			
			System.out.println("Digite outro palpite: ");
			palpite = teclado.nextInt();
		}
		
		System.out.println("Parabéns você acertou!!!");
	}

}
