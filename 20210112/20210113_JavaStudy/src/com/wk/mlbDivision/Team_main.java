package com.wk.mlbDivision;

import java.util.Random;

import com.wk.mlbDivision.west.Team;

public class Team_main {

	public static void main(String[] args) {
		Team info[] = new Team[1];
		
		String[] team = {"세인트루이스 카디널스", "텍사스 레인저스", "밀워키 브루어스", "디트로이트 타이거스"};
		int[] year = {1882, 1961, 1969, 1894};
		String[] year2 = {"1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011", "없음", "없음", "1935, 1945, 1968, 1984"};
		int[] rank = {1, 2, 3, 4};
		
		Random r = new Random();
		for (int s = 0; s < 4; s++) {
			info[s] = new Team(team[r.nextInt(4)], year[r.nextInt(4)], year2[r.nextInt(4)], rank[r.nextInt(4)]);
			
			Team te = new Team("세인트루이스 카디널스", 1882, "1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011", 1);
			te.showTeamInfo();
			
			Team te2 = new Team("텍사스 레인저스", 1961, "없음", 2);
			te2.showTeamInfo();
			
			Team te3 = new Team("밀워키 브루어스", 1969, "없음", 3);
			te3.showTeamInfo();
			
			Team te4 = new Team("디트로이트 타이거스", 1894, "1935, 1945, 1968, 1984", 4);
			te4.showTeamInfo();
		}

	}

}
