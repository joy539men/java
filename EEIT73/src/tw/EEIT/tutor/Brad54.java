package tw.EEIT.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad54 {

	public static void main(String[] args) {
		String mesg = "!!!!!!!!!!!!!Hello,World!!!!!!!";
		byte[] data = mesg.getBytes();
		
		try (DatagramSocket socket = new DatagramSocket();){
			//DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(data, 
					data.length, InetAddress.getByName("10.0.104.90"), 8888);
			socket.send(packet);
			//socket.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
