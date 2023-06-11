package edu.rafael.aula4.Ex2;

public class Main {

	public static void main(String[] args) {
		IngressoVip iv = new IngressoVip("Rock in Rio", 200, 100);
		iv.info();
		
		Ingresso i = new Ingresso("Rock in Rio Pardo", 50);
		i.info();
	}
}
