package com.sh.autonomos.backend.controller;

import com.sh.autonomos.backend.dto.StartProcessDto;

/**
 * Rest API related to process management
 * 
 * 
 * @author jmblesa
 *
 */
public interface DemoController {
	
	public static final String BASE_URI = "/service"; 

	/**
	 * Starts a process
	 * 
	 * @return
	 */
	public StartProcessDto startProcess();

}