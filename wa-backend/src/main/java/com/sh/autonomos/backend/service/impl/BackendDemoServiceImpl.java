package com.sh.autonomos.backend.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sh.autonomos.backend.service.BackendDemoService;
import com.sh.autonomos.core.service.exception.ServiceException;

@Service
@Transactional
public class BackendDemoServiceImpl implements BackendDemoService {

	@Transactional(propagation = Propagation.REQUIRED)
	public void doSomething() throws ServiceException {

		try {
			throw new ServiceException("Error from service layer...", new Exception());
		} finally {}
	}
}