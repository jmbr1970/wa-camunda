package com.sh.autonomos.security.service;

import com.sh.autonomos.security.model.User;

/**
 * This interface defines the methods to JWT token management
 *  
 * @author jmblesa
 *
 */
public interface JwtService {
	
	public String createTokenFor(User user);

}
