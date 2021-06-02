package br.edu.insper.desagil.backend.api;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.edu.insper.desagil.backend.core.Endpoint;
import br.edu.insper.desagil.backend.core.exception.APIException;
import br.edu.insper.desagil.backend.core.exception.DBException;
import br.edu.insper.desagil.backend.db.ItemDAO;
import br.edu.insper.desagil.backend.model.Item;

public class ItemEndpoint extends Endpoint<Item>{
	public ItemEndpoint() {
        super("/item");
    }
	
	@Override
	public Item get(Map<String, String> args) throws APIException {
		ItemDAO dao = new ItemDAO();
		Item item;
	    try {
	    	item = dao.retrieve(args.get("codigo"));
	    } catch (DBException exception) {
	        return null;
	    }
	    return item;
	}
	
	@Override
	public Map<String, String> post(Map<String, String> args, Item item) throws APIException {
		ItemDAO dao = new ItemDAO();
	    Date date;
	    try {
	        date = dao.create(item);
	    } catch (DBException exception) {
	        return null;
	    }
	    Map<String, String> body = new HashMap<>();
	    body.put("date", date.toString());
	    return body;
	}
	
	@Override
	public Map<String, String> put(Map<String, String> args, Item item) throws APIException {
		ItemDAO dao = new ItemDAO();
	    Date date;
	    try {
	        date = dao.update(item);
	    } catch (DBException exception) {
	        return null;
	    }
	    Map<String, String> body = new HashMap<>();
	    body.put("date", date.toString());
	    return body;
	}
	
	@Override
	public Map<String, String> delete(Map<String, String> args) throws APIException {
		ItemDAO dao = new ItemDAO();
	    Date date;
	    try {
	        date = dao.delete(args.get("codigo"));
	    } catch (DBException exception) {
	        return null;
	    }
	    Map<String, String> body = new HashMap<>();
	    body.put("date", date.toString());
	    return body;
	}
	
}