package com.sh.autonomos.bpm.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.camunda.bpm.engine.test.assertions.ProcessEngineAssertions.assertThat;
import static org.camunda.bpm.engine.test.assertions.ProcessEngineAssertions.init;
import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.complete;
import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.runtimeService;
import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.task;

import org.apache.ibatis.logging.LogFactory;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.sh.autonomos.bpm.config.BPMConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BPMConfiguration.class, loader = AnnotationConfigContextLoader.class)
@TestPropertySource("classpath:bpmConfig.properties")
public class CamundaServiceTest {

	private static String processToTest = null;
	
	@Autowired
	String processDefinition;

	@Rule
	public ProcessEngineRule rule = new ProcessEngineRule();

	static {
		LogFactory.useSlf4jLogging();
	}

	@Before
	public void setup() {
		init(rule.getProcessEngine());
	}

	@Test
	@Deployment(resources = { "demo.bpmn" })
	public void testStartANewProcess() {

		// Given a new process instance started
		ProcessInstance processInstance = runtimeService().startProcessInstanceByKey(processToTest, "RACC:12345");

		// Then the process instance is active (the process token is waiting for
		// task completion)
		assertThat(processInstance).isActive(); // The process instance is
												// active.

		// Given we complete the task
		complete(task(processInstance));

		// Then there's one instance process active
		assertThat(runtimeService().createProcessInstanceQuery().processDefinitionKey(processToTest).active().count())
				.isEqualTo(new Long(1));
	}
}