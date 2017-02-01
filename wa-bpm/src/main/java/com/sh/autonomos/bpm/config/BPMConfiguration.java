package com.sh.autonomos.bpm.config;


import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.ProcessEngineService;
import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * This class encapsulates all the BPM configuration properties. The idea is to
 * isolate all the configuration details inside this class following the single 
 * response principle. 
 * 
 * The class includes both, regular properties and spring beans due that the class
 * is decorated with @See {@link Configuration} annotation so, this class is used 
 * to populate the spring context. 
 * 
 * @author jmblesa
 *
 */

@Configuration
@ComponentScan("com.sh.autonomos.bpm")
public class BPMConfiguration {
	
	@Bean
	public ProcessEngineService processEngineService() {
		return BpmPlatform.getProcessEngineService();
	}

	@Bean
	public ProcessEngine processEngine() throws Exception {
		return processEngineService().getDefaultProcessEngine();
	}

	@Bean
	public RepositoryService repositoryService() throws Exception {
		return processEngine().getRepositoryService();
	}

	@Bean
	public RuntimeService runtimeService() throws Exception {
		return processEngine().getRuntimeService();
	}

	@Bean
	public TaskService taskService() throws Exception {
		return processEngine().getTaskService();
	}

	@Bean
	public HistoryService historyService() throws Exception {
		return processEngine().getHistoryService();
	}

	@Bean
	public ManagementService managementService() throws Exception {
		return processEngine().getManagementService();
	}
}