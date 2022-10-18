/**
 * 
 */
package com.sid.jsf.tutorial.DBO;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.sid.jsf.tutorial.bean.UserDetails;
import com.sid.jsf.tutorial.connection.DBHelper;

/**
 * @author Lenovo
 *
 */
@ManagedBean(name = "userDetailsController")
@ApplicationScoped
public class UserDetailsController {

	private List<UserDetails> userDetailsList;

	@ManagedProperty(value = "#{dBHelper}")
	private DBHelper helper;

	public UserDetailsController() {
	}

	public List<UserDetails> getUserDetailsList() {
		return userDetailsList;
	}

	public void setUserDetailsList(List<UserDetails> userDetailsList) {
		this.userDetailsList = userDetailsList;
	}

	public DBHelper getHelper() {
		return helper;
	}

	public void setHelper(DBHelper helper) {
		this.helper = helper;
	}

	@PostConstruct
	public void init() {
		this.userDetailsList = this.helper.getUserDetails();
	}

}
