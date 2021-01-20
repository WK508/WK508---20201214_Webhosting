package com.bb.mlbapp.MLBTEAM;

public class MT {
    private String teamname;
    private int year1;
    private String year2;
    private String league;
    private String division;
    
	public MT(String teamname, int year1, String year2, String league, String division) {
		super();
		this.teamname = teamname;
		this.year1 = year1;
		this.year2 = year2;
		this.league = league;
		this.division = division;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
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

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
    
    public void printMlbteamInfo() {
    	System.out.println("���� : " +  teamname);
    	System.out.println("â�ܳ⵵ : " + year1);
    	System.out.println("��³⵵ : " + year2);
    	System.out.println("�Ҽ� ���� : " + league);
    	System.out.println("�Ҽ� ���� : " + division);
    }
}
