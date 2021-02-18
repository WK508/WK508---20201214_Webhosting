package Serial0217;

import java.util.Scanner;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class SerialMain_6 {
	public static final String ADMIN_ID = "admin";
	public static final String GUEST_ID = "guest";
	public static final String ADMIN_PW = "1234";
	public static final String GUEST_PW = "1111";
	public static final String ADMIN_MODE = "admin_mode";
	public static final String GUEST_MODE = "guest_mode";
	public static final String OTHER_MODE = "other_mode";
	
	public static int MENU_LA_DODGRES = 1;
	public static int MENU_SAN_DIEGO_PADRES = 2;
	public static int MENU_SAN_FRANCISCO_GIANTS = 3;
	public static int MENU_COLORADO_ROCKIES = 4;
	public static int MENU_ARIZONA_DIAMONDBACKS = 5;
	public static int MENU_EMERGENCY = 6;
	public static int MENU_GUEST_EXIT = 7;
	public static int MENU_ADMIN_EXIT = 8;
	
	static final int CMD_LA_DODGERS = '1';
	static final int CMD_SAN_DIEGO_PADRES = '0';
	static final int CMD_SAN_FRANCISCO_GIANTS = '2';
	static final int CMD_COLORADO_ROCKIES = '3';
	
	public static SerialPort initSerial() {
		String[] portName = SerialPortList.getPortNames();
		for (int i = 0; i < portName.length; i++) {
			System.out.println("사용가능 포트 : " + portName[i]);
		}
		SerialPort serialPort = new SerialPort(portName[0]);
        
		try {
			serialPort.openPort();
			serialPort.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, 
					SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			System.out.println("포트 사용 가능!");
		} catch (SerialPortException e) {
			e.printStackTrace();
		}
		
		return serialPort;
		
	}
	
	public static String login(Scanner s) {
		System.out.println("------------------------");
		System.out.println("메이저리그 내셔널리그 서부지구");
		System.out.println("------------------------");
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
		System.out.println("------------------------");
		System.out.println("메이저리그 내셔널리그 서부지구");
		System.out.println("------------------------");
		System.out.println("1. LA DODGERS");
		System.out.println("2. SAN DIEGO PADRES");
		System.out.println("3. SAN FRANCISCO GIANTS");
		System.out.println("4. COLORADO ROCKIES");
		System.out.println("5. ARIZONA DIAMONDBACKS");
		System.out.println("6. 긴급정지");
		System.out.println("7. 로그아웃");
		System.out.println("8. 종료");
		System.out.println("------------------------");
		System.out.println("메뉴 선택 : ");
		return s.nextInt();
	}
	
	public static int guestMenu(Scanner s) {
		System.out.println("------------------------");
		System.out.println("메이저리그 내셔널리그 서부지구");
		System.out.println("------------------------");
		System.out.println("1. LA DODGERS");
		System.out.println("2. SAN DIEGO PADRES");
		System.out.println("3. SAN FRANCISCO GIANTS");
		System.out.println("4. COLORADO ROCKIES");
		System.out.println("5. ARIZONA DIAMONDBACKS");
		System.out.println("6. 종료");
		System.out.println("------------------------");
		System.out.println("메뉴 선택 : ");
		return s.nextInt();
	}
	
	public static boolean adminWork(Scanner s, SerialPort serial) {
		switch (adminMenu(s)) {
		case 1:
			System.out.println("LA DODGERS");
			try {
				serial.writeInt(CMD_LA_DODGERS);
			} catch (SerialPortException e) {
				e.printStackTrace();
			}
			break;
			
		case 2:
			System.out.println("SAN DIEGO PADRES");
			try {
				serial.writeInt(CMD_SAN_DIEGO_PADRES);
			} catch (SerialPortException e) {
				e.printStackTrace();
			}
			break;
			
		case 3:
			System.out.println("SAN FRANCISCO GIANTS");
			try {
				serial.writeInt(CMD_SAN_FRANCISCO_GIANTS);
			} catch (SerialPortException e) {
				e.printStackTrace();
			}
			break;
			
		case 4:
			System.out.println("COLORADO ROCKIES");
			try {
				serial.writeInt(CMD_COLORADO_ROCKIES);
			} catch (SerialPortException e) {
				e.printStackTrace();
			}
			break;
			
		case 5:
			System.out.println("ARIZONA DIAMONDBACKS");
			try {
				serial.writeInt(CMD_ARIZONA_DIAMONDBACKS);
			} catch (SerialPortException e) {
				e.printStackTrace();
			}
			break;
		}
	}

	public static void main(String[] args) {
		

	}

}
