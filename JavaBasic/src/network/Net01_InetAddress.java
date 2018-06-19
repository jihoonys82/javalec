package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		//InetAddres - class for IP information
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("HostName : " + ip.getHostName()); //host name = domain name
		System.out.println("HostAddress : " + ip.getHostAddress()); // ip address
		System.out.println("toString : " + ip); // hostname/ip address
		
		System.out.println("====================");
		
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress() : " + Arrays.toString(ipAddr)); 
		for(byte b : ipAddr) {
			System.out.print((b<0)?b&0xFF : b);
			System.out.print(".");
		}
		System.out.println();
		
		System.out.println("====================");
		try {
			ip = InetAddress.getLocalHost(); // get information for this computer. 
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("HostName : " + ip.getHostName()); //
		System.out.println("HostAddress : " + ip.getHostAddress()); // 
		System.out.println("toString : " + ip); // 
		
		
		System.out.println("Program terminated successfully!");
		
	}
}
