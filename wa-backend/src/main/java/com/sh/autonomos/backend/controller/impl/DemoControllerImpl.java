package com.sh.autonomos.backend.controller.impl;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sh.autonomos.backend.controller.BaseController;
import com.sh.autonomos.backend.controller.DemoController;
import com.sh.autonomos.backend.dto.StartProcessDto;
import com.sh.autonomos.backend.controller.exception.ControllerException;
import com.sh.autonomos.core.service.exception.ServiceException;

@RestController
public class DemoControllerImpl extends BaseController implements DemoController {

	@Override
	@RequestMapping(value = BASE_URI + "/new", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public StartProcessDto startProcess() {

		StartProcessDto startProcessDto = new StartProcessDto();

		try {
			startProcessDto.setProcessId(bpmService.startProcess());
		} catch (ServiceException bpme) {
			throw new ControllerException("ERROR STARTING PROCESS" , bpme.getCause());
		}

		return startProcessDto;
	}
}