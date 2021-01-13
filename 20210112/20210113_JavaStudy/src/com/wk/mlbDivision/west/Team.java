package com.wk.mlbDivision.west;

public class Team {
     private String team;
     private int year1;
     private String year2;
     private int rank;
     
     public Team () {
    	 team = "����Ʈ���̽� ī��ν�";
    	 year1 = 1882;
    	 year2 = "1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011";
    	 rank = 1;
     }
     
     public Team (String team, int year1, String year2, int rank) {
    	 this.team = team;
    	 this.year1 = year1;
    	 this.year2 = year2;
    	 this.rank = rank;
    	 
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
     
     public void showTeamInfo() {
    	 System.out.println("���� : " + team);
    	 System.out.println("â�ܳ⵵ : " + year1);
    	 System.out.println("��³⵵ : " + year2);
    	 System.out.println("���� : " + rank);
    	 System.out.println("===========================================================================");
     }
}
