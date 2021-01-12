package com.lg.mlbapp;

import java.util.ArrayList;

import com.lg.mlbapp.lcs.Team;

public class Main_LCS {

	public static void main(String[] args) {
		Team team = new Team("마이애미 말린스", 1993, "1997, 2003", "NL EAST DIVISION");
			team.showTeamInfo();
			
			Team team2[] = new Team[4];
//		    int num[] = new int[4];
//			team2[0] = new Team();
//			team2[3] = new Team();
//			
//			for (int b = 0; b < team2.length; b++) {
//				team2[b] = new Team();
//		}
			
			ArrayList<Team> arrList = new ArrayList<>();
			arrList.add(new Team("클리블랜드 인디언스", 1894, "1920, 1948", "AL CENTRAL DIVISION"));
			arrList.add(new Team("애틀란타 브레이브스", 1871, "1914, 1957, 1995", "NL EAST DIVISION"));
			arrList.add(new Team("볼티모어 오리올스", 1894, "1966, 1970, 1983", "AL EAST DIVISION"));
			
			for (int b = 0; b < arrList.size(); b++) {
//				Team myTeam = arrList.get(b);
//				myTeam.showTeamInfo();
				arrList.get(b).showTeamInfo();
			}

	}

}
