package edu.rafael.aula4;

public class LivroDigital extends Livro {
	public String linkDownload;
	public int tamanhoMB;
	
	public LivroDigital(String titulo, String autor, String linkDownload) {
		super(titulo,autor);
		this.linkDownload = linkDownload;
	}
	
	//mudou
	public float imposto() {
		return super.imposto() + 2; 
	}
		
	//novo
	public float tamanhoPorPagina() {
		return tamanhoMB / (float) paginas;
	}
	
	public void imprimirImposto() {
		System.out.println("Imposto livro Fisico: " + super.imposto()); //classe mãe Livro
		System.out.println("Imposto livro Digital: " + this.imposto()); //classe filha LivroDigital, pode ser só imposto(), pois o método se encontra nela
	}
}
