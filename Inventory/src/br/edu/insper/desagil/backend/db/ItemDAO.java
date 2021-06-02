package br.edu.insper.desagil.backend.db;

import br.edu.insper.desagil.backend.core.exception.APIException;
import br.edu.insper.desagil.backend.core.firestore.FirestoreDAO;
import br.edu.insper.desagil.backend.model.Item;

public class ItemDAO extends FirestoreDAO<Item> {
    public ItemDAO() throws APIException {
        super("itens");
    }
}
