package com.sh.autonomos.bpm.service.impl;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.autonomos.bpm.config.BPMConfigurationService;
import com.sh.autonomos.bpm.service.BPMService;
import com.sh.autonomos.core.service.exception.ServiceException;

@Service
public class CamundaService implements BPMService {

	@Autowired
	ProcessEngine processEngine;

	@Autowired
	BPMConfigurationService bpmConfigurationService;

	@Override
	public String startProcess() throws ServiceException {

		ProcessInstance instance;
		String processId = null;

		try {
			instance = processEngine.getRuntimeService()
					.startProcessInstanceByKey(bpmConfigurationService.getProcessDefinitionName());

			processId = instance.getProcessInstanceId();

		} catch (ProcessEngineException pee) {
			throw new ServiceException(pee.getMessage(), pee);
		}

		return processId;

	}

	public void claimTask(String taskId, String userId) throws ServiceException {

		try {
			processEngine.getTaskService().claim(taskId, userId);
		} catch (ProcessEngineException pee) {
			throw new ServiceException(pee.getMessage(), pee);
		}
	}

	@Override
	public void setAsignee(String taskId, String userId) throws ServiceException {

		try {
			processEngine.getTaskService().setAssignee(taskId, userId);
		} catch (ProcessEngineException pee) {
			throw new ServiceException(pee.getMessage(), pee);
		}
	}
}