package com.kwk.serialApp;

import java.util.Scanner;


import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class SerialMain {
	public static final String ADMIN_ID = "admin";
	public static final String GUEST_ID = "guest";
	public static final String ADMIN_PW = "1234";
	public static final String GUEST_PW = "1111";
	public static final String ADMIN_MODE = "admin_mode";
	public static final String GUEST_MODE = "guest_mode";
	public static final String OTHER_MODE = "other_mode";
	
	public static final int MENU_TV_ON = 1;
	public static final int MENU_TV_OFF = 2;
	public static final int MENU_BOILER_ON = 3;
	public static final int MENU_CLEANER_ON = 4;
	public static final int MENU_EMERGENCY = 5;
	public static final int MENU_LOGOUT = 7;
	public static final int MENU_GUEST_EXIT = 6;
	public static final int MENU_ADMIN_RECONNECT = 6;
	
	static final int CMD_TV_ON = '1';
	static final int CMD_TV_OFF = '0';
	static final int CMD_BOILER_ON = '2';
	static final int CMD_CLEANER_ON = '3';
	
	public static SerialPort initSerial() {
		String[] portName = SerialPortList.getPortNames();
		for (int i = 0; i < portName.length; i++) {
			System.out.println("��밡�� ��Ʈ : " + portName[i]);
		}
		SerialPort serialPort = new SerialPort(portName[0]);
		return serialPort;
		
	}
	public static void openSerial(SerialPort serial) {
		try {
			serial.openPort();
			serial.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, 
					SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			System.out.println("��Ʈ ��� ����!");
		} catch (SerialPortException e) {
			e.printStackTrace();
		}
	}
	
	  public static String login(Scanner s) {
		  System.out.println("-------------------");
		  System.out.println("����Ʈ Ȩ ���� �α���");
		  System.out.println("-------------------");
		  System.out.print("ID : ");
		  String id = s.next();
		  System.out.print("PW : ");
		  String pw = s.next();
		  String mode;
		  
		   if (id.equals(ADMIN_ID) && pw.equals(ADMIN_PW)) {
			   mode = ADMIN_MODE;
		   }
		   else if (id.equals(GUEST_ID) && pw.equals(GUEST_PW)) {
			   mode = GUEST_MODE;
		   }
		   else {
			   mode = OTHER_MODE;
		   }
		   return mode;
	  }
	  
	  public static int adminMenu(Scanner s) {
		    System.out.println("----------------------");
			System.out.println("����Ʈ Ȩ ���� v1.0");
			System.out.println("----------------------");
			System.out.println("1. TV �ѱ�");
			System.out.println("2. TV ����");
			System.out.println("3. ���Ϸ� ����");
			System.out.println("4. ��Ź�� ����");
			System.out.println("5. ��� ����");
			System.out.println("6. ��� �翬��");
			System.out.println("7. �α׾ƿ�");
			System.out.println("8. ����");
			System.out.println("----------------------");
			System.out.print("�޴� ���� : ");
			return s.nextInt();
	  }
	  
	  public static int guestMenu(Scanner s) {
		    System.out.println("----------------------");
			System.out.println("����Ʈ Ȩ ���� v1.0");
			System.out.println("----------------------");
			System.out.println("1. TV �ѱ�");
			System.out.println("2. TV ����");
			System.out.println("3. ���Ϸ� ����");
			System.out.println("4. ��Ź�� ����");
			System.out.println("5. ���α׷� ����");
			System.out.println("----------------------");
			System.out.print("�޴� ���� : ");
			return s.nextInt();
	  }
	  
	  public static boolean adminWork(Scanner s, SerialPort serial) {
		  switch (adminMenu(s)) {
		  case 1:
			  System.out.println("TV �ѱ�");
			  try {
					serial.writeInt(CMD_TV_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
			  break;
			  
		  case 2:
			  System.out.println("TV ����");
			  try {
					serial.writeInt(CMD_TV_OFF);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
			  break;
			  
		  case 3:
			  System.out.println("���Ϸ� ����");
			  try {
					serial.writeInt(CMD_BOILER_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
			  break;
			  
		  case 4:
			  System.out.println("��Ź�� ����");
			  try {
					serial.writeInt(CMD_CLEANER_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
			  break;
			  
		  case 5:
			  System.out.println("��� ����");
			  try {
				  serial.closePort();
			} catch (SerialPortException e) {
				e.printStackTrace();
			}
			  break;
			  
		  case 6:
			  System.out.println("��� �翬��");
			  if(!serial.isOpened()) {
				  openSerial(serial);
			  }
			  
		  case 7:
			  System.out.println("�α׾ƿ�");
			  return false;
		  case 8:
			  System.out.println("���α׷� ����");
			  System.exit(0);
		  }
		  return true;
	  }
	  
	  public static boolean guestWork(Scanner s, SerialPort serial) {
		  switch (guestMenu(s)) {
		  case 1:
			  System.out.println("TV �ѱ�");
			  break;
			  
		  case 2:
			  System.out.println("TV ����");
			  break;
			  
		  case 3:
			  System.out.println("���Ϸ� ����");
			  break;
			  
		  case 4:
			  System.out.println("��Ź�� ����");
			  break;
			  
		  case 5:
			  System.out.println("�α׾ƿ�");
			  return false;
			  
		  case 6:
			  System.out.println("���α׷� ����");
			  System.exit(0);
		  }
		  return true;  
			  
		  }
	  
	  

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    SerialPort serial = initSerial();
	    openSerial(serial);
	    
	    while (true) {
	    	String mode = login(s);
	    	if(mode.equals(ADMIN_MODE)) {
	    		while (true) {
	    			if (adminWork(s, serial) == false) {
	    				break;
	    			}
	    		}
	    	}
	    	else if(mode.equals(GUEST_MODE)) {
	    		while (true) {
	    			if(guestWork(s, serial) == false) {
	    				break;
	    			}
	    		}
	    	}
	    	else {
	    		System.out.println("ID �Ǵ� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
	    		System.out.println("�ٽ� �Է��ϼ���.");
	    	}
	    }

	}

}
