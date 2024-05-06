package com.bruno.pereira.silva.os.services.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.bruno.pereira.silva.os.resources.exceptions.StandardError;

public class ValidationError extends StandardError{
	
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessade> erros = new ArrayList<>();

	public ValidationError() {
		super();
	}

	public ValidationError(Long timestamp, Integer status, String erros) {
		super(timestamp, status, erros);
	}

	public List<FieldMessade> getErrors(){
		return erros;
	}
	
	public void addErro(String fieldName, String message) {
		this.erros.add(new FieldMessade(fieldName, message));
	}
	
	
}
