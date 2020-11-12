package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.model.Users;
import com.bookstore.utils.DBConnect;
import com.bookstore.utils.UsersCRUDOps;

public class UsersDAO {

	private List<Users> listUsers = new ArrayList<Users>();

	public List<Users> listAllUsers() {
		Connection connection = DBConnect.getConnection();
		try {
			if (connection != null) {
				PreparedStatement stmt = connection.prepareStatement(UsersCRUDOps.GET_ALL_Users);
				// get data from DB, construct a list
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					int userId = rs.getInt("userId");
					String email = rs.getString("email");
					String password = rs.getString("password");
					String fullName = rs.getString("fullName");
					Users users = new Users(userId, email, password, fullName);
					listUsers.add(users);
				}
			} else {
				System.out.println("Could Not Connect to DB");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listUsers;
	}

	public Users getUsers(int userId) {
		Connection connection = DBConnect.getConnection();
		try {
			if (connection != null) {
				PreparedStatement stmt = connection.prepareStatement(UsersCRUDOps.Get_One_Users);
				// get data from DB, construct a user
				stmt.setInt(1, userId);
				ResultSet rs = stmt.executeQuery();
				rs.next();
				int userid = rs.getInt("userId");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String fullName = rs.getString("fullName");
				Users users = new Users(userid, email, password, fullName);
				return users;
			} else {
				System.out.println("Could Not Connect to DB");
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Users createUsers(Users users) {
		Connection connection = DBConnect.getConnection();
		try {
			if (connection != null) {
				PreparedStatement stmt = connection.prepareStatement(UsersCRUDOps.Create_Users);
				stmt.setInt(1, users.getUserId());
				stmt.setString(2, users.getEmail());
				stmt.setString(3, users.getPassword());
				stmt.setString(4, users.getFullName());
				int result = stmt.executeUpdate();
				if (result > 0)
					System.out.println("Inserted...");
				return users;
			} else {
				System.out.println("Could Not Connect to DB");
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Users updateUsers(Users users) {
		UsersDAO usersDAO = new UsersDAO();
		List<Users> listUsers = usersDAO.listAllUsers();
		boolean status = usersDAO.findUsers(users.getUserId(), listUsers);
		Connection connection = DBConnect.getConnection();
		try {
			if (connection != null) {
				if(status) {
					PreparedStatement stmt = connection.prepareStatement(UsersCRUDOps.Update_Users);
					stmt.setString(1, users.getEmail());
					stmt.setString(2, users.getPassword());
					stmt.setString(3, users.getFullName());
					stmt.setInt(4, users.getUserId());
					int result = stmt.executeUpdate();
					return users;
				}
				else {
					System.out.println("This userId " + users.getUserId() + " does not exist.");
					return null;
				}
				
			} else {
				System.out.println("Could Not Connect to DB");
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String deleteUsers(int userId) {
		UsersDAO usersDAO = new UsersDAO();
		List<Users> listUsers = usersDAO.listAllUsers();
		boolean status = usersDAO.findUsers(userId, listUsers);
		Connection connection = DBConnect.getConnection();
		try {
			if (connection != null) {
				if(status) {
					PreparedStatement stmt = connection.prepareStatement(UsersCRUDOps.Delete_Users);
					stmt.setInt(1, userId);
					int result = stmt.executeUpdate();
					return "Employee " + userId + " deleted Successfully...";
				}
				else {
					return "Employee ID " + userId + " does not exist.";
				}
				
			} else {
				System.out.println("Could Not Connect to DB");
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean findUsers(int userId,List<Users> listUsers){
		Boolean status = false;
		for (Users list : listUsers) {
			if (Integer.compare(list.getUserId(), userId) == 0) {
				status = true;
				break;
			}
		}
		return status;
	}

	// Insert User Collection Classes
//	public Users insertUser(Users user) {
//		System.out.println("UserDoa insertUser method call");
//		Users users = new Users(user.getUserId(),user.getEmail(),user.getPassword(),user.getFullName());
//		System.out.println("Insert User: " + users);
//		return users; // change return type
//	}

//	// Insert User
//	public Users insertUser(Users user) {
//		System.out.println("UserDoa insertUser method call");
//		Users users = new Users(user.getUserId(),user.getEmail(),user.getPassword(),user.getFullName());
//		System.out.println("Insert User: " + users);
//		return users; // change return type
//	}

//	// Find one User
//	public Users getOneUser(Integer UserId) {
//		System.out.println("\nUserDoa getOneUser method call");
//		System.out.println("Find One User: " + map.get(UserId));
//		return map.get(UserId);
//	}

//	// Fetch All User
//	public List<Users> fetchAll() {
//		System.out.println("\nUserDoa fetchAll method call");
//        return new ArrayList<>(map.values());
//    }

//	// Update User
//	public Users updateUser(Integer UserID, Users user) {
//		System.out.println("\nUserDoa updateUser method call");
//		Users updatedUser = new Users(user.getUserId(),user.getEmail(),user.getPassword(),user.getFullName());
//		map.replace(UserID, updatedUser);
//		System.out.println("UserDoa updateUser method call: " + updatedUser);
//	    return updatedUser;
//	}

//	// Delete User
//	public void deleteUser(Integer UserID) {
//		System.out.println("\nUserDoa deleteUser method call");
//		map.remove(UserID);
//	}
}
