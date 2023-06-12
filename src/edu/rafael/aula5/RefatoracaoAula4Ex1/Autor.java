package edu.rafael.aula5.RefatoracaoAula4Ex1;

public class Autor {
	//private não é acessado por outras classes, apenas por ela mesma. Para acessar em outras classes deve se usar os getters e setters
	private String nome;
	private String nacionalidade;
	private String email;
	
	public Autor() {}

	public Autor(String nome, String nacionalidade, String email) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}	
	
	public void info() {
		System.out.println("Nome Autor: "+ nome);
		System.out.println("Nacionalidade: "+ nacionalidade);
		System.out.println("Email: "+ email);
	}
}
