package com.wk.mlbDivision;

import java.util.Random;

import com.wk.mlbDivision.west.Team;

public class Team_main {

	public static void main(String[] args) {
		Team info[] = new Team[1];
		
		String[] team = {"����Ʈ���̽� ī��ν�", "�ػ罺 ��������", "�п�Ű ���", "��Ʈ����Ʈ Ÿ�̰Ž�"};
		int[] year = {1882, 1961, 1969, 1894};
		String[] year2 = {"1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011", "����", "����", "1935, 1945, 1968, 1984"};
		int[] rank = {1, 2, 3, 4};
		
		Random r = new Random();
		for (int s = 0; s < 4; s++) {
			info[s] = new Team(team[r.nextInt(4)], year[r.nextInt(4)], year2[r.nextInt(4)], rank[r.nextInt(4)]);
			
			Team te = new Team("����Ʈ���̽� ī��ν�", 1882, "1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011", 1);
			te.showTeamInfo();
			
			Team te2 = new Team("�ػ罺 ��������", 1961, "����", 2);
			te2.showTeamInfo();
			
			Team te3 = new Team("�п�Ű ���", 1969, "����", 3);
			te3.showTeamInfo();
			
			Team te4 = new Team("��Ʈ����Ʈ Ÿ�̰Ž�", 1894, "1935, 1945, 1968, 1984", 4);
			te4.showTeamInfo();
		}

	}

}
