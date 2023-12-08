package tw.EEIT.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad59 {

	public static void main(String[] args) {
		String mesg = "quit";
		try {
			File sourse = new File("");
			byte[] buf = new byte[(int)(sourse.length())];
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(""));
			bin.read(buf);
			bin.close();
			
			Socket client = new Socket(InetAddress.getByName("10.0.104.90"),9999);
			BufferedOutputStream bout = new BufferedOutputStream(client.getOutputStream());
			bout.write(buf);
			bout.flush();
			bout.close();
			
			System.out.println("Send ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
