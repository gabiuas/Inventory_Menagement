package br.edu.insper.desagil.backend.model;

public class Produto {
	private String codigo, nome;

	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
}
