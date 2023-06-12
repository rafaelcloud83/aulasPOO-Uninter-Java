package edu.rafael.aula5.abstracts;

public class Main {

	public static void main(String[] args) {
		/*
		Funcionario f1 = new Funcionario("Mario"); 
		System.out.println("Endereço de memória f1: "+ f1);
		//Funcionario f2 = f1;
		Funcionario f2 = new Funcionario("Mario"); 
		System.out.println("Endereço de memória f2: "+ f2);
		System.out.println();
		
		System.out.println("Nome f1: "+ f1.nome);
		System.out.println("Nome f2: "+ f2.nome);
		System.out.println();
		
		f2.nome = "Luigi";
		System.out.println("Nome f1: "+ f1.nome);
		System.out.println("Nome f2: "+ f2.nome);
		System.out.println();
		*/
		
		//Funcionario fa = new Assalariado("Mario", 3500);
		//fa = new Horista("Luigi", 100, 40.5f);
		
		Funcionario funcionarios[] = { new Assalariado("Mario", 3500),
				new Horista("Luigi", 100, 40.5f),
				new Comissionado("Yoshi", 50000, 0.05f)};
		
		Funcionario f;
		float total=0;
		for (int i = 0; i < funcionarios.length; i++) {
			f = funcionarios[i];
			System.out.println(f.nome +" salario: "+f.pagamento());
			total += f.pagamento();
		}
		System.out.println("Total: "+ total);
	}
}
