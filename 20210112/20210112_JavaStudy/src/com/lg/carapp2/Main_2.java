package com.lg.carapp2;

import java.util.ArrayList;

import com.lg.carapp2.car2.Store;

public class Main_2 {

	public static void main(String[] args) {
//		Store store = new Store("기아", "블랙", "K7", 40000000, "동대구 영업소");
//		store.showStoreInfo();

		Store store2[] = new Store[3];
//		int num[] = new int[3];
//		store2[0] = new Store();
//		store2[2] = new Store();
//		
//		for (int i = 0; i < store2.length; i++) {
//			store2[i] = new Store();
//		}
		
		ArrayList<Store> arrList = new ArrayList<>();
		arrList.add(new Store("GM", "블루", "K5", 30000000, "서대구 영업소"));
		arrList.add(new Store("폭스바겐", "그린", "K9", 50000000, "북대구 영업소"));
		
		for (int i = 0; i < arrList.size(); i++) {
//			Store mystore = arrList.get(i);
//			mystore.showStoreInfo();
			arrList.get(i).showStoreInfo();
	
	 
	}

}
}
