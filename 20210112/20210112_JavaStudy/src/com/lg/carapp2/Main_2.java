package com.lg.carapp2;

import java.util.ArrayList;

import com.lg.carapp2.car2.Store;

public class Main_2 {

	public static void main(String[] args) {
//		Store store = new Store("���", "��", "K7", 40000000, "���뱸 ������");
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
		arrList.add(new Store("GM", "���", "K5", 30000000, "���뱸 ������"));
		arrList.add(new Store("�����ٰ�", "�׸�", "K9", 50000000, "�ϴ뱸 ������"));
		
		for (int i = 0; i < arrList.size(); i++) {
//			Store mystore = arrList.get(i);
//			mystore.showStoreInfo();
			arrList.get(i).showStoreInfo();
	
	 
	}

}
}
