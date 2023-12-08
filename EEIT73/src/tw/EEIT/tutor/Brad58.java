package tw.EEIT.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad58 {

	public static void main(String[] args) {
		while (true) {
			try {
				ServerSocket server = new ServerSocket(9999);
				Socket socket = server.accept();
				InetAddress ip = socket.getInetAddress();

				BufferedOutputStream bout = new BufferedOutputStream(
						new FileOutputStream(String.format("dir2/%s.jpg", ip.getHostAddress())));

				InputStream in = socket.getInputStream();
				BufferedInputStream bin = new BufferedInputStream(in);
				int len;
				byte[] buf = new byte[4 * 1024 * 1204];
				while ((len = bin.read(buf)) != -1) {
					bout.write(buf, 0, len);
				}
				
				bout.flush();
				bout.close();
				in.close();

				server.close();

			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
