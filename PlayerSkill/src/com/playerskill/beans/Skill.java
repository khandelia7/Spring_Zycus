package com.playerskill.beans;

public class Skill{
	
	private String skillName;
	
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(String skillName) {
		super();
		this.skillName = skillName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return String.format("%-15s",skillName);
	}

}
