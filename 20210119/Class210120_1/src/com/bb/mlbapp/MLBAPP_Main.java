package com.bb.mlbapp;

import java.util.Random;

import com.bb.mlbapp.MLBTEAM.MT;
import com.bb.mlbapp.Player.Player;

public class MLBAPP_Main {

	public static void main(String[] args) {
		String name[] = {"애런 저지", "호세 알투베"};
		String birthday[] = {"1992.4.26", "1990.5.6"};
		String height[] = {"200cm", "167cm"};
		String weight[] = {"127kg", "74kg"};
		String teamname[] = {"뉴욕 양키스", "휴스턴 애스트로스"};
		int year1[] = {1901, 1962};
		String year2[] = {"1923, 1927, 1928, 1932, 1936, 1937, 1938, 1939, 1941, 1943, 1947, 1949, 1950, 1951, 1952, 1953, 1956, 1958, 1961, 1962, 1977, 1978, 1996, 1998, 1999, 2000, 2009", "2017"};
		String league[] = {"아메리칸 리그", "아메리칸 리그"};
		String division[] = {"동부지구", "서부지구"};
		
		Random r = new Random();
		
		for (int i = 0; i < 2; i++) {
			System.out.println("번호 : " + (i+1));
			new Player(name[r.nextInt(2)], birthday[r.nextInt(2)], height[r.nextInt(2)], weight[r.nextInt(2)],
					new MT(teamname[r.nextInt(2)], year1[r.nextInt(2)], year2[r.nextInt(2)], league[r.nextInt(2)], division[r.nextInt(2)]))
			.printPlayerInfo();
		}
		
		for (int i = 0; i < 2; i++) {
			Player.getInstance(name[r.nextInt(2)], birthday[r.nextInt(2)], height[r.nextInt(2)], weight[r.nextInt(2)],
					new MT(teamname[r.nextInt(2)], year1[r.nextInt(2)], year2[r.nextInt(2)], league[r.nextInt(2)], division[r.nextInt(2)]))
			.printPlayerInfo();
		}

	}

}
