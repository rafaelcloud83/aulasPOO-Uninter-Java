package edu.rafael.aula4;

public class LivroDigitalEx {
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	//novo
	public String linkDownload;
	public int tamanhoMB;
	
	public float lucro() {
		return precoVenda - custoProducao;
	}
	
	public void imprimirTitulo() {
		System.out.println("O título: " + titulo);
	}
	
	//mudou
	public float imposto() {
		return 0.2f * lucro() + 2; 
	}
	
	//novo
	public float tamanhoPorPagina() {
		return tamanhoMB / (float) paginas;
	}
}
