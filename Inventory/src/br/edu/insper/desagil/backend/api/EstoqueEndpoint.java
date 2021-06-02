package br.edu.insper.desagil.backend.api;

import br.edu.insper.desagil.backend.core.Endpoint;
import br.edu.insper.desagil.backend.model.Estoque;

public class EstoqueEndpoint extends Endpoint<Estoque>{
	public EstoqueEndpoint() {
        super("/estoque");
    }
}