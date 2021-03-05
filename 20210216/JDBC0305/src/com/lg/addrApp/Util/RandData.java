package com.lg.addrApp.Util;

import java.util.Random;

import com.lg.addrApp.Model.Mlbteam;

public class RandData {
     static String[] name = {"LA 다저스", "샌디에이고 파드리스", 
    		 "샌프란시스코 자이언츠", "콜로라도 로키스", "애리조나 다이아몬드백스"};
     static String[] open = {"1884", "1998", "1883", "1993", "1998"};
     static String[] champion = {"1955, 1959, 1963, 1965, 1981, 1988, 2020", "없음", 
    		 "1905, 1921, 1922, 1933, 1954, 2010, 2012, 2014", "없음", "2001"};
     static String[] division = {"내셔널리그 서부지구 1위", "내셔널리그 서부지구 2위", "내셔널리그 서부지구 3위", 
    		              "내셔널리그 서부지구 4위", "내셔널리그 서부지구 5위"};
     
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
