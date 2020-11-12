package com.bookstore.MainController;

import java.util.List;
import java.util.Scanner;

import com.bookstore.dao.UsersDAO;
import com.bookstore.model.Users;
import com.bookstore.services.UsersService;

public class UsersMainTest {

	public static void main(String[] args) {
		try {
			UsersService usersService = new UsersService(new UsersDAO());

			System.out.println("Welcome to User Class Module...");
			Scanner s = new Scanner(System.in);
			String status;

			do {
				System.out.println("\n1.Get All Users: \n2.Get One User: \n3.Save (Insert) User: "
						+ "\n4.Update User: \n5.Delete User: \nEnter your Choice:");
				int choice = s.nextInt();

				switch (choice) {
				case 1:
					List<Users> listUsers = usersService.listAllUsers();
					System.out.println("\nAll Employee are:");
					for (Users list : listUsers) {
						System.out.println(list);
					}
					break;

				case 2:
					System.out.println("\nEnter the userId to be searched:");
					int userId = s.nextInt();
					Users Users = usersService.getUsers(userId);
					System.out.println("Detail of " + userId + " is: " + Users);
					break;

				case 3:
					System.out.println("\nEnter the String of Users: ");
					String usersString = s.next();
					Users user = usersService.createUsersString(usersString);
					Users users = usersService.createUsers(user);
					System.out.println("Employee ID " + user.getUserId() + " is inserted: " + users);
					break;

				case 4:
					System.out.println("\nEnter the String of User to be updated: ");
					String usersUpdateString = s.next();
					Users user1 = usersService.createUsersString(usersUpdateString);
					Users user2 = usersService.updateUsers(user1);
					if (user2 != null) {
						System.out.println("Employee ID " + user2.getUserId() + " is updated: " + user2);
					} else {
						System.out.println("Employee ID " + user1.getUserId() + " does not exist.");
					}
					break;
				}

				System.out.println("Do you want to continue (y/n): ");
				status = s.next();
			} while (status.equals("y"));

		} catch (Exception e) {
			System.out.println("Something Went Wrong");
		}
	}
}
