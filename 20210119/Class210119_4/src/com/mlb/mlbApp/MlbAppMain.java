package com.mlb.mlbApp;

import java.util.Random;

import com.mlb.mlbApp.Player.Player;
import com.mlb.mlbApp.Team.Team;



public class MlbAppMain {

	public static void main(String[] args) {
		String name[] = {"�ڸ� �ð�", "�ڵ� ������", "��Ű ����"};
		String birthday[] = {"1994�� 4�� 27��", "1995�� 7�� 13��", "1992�� 10�� 7��"};
		String birthplace[] = {"�뽺ĳ�Ѷ��̳��� ����", "�ָ������� ��ī������", "�׳׽��� ������"};
		String teamName[] = {"LA ������", "LA ������", "LA ������"};
		String nl[] = {"LA ������"};
		int year1[] = {1884};
		String year2[] = {"1955, 1959, 1963, 1965, 1981, 1988, 2020"};
		String division[] = {"���ųθ��� ��������"};
		
		Random r = new Random();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("��ȣ : " + (i+1));
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
