package com.sh.autonomos.bpm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BPMConfigurationServiceImpl implements BPMConfigurationService {

	@Value("${com.sh.wa.bpm.processDefinitionName : demo}")
	private String processDefinitionName;
	
	@Value("${com.sh.wa.bpm.propertyDummy : bye!}")
	private String propertyDummy;
	
	@Value("${com.sh.wa.bpm.otherProperty : not exists!}")
	private String otherProperty;

	/* (non-Javadoc)
	 * @see com.sh.autonomos.bpm.config.service.BPMConfigurationService#getProcessDefinitionName()
	 */
	@Override
	public String getProcessDefinitionName() {
		return this.processDefinitionName;
	}

	/* (non-Javadoc)
	 * @see com.sh.autonomos.bpm.config.service.BPMConfigurationService#getPropertyDummy()
	 */
	@Override
	public String getPropertyDummy() {
		return propertyDummy;
	}

	/* (non-Javadoc)
	 * @see com.sh.autonomos.bpm.config.service.BPMConfigurationService#getOtherProperty()
	 */
	@Override
	public String getOtherProperty() {
		return otherProperty;
	}

}