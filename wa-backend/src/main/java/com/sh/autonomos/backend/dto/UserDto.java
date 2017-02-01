package com.sh.autonomos.backend.dto;

/**
 * This is the info returned to the client to get the user info
 * 
 * 
 * @author jmblesa
 *
 */
public class UserDto {
	
	public final String id;
	public final String first;
	public final String last;
	
	public UserDto(String id, String first, String last) {
		
		this.id = id;
		this.first = first;
		this.last = last;
	}
	
}