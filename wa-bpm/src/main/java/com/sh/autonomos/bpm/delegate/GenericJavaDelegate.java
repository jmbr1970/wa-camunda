package com.sh.autonomos.bpm.delegate;


import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GenericJavaDelegate implements JavaDelegate {
 
  private final Logger LOGGER = Logger.getLogger(GenericJavaDelegate.class.getName());
  
  public void execute(DelegateExecution context) throws Exception {
	  
	  context.getCurrentActivityId();
	  
    LOGGER.info("\n\n  ... LoggerDelegate invoked by "
            + "processDefinitionId=" + context.getProcessDefinitionId()
            + ", activtyId=" + context.getCurrentActivityId()
            + ", activtyName='" + context.getCurrentActivityName() + "'"
            + ", processInstanceId=" + context.getProcessInstanceId()
            + ", businessKey=" + context.getProcessBusinessKey()
            + ", executionId=" + context.getId()
            + " \n\n");
    
    if((boolean)context.getVariable("error")){
    	throw new BpmnError("1002", "sorry, something was wrong");
    }
  }
}