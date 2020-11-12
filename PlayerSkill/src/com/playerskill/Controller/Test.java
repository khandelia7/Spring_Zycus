package com.playerskill.Controller;

import java.util.Scanner;

import com.playerskill.beans.Player;
import com.playerskill.beans.Skill;
import com.playerskill.function.PlayerBO;

public class Test {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter number of Players: ");
		int count = s.nextInt();
		
		 
		
		// Check whether number of player is valid or not
		if(count>0) { 
			
			Player[] player_arr = new Player[count];
			for(int i =0; i<count; i++) {
				System.out.println("Enter player " +  i +  " details: ");
				System.out.println("Enter player name: ");
				String name = s.next();
	
				System.out.println("Enter country name: ");
				String country = s.next();
				
				System.out.println("Enter skill: ");
				String skillName = s.next();
				Skill skill = new Skill(skillName);
		
				Player player =  new Player(name,country,skill);
				
				player_arr[i]=player;
			}
			PlayerBO playerBO = new PlayerBO();
			boolean exit = false;
			int choice;
			do {
				System.out.println("Menu: \n 1.View details: \n 2.Filter players with skill:\n 3.Exit:");
				choice = s.nextInt();
				
				switch (choice) {
				case 1:
					System.out.println("Player\t Country\t Skill");
					playerBO.viewDetails(player_arr);
					break;
					
				case 2:
					System.out.println("Enter skill: ");
					String skillName = s.next();
					playerBO.printPlayerDetailsWithSkill(player_arr,skillName);
					break;
					
				case 3:
					exit = true;
					break;
				}
				
			}while(choice!=3);

			
		}
		else {
			System.out.println("Invalid number of Players");
		}
		

	}
}
