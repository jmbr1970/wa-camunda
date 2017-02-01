package com.sh.autonomos.security.model;

public final class User {

	private final String username;
	private final String name;
	private final String surname;
	private final String email;
	private final String[] roles;
	
	
	public User(String username, String name, String surname, String email, String[] role){
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.roles = role;
	}

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public String[] getRoles() {
		return roles.clone();
	}
}