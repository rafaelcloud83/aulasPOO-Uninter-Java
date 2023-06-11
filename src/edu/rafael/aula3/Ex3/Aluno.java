package edu.rafael.aula3.Ex3;

public class Aluno {
	String nome;
	int matricula;
	double desconto;
	Curso curso;
	
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	
	void info() {
		System.out.println("Nome aluno: " + nome);
		System.out.println("Matricula aluno: " + matricula);
		System.out.println("Desconto aluno: " + desconto);
		curso.info();
	}
	
	double pagamento() {
		return curso.mensalidade * (1 - desconto);
	}
}
