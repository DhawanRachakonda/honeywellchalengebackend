package com.stockticker.documents;

import java.util.Arrays;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	private String userName;
	private int userId;
	private Set<UserStocks> userStocks;
	private char[] password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Set<UserStocks> getUserStocks() {
		return userStocks;
	}
	public void setUserStocks(Set<UserStocks> userStocks) {
		this.userStocks = userStocks;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", userStocks=" + userStocks + ", password="
				+ Arrays.toString(password) + "]";
	}
	
}
