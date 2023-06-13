package edu.rafael.aula6.Ex2;

public class Main {
	
	public static int[] instanciaArray(int n) {
		return new int[n];
	}

	public static void main(String[] args) {
		int tamanho = -10;
		//int tamanho = 10;
		int arr[] = null;
		
		try {
			arr = instanciaArray(tamanho);
			for (int i = 0; i < tamanho; i++) {
				System.out.println(arr[i]);
			}
		} catch (NegativeArraySizeException e) {
			System.out.println("Valor inválido!");
			System.out.println(e);
		}
	}
}
