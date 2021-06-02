package br.edu.insper.desagil.backend.model;

import br.edu.insper.desagil.backend.core.firestore.FirestoreEntity;

public class Item extends FirestoreEntity{
	private int codigo;
	private String nome;
	private int quatidade;
	
	public Item(int codigo, String nome, int quatidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quatidade = quatidade;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void aumentaQuantidade() {
		this.quatidade += 1;
	}

	@Override
	public String key() {
		return Integer.toString(codigo);
	}
	
}
