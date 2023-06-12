package edu.rafael.aula5.abstracts;

public abstract class Funcionario {
	String nome;

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract float pagamento(); //as classes filhas tem que implementar este método
	
	//public float pagamento() {
		//System.out.println("Processando pagamento");
		//return 0.0f;
	//}
}
