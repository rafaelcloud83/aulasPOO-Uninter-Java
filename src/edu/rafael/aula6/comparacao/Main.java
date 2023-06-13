package edu.rafael.aula6.comparacao;

public class Main {

	public static void main(String[] args) {
		/*
		String s1 = new String("MSG"); //0x1001
		String s2 = new String("MSG"); //0x1002
		String s3 = s1; //0x1001
				
		//compara o endereço na memória
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println();
		
		//compara o conteúdo
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		*/
		
		Usuario u1 = new Usuario(111, "Mario", "11111111111");
		Usuario u2 = new Usuario(111, "Mario", "11111111111");
		Usuario u3 = u1;
		
		System.out.println(u1 == u2);
		System.out.println(u1 == u3);
		
		System.out.println();
		
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
		
		System.out.println();
		
		System.out.println(u1);
	}
}
