package edu.rafael.aula2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		Aluno a = new Aluno();
		a.nome = "Rafael";
		a.matricula = 1001;
		a.cpf = "12345678910";
		
		a.info();
		
		a.nome = "Rafael Silva";
		
		a.info();
		*/
		
		/*
		Carro c = new Carro();
		System.out.println(c.milhasParaMetros(10));
		System.out.println(Carro.milhasParaMetros(10));
		*/
		
		/*
		Turma nova = new Turma();
		nova.prof = new Professor();
		nova.prof.nome = "Rafael";
		nova.alunos = new ArrayList<>();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome = "Super Mario";
		*/
		
		Aluno b = new Aluno(1002, "Super Luigi", "11122233344");
		b.info();
		Aluno c = new Aluno(1003);
		c.info();
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		alunos.add(c);
		alunos.add(new Aluno(1004, "Yoshi", "11111111111"));
	}

}
