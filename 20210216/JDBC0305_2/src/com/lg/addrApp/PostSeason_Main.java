package com.lg.addrApp;

import java.util.Scanner;

import com.lg.addrApp.DAO.MYSQLHandler;
import com.lg.addrApp.Model.PostSeason;
import com.lg.addrApp.Util.Menu;
import com.lg.addrApp.Util.RandData;


public class PostSeason_Main {

	public static void main(String[] args) {
		MYSQLHandler db = new MYSQLHandler();
		Menu me = new Menu();
		Scanner s = new Scanner(System.in);
		while (true)
		{
			switch (me.mainmenu(s))
			{
			case Menu.CREATE_TABLE:
				db.CREATE_TABLE();
				break;
				
			case Menu.DELETE_TABLE:
				db.DELETE_TABLE();
				break;
				
			case Menu.INSERT_DATA:
				PostSeason p = me.addMenu(s);
				db.INSERT_DATA(p);
				RandData data = new RandData();
				for (int i = 0; i < 4; i++)
				db.INSERT_DATA(data.getPostSeason());
				break;
				
			case Menu.INSERT_RAND_DATA:
				break;
				
			case Menu.VIEW_DATA:
				break;
				
			case Menu.UPDATE_DATA:
				break;
				
			case Menu.DELETE_DATA:
				break;
				
			case Menu.MAIN_EXIT:
				System.out.println("프로그램 종료");
				db.closeDB();
				s.close();
				System.exit(0);
				break;
			}
		}

	}

}
