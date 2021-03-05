package com.lg.addrApp.Util;

import java.util.Random;

import com.lg.addrApp.Model.Mlbteam;

public class RandData {
     static String[] name = {"LA ������", "�����̰� �ĵ帮��", 
    		 "�������ý��� ���̾���", "�ݷζ� ��Ű��", "�ָ����� ���̾Ƹ��齺"};
     static String[] open = {"1884", "1998", "1883", "1993", "1998"};
     static String[] champion = {"1955, 1959, 1963, 1965, 1981, 1988, 2020", "����", 
    		 "1905, 1921, 1922, 1933, 1954, 2010, 2012, 2014", "����", "2001"};
     static String[] division = {"���ųθ��� �������� 1��", "���ųθ��� �������� 2��", "���ųθ��� �������� 3��", 
    		              "���ųθ��� �������� 4��", "���ųθ��� �������� 5��"};
     
     Random r = new Random();
     
     public String getRName()
     {
    	 return name[r.nextInt(5)];
     }
     
     public String getROpen()
     {
    	 return open[r.nextInt(5)];
     }
     
     public String getRChampion()
     {
    	 return champion[r.nextInt(5)];
     }
     
     public String getRDivision()
     {
    	 return division[r.nextInt(5)];
     }
     
     public Mlbteam getMlbteam()
     {
    	 return new Mlbteam(getRName(), 
    			            getROpen(), 
    			        getRChampion(), 
    			       getRDivision());
     }
}
