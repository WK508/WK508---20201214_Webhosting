package com.lg.mlbapp.lcs;

public class Team {
    
	private String team;
	private int year1;
	private String year2;
	private String division;
	
	public Team() {
		team = "마이애미 말린스";
		year1 = 1993;
		year2 = "1997, 2003";
		division = "NL EAST DIVISION";
		
		
		}
	public Team(String team, int year1, String year2, String division) {
		super();
		this.team = team;
		this.year1 = year1;
		this.year2 = year2;
		this.division = division;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getYear1() {
		return year1;
	}
	public void setYear1(int year1) {
		this.year1 = year1;
	}
	public String getYear2() {
		return year2;
	}
	public void setYear2(String year2) {
		this.year2 = year2;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
	public void showTeamInfo() {
		System.out.println("팀명 : " + team);
		System.out.println("창단년도 : " + year1);
		System.out.println("우승년도 : " + year2);
		System.out.println("소속 리그/지구 : " + division);
		System.out.println("==================================");
	}
}
