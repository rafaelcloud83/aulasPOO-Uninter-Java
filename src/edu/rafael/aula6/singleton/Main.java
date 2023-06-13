package edu.rafael.aula6.singleton;

public class Main {

	public static void main(String[] args) {
		//cria uma só instancia para o ciclo de vida todo
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.numero += 10;
		
		System.out.println(s1.numero);
		System.out.println(s2.numero);
		
		s2.numero += 40;
		
		System.out.println(s1.numero);
		System.out.println(s2.numero);
	}
}
