package com.sh.autonomos.core.service.exception;

public class ServiceException extends Exception {
	
	private static final long serialVersionUID = 4225376275235623958L;

	public ServiceException(String userMsg, Throwable cause) {
		super(userMsg, cause);
	}
}