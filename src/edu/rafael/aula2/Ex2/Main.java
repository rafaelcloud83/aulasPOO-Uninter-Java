package edu.rafael.aula2.Ex2;

import edu.rafael.aula2.Ex1.Avaliacao;

public class Main {

	public static void main(String[] args) {
		//Avaliacao avaliacao = new Avaliacao(9,10,3);
		//Aluno a1 = new Aluno("Mario", "Encanador", avaliacao);
		Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(9,10,3));
		Aluno a2 = new Aluno("Luigi", "Encanador", new Avaliacao(4,1,10));
		
		a1.info();
		a2.info();
	}

}
