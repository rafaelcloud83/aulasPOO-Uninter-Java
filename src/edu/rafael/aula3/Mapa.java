package edu.rafael.aula3;

import java.util.HashMap;

public class Mapa {
	public static void main(String[] args) {
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Brasil", "Brasilia");
		capitais.put("Argentina", "Buenos Aires");
		capitais.put("Paraguai", "Assunção");
		capitais.put("Uruguai", "Montevideu");
		
		System.out.println(capitais);
		System.out.println(capitais.get("Uruguai"));
	}
}
