package com.lg.addrApp.Util;

import java.util.Random;

import com.lg.addrApp.Model.PostSeason;

public class RandData {
     static String[] name = {"LA ������" ,"���ĺ��� ���̽�" ,"��Ʋ��Ÿ �극�̺꽺", "�޽��� �ֽ�Ʈ�ν�"};
     static String[] open = {"1884", "1998", "1871", "1962"};
     static String[] champion = {"1955, 1959, 1963, 1965, 1981, 1988, 2020", 
    		                    "����", 
    		                    "1914, 1957, 1995", 
    		                    "2017"};
     static String[] division = {"���ųθ��� �������� 1��", 
    		                     "�Ƹ޸�ĭ���� �������� 1��", 
    		                     "���ųθ��� �������� 1��" ,
    		                     "�Ƹ޸�ĭ���� �������� 2��"};
     
     Random r = new Random();
     
     public String getRName()
     {
    	 return name[r.nextInt(4)];
     }
     
     public String getROpen()
     {
    	 return open[r.nextInt(4)];
     }
     
     public String getRChampion()
     {
    	 return champion[r.nextInt(4)];
     }
     
     public String getRDivision()
     {
    	 return division[r.nextInt(4)];
     }
     
     public PostSeason getPostSeason()
     {
	    return new PostSeason(getRName(), 
	    		              getROpen(), 
	    		              getRChampion(), 
	    		              getRDivision()); 
     }
}
