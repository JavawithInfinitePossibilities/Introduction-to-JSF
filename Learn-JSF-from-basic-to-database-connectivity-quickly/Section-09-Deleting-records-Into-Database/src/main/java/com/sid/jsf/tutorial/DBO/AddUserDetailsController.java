/**
 * 
 */
package com.sid.jsf.tutorial.DBO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.sid.jsf.tutorial.bean.UserDetails;
import com.sid.jsf.tutorial.connection.DBHelper;

/**
 * @author Lenovo
 *
 */
@ManagedBean(name = "addUserDetailsController")
public class AddUserDetailsController {
	@ManagedProperty(value = "#{dBHelper}")
	private DBHelper helper;

	@ManagedProperty(value = "#{uerDetails}")
	private UserDetails details;

	public AddUserDetailsController() {
	}

	public DBHelper getHelper() {
		return helper;
	}

	public void setHelper(DBHelper helper) {
		this.helper = helper;	
	}

	public UserDetails getDetails() {
		return details;
	}

	public void setDetails(UserDetails details) {
		this.details = details;
	}

	public String addUser() {
		boolean saveDetails = this.helper.saveDetails(details);
		return "Welcome?faces-redirect=true";
	}
}
