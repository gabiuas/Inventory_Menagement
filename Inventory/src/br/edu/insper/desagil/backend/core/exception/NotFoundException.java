package br.edu.insper.desagil.backend.core.exception;

import jakarta.servlet.http.HttpServletResponse;

public class NotFoundException extends APIException {
	private static final long serialVersionUID = -6564219390891941064L;

	public NotFoundException(String message) {
		super(HttpServletResponse.SC_NOT_FOUND, message);
	}
}
