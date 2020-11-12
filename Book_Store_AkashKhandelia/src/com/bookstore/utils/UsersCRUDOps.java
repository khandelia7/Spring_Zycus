package com.bookstore.utils;

public class UsersCRUDOps {
	public static final String GET_ALL_Users = "SELECT * FROM users";
	public static final String Get_One_Users = "SELECT * FROM users WHERE userId = ?";
	public static final String Create_Users = "INSERT INTO users (userId, email, password, fullName) VALUES (?,?,?,?)";
	public static final String Update_Users = "UPDATE users SET email=?, password=?, fullName=? WHERE userId = ?";
	public static final String Delete_Users = "DELETE FROM users WHERE userId = ?";
}
