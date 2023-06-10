package edu.rafael.aula2.Ex3;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"Mario",2000,500);
		Conta c2 = new Conta(222,"Luigi",3000,1000);
		
		c1.info();
		c2.info();
		
		if(!c1.sacar(200)) {
			System.out.println("Problema ao sacar");
		}
		
		if(!c1.depositar(500)) {
			System.out.println("Problema ao depositar");
		}
		
		c1.info();
		
		if(!c1.transferir(c2,200)) {
			System.out.println("Problema ao transferir\n");
		}
		
		c1.info();
		c2.info();
	}

}
