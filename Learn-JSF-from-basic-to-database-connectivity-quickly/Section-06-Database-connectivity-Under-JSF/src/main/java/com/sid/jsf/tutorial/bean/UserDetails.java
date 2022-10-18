/**
 * 
 */
package com.sid.jsf.tutorial.bean;

import javax.faces.bean.ManagedBean;

/**
 * @author Lenovo
 *
 */
public class UserDetails {
	private int userId;
	private String userName;
	private String userLastName;
	private int userAge;
	private String userEmail;
	private String userAddress;
	private String userContact;
	private String userAltContactDetails;
	private String userAADHERDetails;
	private String userPassword;

	public UserDetails() {
	}

	public UserDetails(int userId, String userName, String userLastName, int userAge, String userEmail,
			String userAddress, String userContact, String userAltContactDetails, String userAADHERDetails,
			String userPassword) {
		this.userId = userId;
		this.userName = userName;
		this.userLastName = userLastName;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userContact = userContact;
		this.userAltContactDetails = userAltContactDetails;
		this.userAADHERDetails = userAADHERDetails;
		this.userPassword = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserAltContactDetails() {
		return userAltContactDetails;
	}

	public void setUserAltContactDetails(String userAltContactDetails) {
		this.userAltContactDetails = userAltContactDetails;
	}

	public String getUserAADHERDetails() {
		return userAADHERDetails;
	}

	public void setUserAADHERDetails(String userAADHERDetails) {
		this.userAADHERDetails = userAADHERDetails;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", userLastName=" + userLastName
				+ ", userAge=" + userAge + ", userEmail=" + userEmail + ", userAddress=" + userAddress
				+ ", userContact=" + userContact + ", userAltContactDetails=" + userAltContactDetails
				+ ", userAADHERDetails=" + userAADHERDetails + ", userPassword=" + userPassword + "]";
	}

}
