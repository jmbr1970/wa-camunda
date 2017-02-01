package com.sh.autonomos.core.persistence.exception;

public class PersistenceException extends Exception {
	
	private static final long serialVersionUID = 4225376275235623958L;

	public PersistenceException(String userMsg, Throwable cause) {
		super(userMsg, cause);
	}
}