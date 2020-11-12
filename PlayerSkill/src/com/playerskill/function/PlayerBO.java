package com.playerskill.function;

import com.playerskill.beans.Player;

public class PlayerBO {
	
	// This method is used to print the all the details
	public void viewDetails(Player[] playerList) {
		for(Player player: playerList) {
			System.out.println(player);
		}
		
	}
	
	/* In this method, display all player details of  specific skill (from Skill). If the status being
	searched is not found in the list, display the message “Skill not found”. */
	public void printPlayerDetailsWithSkill(Player[] playerList, String skill) {
		
		int count = 0;
		for(Player player: playerList) {
			if(skill.equals(player.getSkill().getSkillName())) {
				System.out.println(player.toString());
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Player Not found");
		}
	}
	
	// In this method, construct a player object.Split the comma seperated input.
	public Player createPlayer (String data) {
		String[] myArray = data.split(",");
		return null;
	}

}
