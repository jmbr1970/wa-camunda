package com.sh.autonomos.backend.controller.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

	/**
	 * All the controllers will throw a @see {@link ControllerException} when something wrong
	 * occurs. The goal is to send back to the browser all the error information encapsulate
	 * inside in a @see {@link RESTError} object.  
	 * 
	 * @param be
	 * @param request
	 * @return
	 */
	@ExceptionHandler(ControllerException.class)
	public ResponseEntity<RESTError> handleBackendException(ControllerException be, HttpServletRequest request) {

		RESTError error = new RESTError(be.getErrMsg(), HttpStatus.INTERNAL_SERVER_ERROR.value());
		return new ResponseEntity<RESTError>(error, null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}