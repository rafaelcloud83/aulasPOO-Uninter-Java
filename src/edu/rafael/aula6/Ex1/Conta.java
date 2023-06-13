package edu.rafael.aula6.Ex1;

public class Conta {
	String nome;
	double saldo;
	
	public Conta(String nome, double saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
	}
	
	void depositar(double valor) {
		if (valor<0) {
			throw new RuntimeException("Valor inválido!");
		}
		saldo += valor;
	}
	
	void sacar(double valor) throws Exception { //exceção do tipo Exception deve ser tratadas
		if (valor>saldo) {
			throw new Exception("Saldo insuficiente!");
		}
		if (valor<0) {
			throw new Exception("Valor inválido!");
		}
		saldo -= valor;
	}
	
	/*
	void sacar(double valor) {
		if (valor>saldo) {
			throw new RuntimeException("Saldo insuficiente!");
		}
		if (valor<0) {
			throw new RuntimeException("Valor inválido!");
		}
		saldo -= valor;
	}
	*/
	
	void transferir(double valor, Conta destino) throws Exception {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	void info() {
		System.out.println("------------------");
		System.out.println("Nome: "+ nome);
		System.out.println("Saldo: "+ saldo);
	}
}
