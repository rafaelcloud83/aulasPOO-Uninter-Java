package edu.rafael.aula3.Ex1Ex2;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	public Nota() {}
	
	public Nota(double nota1, double nota2, int faltas) {
		setNota1(nota1);
		setNota2(nota2);
		setFaltas(faltas);
	}

	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		if (nota1<0 || nota1>10) {
			System.out.println("Nota inválida");
			return;
		}
		else {
			this.nota1 = nota1;
		}
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		if (nota2<0 || nota2>10) {
			System.out.println("Nota inválida");
			return;
		}
		else {
			this.nota2 = nota2;
		}
	}
	
	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	void resultado() {
		double media = (nota1 + nota2)/2;
		System.out.println("Média: " + media);
		
		if (faltas > 7) {
			System.out.println("Reprovado por faltas");
		}
		else if (media < 4) {
			System.out.println("Reprovado por notas");
		}
		else if (media < 7) {
			System.out.println("Exame Final");			
		}
		else {
			System.out.println("Aprovado");
		}
		System.out.println();
	}
}
