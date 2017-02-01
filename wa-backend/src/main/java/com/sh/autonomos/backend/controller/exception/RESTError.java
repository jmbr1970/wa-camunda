package com.sh.autonomos.backend.controller.exception;

import java.util.Date;

/**
 * This class encapsulates all error information in a readable-human way 
 * that will be returned to the client after an error occurred during 
 * processing a REST request.
 * 
 * @author jmblesa
 *
 */
public class RESTError {
	
	private final String userMsg;
	private final int    httpStatus;
	private final long   timestamp;
	
	public RESTError(String userMsg, int httpStatus) {
		
		this.userMsg = userMsg;
		this.httpStatus = httpStatus;
		this.timestamp = new Date().getTime();
	}

	public String getUserMsg() {
		return userMsg;
	}
	
	public int getHttpStatus() {
		return httpStatus;
	}

	public long getTimestamp() {
		return timestamp;
	}
}