package com.chatboot.models;

public class Cliente {
	int id;
	String cpfCnpj;
	long telefone;
	String nome;
	
	
	public Cliente(int id, String cpfCnpj, long telefone, String nome) {
		this.id = id;
		this.cpfCnpj = cpfCnpj;
		this.telefone = telefone;
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return "Cliente [cpfCnpj=" + cpfCnpj + ", telefone=" + telefone + ", nome=" + nome + "]";
	}
	
	
	
}
