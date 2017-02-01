package com.sh.autonomos.security.service.impl;

import org.springframework.stereotype.Service;

import com.sh.autonomos.security.model.User;
import com.sh.autonomos.security.service.UserService;

/**
 * This class is in charge to get the user details 
 * 
 * @author jmblesa
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	/* (non-Javadoc)
	 * @see com.sh.autonomos.security.service.impl.UserService#getUser(java.lang.String)
	 */
	@Override
	public User getUser(String username) {
		return new User(username, "dummy", "surnameDummy", "dummy@dummy.net", new String[]{"tramitador"});
	}
}