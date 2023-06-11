package edu.rafael.aula3.Ex4;

public class Main {

	public static void main(String[] args) {
		Cofrinho c = new Cofrinho();
		
		c.add(new Moeda("Euro",0.5));
		c.add(new Moeda("Euro",1));
		c.add(new Moeda("Euro",0.1));
		c.add(new Moeda("Euro",0.05));
		
		System.out.printf("O total do cofrinho é: %.2f", c.calcularTotal());
	}

}
