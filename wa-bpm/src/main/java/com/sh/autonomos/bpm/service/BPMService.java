package com.sh.autonomos.bpm.service;

import com.sh.autonomos.core.service.exception.ServiceException;

/**
 * This interface includes all the methods needed to interact with a BPM engine.
 * 
 * @author jmblesa
 *
 */
public interface BPMService {

	/**
	 * Starts a new service at customer home.
	 * 
	 * @return
	 */
	public String startProcess() throws ServiceException;

	/**
	 * A user claims a task
	 * 
	 * @param taskId
	 *            the task identification into BPM engine.
	 * @param userId
	 *            The owner of the task who will be the responsible to execute
	 *            it.
	 */
	public void claimTask(String taskId, String userId) throws ServiceException;

	/**
	 * Grants an user for executing the task
	 * 
	 * @param taskId
	 * @param userId
	 */
	public void setAsignee(String taskId, String userId) throws ServiceException;

}