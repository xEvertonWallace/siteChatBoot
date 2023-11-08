package com.chatboot.models;

public class Estabelecimento {
	int id;
	String cpfCnpj;
	long telefone;
	String nome;
	
	public Estabelecimento(int id, String cpfCnpj, long telefone, String nome) {
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
		return "Estabelecimento [cpfCnpj=" + cpfCnpj + ", telefone=" + telefone + ", nome=" + nome + "]";
	}
	
	
}
