package com.mlb.mlbApp.Team;

public class Team {
    private String nl;
    private int year1;
    private String year2;
    private String division;
    
	public Team(String nl, int year1, String year2, String division) {
		super();
		this.nl = nl;
		this.year1 = year1;
		this.year2 = year2;
		this.division = division;
	}

	public String getNl() {
		return nl;
	}

	public void setNl(String nl) {
		this.nl = nl;
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
	
	public void printTeamInfo() {
		System.out.println("팀명 : " + nl);
		System.out.println("창단년도 : " + year1);
		System.out.println("우승년도 : " + year2);
		System.out.println("소속 리그/지구 : " + division);
    
    
    	
    }
}
