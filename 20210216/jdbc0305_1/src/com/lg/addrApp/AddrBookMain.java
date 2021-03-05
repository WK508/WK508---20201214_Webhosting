package com.lg.addrApp;

import java.util.Scanner;
import com.lg.addrApp.dao.MySQLHandler;
import com.lg.addrApp.util.Menu;

public class AddrBookMain {
	public static void main(String[] args) {
		MySQLHandler db = new MySQLHandler();
		Menu me = new Menu();
		Scanner s = new Scanner(System.in);
		while (true) {
			switch (me.mainMenu(s)) {
			case Menu.CREATE_TABLE:
				db.createTB();
				break;
			case Menu.DEL_TABLE:
				db.dropTB();
				break;
			case Menu.INSERT_DATA:
				db.insertDB(me.addMenu(s));
				break;
			case Menu.VIEW_DATA:
				break;
			case Menu.UPDATE_DATA:
				break;
			case Menu.DEL_DATA:
				break;
			case Menu.MAIN_EXIT:				
				db.closeDB();
				s.close();
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
		}
	}
}









