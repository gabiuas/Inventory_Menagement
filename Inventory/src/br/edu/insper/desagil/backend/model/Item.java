package br.edu.insper.desagil.backend.model;

import br.edu.insper.desagil.backend.core.firestore.FirestoreEntity;

public class Item extends FirestoreEntity{
	private int codigo;
	private String nome;
	private int quatidade;

	public Item() {
		super();
	}

	public Item(int codigo, String nome, int quatidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quatidade = quatidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}

	public void aumentaQuantidade() {
		this.quatidade += 1;
	}

	@Override
	public String key() {
		return Integer.toString(codigo);
	}
	
}
