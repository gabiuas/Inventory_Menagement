package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private List<Item> itens;

	public Estoque() {
		super();
		this.itens = new ArrayList<>();
	}
	
	public void adicionaItem(Item addItem) {
		boolean ad = true;
		if (itens.isEmpty() == false) {
			for (Item item: this.itens) {
				if (item.getProduto().getCodigo() == addItem.getProduto().getCodigo()) {
					item.aumentaQuantidade();
					ad = false;
					break;
				}
			}
		}
		if (ad == true) {
			itens.add(addItem);
		}
	}

}
