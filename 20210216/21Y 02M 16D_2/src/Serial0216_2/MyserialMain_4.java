package Serial0216_2;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class MyserialMain_4 {

	public static void main(String[] args) {
		String[] portName = 
				SerialPortList.getPortNames();
		for (int i = 0; i < portName.length; i++) {
			System.out.println("사용가능 포트 : " + portName[i]);
		}
		SerialPort serialPort = new SerialPort(portName[0]);
		
		try {
			serialPort.openPort();
			serialPort.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8,
					             SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			System.out.println("포트 사용 가능!!!!!!!!!!");
		} catch (SerialPortException e) {
			e.printStackTrace();
		}
		
		ReadThread rt = new ReadThread(serialPort);
		rt.start();
		WriteThread wt = new WriteThread(serialPort);
		wt.start();

	}

}

class ReadThread extends Thread {
	SerialPort serial;
	
	public ReadThread(SerialPort serial) {
		this.serial = serial;
	}
	
	public void run() {
		try {
			while (true) {
				byte[] read = serial.readBytes(); {
				if (read != null && read.length > 0)
					System.out.print(new String(read));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class WriteThread extends Thread {
	SerialPort serial;
	
	public WriteThread(SerialPort serial) {
		this.serial = serial;
	}
	
	public void run() {
		try {
			int c = 0;
			while ((c = System.in.read()) > -1) {
				serial.writeInt(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}