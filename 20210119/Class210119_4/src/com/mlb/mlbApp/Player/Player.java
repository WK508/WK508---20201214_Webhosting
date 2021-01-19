package com.mlb.mlbApp.Player;

import com.mlb.mlbApp.Team.Team;

public class Player {
     private String name;
     private String birthday;
     private String birthplace;
     private String teamName;
     private Team team;
     private static Player inst;
     
     public static Player getInstance(String name, String birthday, String birthplace, String teamName, Team team) {
    	 if (inst == null) {
    		 inst = new Player(name, birthday, birthplace, teamName, team);
    	 }
    	 return inst;
     }

	public Player(String name, String birthday, String birthplace, String teamName, Team team) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.birthplace = birthplace;
		this.teamName = teamName;
		this.team = team;
	}

	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void printPlayerInfo() {
    	System.out.println("선수명 : " + name);
    	System.out.println("생년월일 : " + birthday);
    	System.out.println("출생지 : " + birthplace);
    	System.out.println("소속팀 : " + team);
    	team.printTeamInfo();
    	System.out.println("----------------------------------------");
    	 
     }
}
