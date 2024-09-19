package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Login {

	@Id
	private String username;
	private String passcode;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public Login() {
		// TODO Auto-generated constructor stub
	}
	public Login(String username, String passcode) {
		this.username = username;
		this.passcode = passcode;
	}
	
	
}
