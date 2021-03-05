package com.lg.addrApp.Model;

public class PostSeason {
      String name;
      String open;
      String champion;
      String division;
      
	public PostSeason(String name, String open, String champion, String division) {
		super();
		this.name = name;
		this.open = open;
		this.champion = champion;
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getChampion() {
		return champion;
	}

	public void setChampion(String champion) {
		this.champion = champion;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
	
      
      
}
