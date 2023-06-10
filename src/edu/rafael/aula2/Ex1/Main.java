package edu.rafael.aula2.Ex1;

public class Main {

	public static void main(String[] args) {
		Avaliacao rafael = new Avaliacao(7,4,10);
		
		Avaliacao joao = new Avaliacao();
		joao.n1 = 8;
		joao.n2 = 3;
		joao.n3 = 7.5;
		
		System.out.println("Media Aritmética do Rafael: " + rafael.mediaAritmetica());
		System.out.println("Media Ponderada do Rafael: " + rafael.mediaPonderada());
		
		System.out.println("Media Aritmética do João: " + joao.mediaAritmetica());
		System.out.println("Media Ponderada do João: " + joao.mediaPonderada());
	}

}
