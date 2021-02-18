package Serial0216_1;

import java.util.Scanner;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class SerialMain0216 {
	static final int TV_ON = 1;
	static final int TV_OFF = 2;
	static final int BOILER_ON = 3;
	static final int CLEANER_ON = 4;
	static final int PROGRAM_EXIT = 5;
	
	static final int CMD_TV_ON = '1';
	static final int CMD_TV_OFF = '0';
	static final int CMD_BOILER_ON = '2';
	static final int CMD_CLEANER_ON = '3';
	
     
	public static int getMenu(Scanner s) {
		System.out.println("----------------------");
		System.out.println("����Ʈ Ȩ ���� v1.0");
		System.out.println("----------------------");
		System.out.println("1. TV �ѱ�");
		System.out.println("2. TV ����");
		System.out.println("3. ���Ϸ� ����");
		System.out.println("4. ��Ź�� ����");
		System.out.println("5. ��� ����");
		System.out.println();
		System.out.println("----------------------");
		System.out.print("�޴� ���� : ");
//		int menu = s.nextInt();
//		return menu;
		return s.nextInt();
	}
	
	public static SerialPort initSerial() {
		String[] portName = SerialPortList.getPortNames();
		for (int i = 0; i < portName.length; i++) {
			System.out.println("��밡�� ��Ʈ : " + portName[i]);
		}
		SerialPort serialPort = new SerialPort(portName[0]);
        
		try {
			serialPort.openPort();
			serialPort.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, 
					SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			System.out.println("��Ʈ ��� ����!");
		} catch (SerialPortException e) {
			e.printStackTrace();
		}
		
		return serialPort;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SerialPort serial = initSerial();
		while (true) {
			switch (getMenu(s)) {

			case TV_ON:
				System.out.println("TV ON");
				try {
					serial.writeInt(CMD_TV_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;

			case TV_OFF:
				System.out.println("TV OFF");
				try {
					serial.writeInt(CMD_TV_OFF);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;

			case BOILER_ON:
				System.out.println("BOILER ON");
				try {
					serial.writeInt(CMD_BOILER_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;

			case CLEANER_ON:
				System.out.println("CLEANER ON");
				try {
					serial.writeInt(CMD_CLEANER_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;

			case PROGRAM_EXIT:
				System.out.println("PROGRAM EXIT");
				s.close();
				System.exit(0);
				break;
			}
		}

	}

}
