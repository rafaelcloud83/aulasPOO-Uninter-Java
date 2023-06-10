package edu.rafael.aula2.Ex2;

import edu.rafael.aula2.Ex1.Avaliacao;

public class Aluno {
	String nome;
	String curso;
	Avaliacao notas;
	
	public Aluno() {
	
	}
	
	public Aluno(String nome, String curso, Avaliacao notas) {
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}

	void info() {
		System.out.println("Nome: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Media A: " + notas.mediaAritmetica());
		System.out.println("Media P: " + notas.mediaPonderada());
		System.out.println();
	}
}
