package com.lg.mlbapp;

import java.util.ArrayList;

import com.lg.mlbapp.lcs.Team;

public class Main_LCS {

	public static void main(String[] args) {
		Team team = new Team("���ֹ̾� ������", 1993, "1997, 2003", "NL EAST DIVISION");
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
			arrList.add(new Team("Ŭ������ �ε��", 1894, "1920, 1948", "AL CENTRAL DIVISION"));
			arrList.add(new Team("��Ʋ��Ÿ �극�̺꽺", 1871, "1914, 1957, 1995", "NL EAST DIVISION"));
			arrList.add(new Team("��Ƽ��� �����ý�", 1894, "1966, 1970, 1983", "AL EAST DIVISION"));
			
			for (int b = 0; b < arrList.size(); b++) {
//				Team myTeam = arrList.get(b);
//				myTeam.showTeamInfo();
				arrList.get(b).showTeamInfo();
			}

	}

}
