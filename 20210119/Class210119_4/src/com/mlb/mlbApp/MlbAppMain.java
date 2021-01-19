package com.mlb.mlbApp;

import java.util.Random;

import com.mlb.mlbApp.Player.Player;
import com.mlb.mlbApp.Team.Team;



public class MlbAppMain {

	public static void main(String[] args) {
		String name[] = {"코리 시거", "코디 벨린저", "무키 베츠"};
		String birthday[] = {"1994년 4월 27일", "1995년 7월 13일", "1992년 10월 7일"};
		String birthplace[] = {"노스캐롤라이나주 샬럿", "애리조나주 스카츠데일", "테네시주 내슈빌"};
		String teamName[] = {"LA 다저스", "LA 다저스", "LA 다저스"};
		String nl[] = {"LA 다저스"};
		int year1[] = {1884};
		String year2[] = {"1955, 1959, 1963, 1965, 1981, 1988, 2020"};
		String division[] = {"내셔널리그 서부지구"};
		
		Random r = new Random();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("번호 : " + (i+1));
			new Player(name[r.nextInt(3)], birthday[r.nextInt(3)], birthplace[r.nextInt(3)], teamName[r.nextInt(3)], 
					new Team(nl[r.nextInt(1)], year1[r.nextInt(1)], year2[r.nextInt(1)], division[r.nextInt(1)]))
			.printPlayerInfo();
		}
		for (int i = 0; i < 3; i++) {
			Player.getInstance(name[r.nextInt(3)], birthday[r.nextInt(3)], birthplace[r.nextInt(3)], teamName[r.nextInt(3)],
					new Team(nl[r.nextInt(1)], year1[r.nextInt(1)], year2[r.nextInt(1)], division[r.nextInt(1)]))
			.printPlayerInfo();
		}
		

	}

}
