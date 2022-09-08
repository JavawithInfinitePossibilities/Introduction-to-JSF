/**
 * 
 */
package com.sid.jsf.tutorial;

import javax.faces.bean.ManagedBean;

/**
 * @author Lenovo
 *
 */
@ManagedBean
public class Login {

	private String email;
	private String password;

	public Login() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return "Password is hidden!!!";
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
