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
@ManagedBean(name = "updateUserDetailsController")
public class updateUserDetailsController {

	@ManagedProperty(value = "#{uerDetails}")
	private UserDetails userDetail;

	@ManagedProperty(value = "#{dBHelper}")
	private DBHelper helper;

	public updateUserDetailsController() {
	}

	public UserDetails getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetails userDetail) {
		this.userDetail = userDetail;
	}

	public DBHelper getHelper() {
		return helper;
	}

	public void setHelper(DBHelper helper) {
		this.helper = helper;
	}

	public void init(int user_ID) {
		this.userDetail = this.helper.getUserDetail(user_ID);
	}

	public String updateUser() {
		boolean updateUserDetail = this.helper.updateUserDetail(this.userDetail);
		return "Welcome?faces-redirect=true";
	}
}
