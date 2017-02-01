package com.sh.autonomos;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sh.autonomos.backend.config.BackendConfig;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	// @Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { BackendConfig.class };
	}

	// @Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	// @Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}