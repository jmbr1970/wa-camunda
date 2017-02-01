package com.sh.autonomos.backend.controller.exception;


/**
 * This is the unique exception that will be used as return error back to the client.
 * 
 * @author jmblesa
 *
 */
public class ControllerException extends RuntimeException {

	private static final long serialVersionUID = -8831192905918163432L;
		
	private String errMsg = null;
	
	public ControllerException(String errMsg, Throwable cause) {
		super(cause.getMessage(), cause);
		this.errMsg = errMsg;
	}
	
	public String getErrMsg() {
		return errMsg;
	}	
}