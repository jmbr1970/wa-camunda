package com.sh.autonomos.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.sh.autonomos.bpm.service.BPMService;

public abstract class BaseController {

	@Autowired
	protected BPMService bpmService;

}