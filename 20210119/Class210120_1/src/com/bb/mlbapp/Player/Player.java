package com.bb.mlbapp.Player;

import com.bb.mlbapp.MLBTEAM.MT;

public class Player {
   private String name;
   private String birthday;
   private String height;
   private String weight;
   private MT mt;
   private static Player inst;
   
   public static Player getInstance(String name, String birthday, String height, String weight, MT mt) {
	   if (inst == null) {
		   inst = new Player(name, birthday, height, weight, mt);
		   
	   }
	   return inst;
   }

    public Player(String name, String birthday, String height, String weight, MT mt) {
	super();
	this.name = name;
	this.birthday = birthday;
	this.height = height;
	this.weight = weight;
	this.mt = mt;
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

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public MT getMt() {
		return mt;
	}

	public void setMt(MT mt) {
		this.mt = mt;
	}

	public void printPlayerInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("������� : " + birthday);
		System.out.println("Ű : " + height);
		System.out.println("������ : " + weight);
		mt.printMlbteamInfo();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
   
   
}
