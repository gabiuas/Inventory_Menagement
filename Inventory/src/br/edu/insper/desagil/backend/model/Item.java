package br.edu.insper.desagil.backend.model;

public class Item {
	private Produto produto;
	private int quatidade;
	
	public Item(Produto produto, int quatidade) {
		super();
		this.produto = produto;
		this.quatidade = 0;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void aumentaQuantidade() {
		this.quatidade += 1;
	}
	
}
