package tw.EEIT.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad53 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.iii.org.tw");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
		
	}

}
