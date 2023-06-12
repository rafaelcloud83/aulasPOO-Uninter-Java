package edu.rafael.aula5.RefatoracaoAula4Ex1;

public class Main {

	public static void main(String[] args) {
		LivroDigital ld = new LivroDigital("Senhor dos Aneis", 
				new Autor("Tolkien", "Britânico", "tolkien@email.com"), 
				"Aventura", 5, 10000, 3500);
		ld.info();
		System.out.println();
		
		//Livro l = new Livro("Sherlock Holmes", 
				//new Autor("Sir Arthur Conan Doyle", "Britânico", "conan@email.com"),
				//"Aventura", 2);
		
		LivroFisico lf = new LivroFisico("Sherlock Holmes", 
				new Autor("Sir Arthur Conan Doyle", "Britânico", "conan@email.com"),
				"Aventura", 2, 50000, 2500);
		lf.info();
		System.out.println();
		
		Livro livro;
		livro = ld;
		livro.info();
		System.out.println();
		
		livro = lf;
		livro.info();
	}

}
