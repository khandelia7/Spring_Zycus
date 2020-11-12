package com.bookstore.services;

import java.util.List;

import com.bookstore.dao.UsersDAO;
import com.bookstore.model.Users;

public class UsersService {
	
	private UsersDAO usersDAO;
	
	public UsersService(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
	
	public List<Users> listAllUsers(){
		//get all User using usersDAO
		List<Users> list =  usersDAO.listAllUsers();
		//may perform some manipulation
		return list;
	}
	
	public Users getUsers(int userId) {
		//get  user using usersDAO
		
		Users users = usersDAO.getUsers(userId);
		//may perform some manipulation	
		return users;
	}
	
	public Users createUsers(Users users) {
		//get  user using usersDAO
		Users user = usersDAO.createUsers(users);
		//may perform some manipulation
		return user;
	}
	
	public Users updateUsers(Users users) {
		//get  user using usersDAO
		Users user = usersDAO.updateUsers(users);
		//may perform some manipulation
		return user;
	}
	
	public String deleteUsers(int userId) {
		//get  user using usersDAO
		String s = usersDAO.deleteUsers(userId);
		//may perform some manipulation
		return s;
	}
	
	public Users createUsersString(String line) {
		String[] parts = line.split(",");
		Users users = new Users(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3]);
		return users;
	}

}
