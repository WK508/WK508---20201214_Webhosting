package com.lg.addrApp.Util;

import java.util.Random;

import com.lg.addrApp.Model.PostSeason;

public class RandData {
     static String[] name = {"LA 다저스" ,"탬파베이 레이스" ,"애틀란타 브레이브스", "휴스턴 애스트로스"};
     static String[] open = {"1884", "1998", "1871", "1962"};
     static String[] champion = {"1955, 1959, 1963, 1965, 1981, 1988, 2020", 
    		                    "없음", 
    		                    "1914, 1957, 1995", 
    		                    "2017"};
     static String[] division = {"내셔널리그 서부지구 1위", 
    		                     "아메리칸리그 동부지구 1위", 
    		                     "내셔널리그 동부지구 1위" ,
    		                     "아메리칸리그 서부지구 2위"};
     
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
