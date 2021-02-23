package com.kwk.serialApp.program;

import com.kwk.serialApp.handler.SerialCtrl;
import com.kwk.serialApp.util.Menu;

public class Program {

	public static void main(String[] args) {
		Menu m = new Menu();
		SerialCtrl sc = new SerialCtrl();
		
		while (true)
		{
			switch (m.mainMenu())
			{
			    case Menu.menu_main_tv_on:
			    	sc.
			    	break;
			    	
			    case Menu.menu_main_tv_off:
			    	
			    	break;
			    	
			    case Menu.menu_main_boiler_on:
			    	
			    	break;
			    	
			    case Menu.menu_main_cleaner_on:
			    	
			    	break;
			    	
			    case Menu.menu_main_tv_on:
			    	
			    	break;
			    	
			    case Menu.menu_main_emergency:
			    	
			    	break;
			    	
			    case Menu.menu_main_reconnect:
			    	
			    	break;
			    	
			    case Menu.menu_main_emergency:
			    	break;
			    	
			    case Menu.menu_main_logout:
			    	
			    	break;
			    	
			    case Menu.menu_main_exit:
			    	
			    	break;
			}
		}

	}

}
