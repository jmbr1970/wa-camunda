package com.sh.autonomos.core.persistence.config;

public interface PersistenceConfigService {

	String getJndiBackendDS();

	String getEntitiesPackage();

	String getDialect();

	String getHbm2ddlauto();

	String getUseSecondCache();

}