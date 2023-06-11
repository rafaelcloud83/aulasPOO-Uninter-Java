package edu.rafael.aula3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExDataHora {

	public static void main(String[] args) {
		//LocalDate dataHoje = LocalDate.now(); //só para data
		LocalDateTime dataHoje = LocalDateTime.now();
		System.out.println(dataHoje);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss - EEEE");
		System.out.println(dataHoje.format(formatador));
	}

}
