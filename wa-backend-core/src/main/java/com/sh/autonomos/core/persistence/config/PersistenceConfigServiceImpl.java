package com.sh.autonomos.core.persistence.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PersistenceConfigServiceImpl implements PersistenceConfigService {

	@Value("${com.sh.wa.core.persistence.jndi.backendDS}")
	private String jndiBackendDS;

	@Value("${com.sh.wa.core.persistence.entities.package}")
	private String entitiesPackage;

	@Value("${com.sh.wa.core.persistence.hibernate.dialect}")
	private String dialect;

	@Value("${com.sh.wa.core.persistence.hibernate.hbm2ddl.auto}")
	private String hbm2ddlauto;

	@Value("${com.sh.wa.core.persistence.hibernate.use-second-cache}")
	private String useSecondCache;

	/* (non-Javadoc)
	 * @see com.sh.autonomos.core.persistence.config.PersistenceConfigService#getJndiBackendDS()
	 */
	@Override
	public String getJndiBackendDS() {
		return jndiBackendDS;
	}

	/* (non-Javadoc)
	 * @see com.sh.autonomos.core.persistence.config.PersistenceConfigService#getEntitiesPackage()
	 */
	@Override
	public String getEntitiesPackage() {
		return entitiesPackage;
	}

	/* (non-Javadoc)
	 * @see com.sh.autonomos.core.persistence.config.PersistenceConfigService#getDialect()
	 */
	@Override
	public String getDialect() {
		return dialect;
	}

	/* (non-Javadoc)
	 * @see com.sh.autonomos.core.persistence.config.PersistenceConfigService#getHbm2ddlauto()
	 */
	@Override
	public String getHbm2ddlauto() {
		return hbm2ddlauto;
	}

	/* (non-Javadoc)
	 * @see com.sh.autonomos.core.persistence.config.PersistenceConfigService#getUseSecondCache()
	 */
	@Override
	public String getUseSecondCache() {
		return useSecondCache;
	}

}
