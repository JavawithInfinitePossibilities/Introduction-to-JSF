/**
 * 
 */
package com.sid.jsf.tutorial.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.sid.jsf.tutorial.bean.UserDetails;

/**
 * @author Lenovo
 *
 */
@ManagedBean(name = "dBHelper")
@ApplicationScoped
public class DBHelper {

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public Connection getConnection() {
		Connection connection = null;
		try {
			/* Class.forName("com.mysql.jdbc.Driver"); */
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsfdb", "root", "root");
			connection.setAutoCommit(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public List<UserDetails> getUserDetails() {
		List<UserDetails> userDetailsList = new ArrayList<UserDetails>();
		try {
			this.connection = getConnection();
			String query = "Select * from userdetails";
			this.statement = this.connection.createStatement();
			this.resultSet = this.statement.executeQuery(query);
			while (resultSet.next()) {
				int userId = resultSet.getInt("userId");
				String userName = resultSet.getString("userName");
				String userLastName = resultSet.getString("userLastName");
				int userAge = resultSet.getInt("userAge");
				String userEmail = resultSet.getString("userEmail");
				String userAddress = resultSet.getString("userAddress");
				String userContact = resultSet.getString("userContact");
				String userAltContactDetails = resultSet.getString("userAltContactDetails");
				String userAADHERDetails = resultSet.getString("userAADHERDetails");
				String userPassword = resultSet.getString("userPassword");
				userDetailsList.add(new UserDetails(userId, userName, userLastName, userAge, userEmail, userAddress,
						userContact, userAltContactDetails, userAADHERDetails, userPassword));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				this.connection.close();
				this.statement.close();
				this.resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userDetailsList;
	}
}
