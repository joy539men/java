package tw.EEIT.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad37 {

	public static void main(String[] args) {
		try {
			File file = new File("dir3/file2.txt");
			FileInputStream fin = new FileInputStream(file);
			
			/*int c = fin.read();
			System.out.println((char)c);
			
			c = fin.read();
			System.out.println((char)c);*/
			
			/*int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
			}*/
			
			byte[] buf = new byte[(int)file.length()];
			fin.read(buf);
			System.out.println(new String(buf));
			
			/*int len; byte[] buf = new byte[3];
			while ((len = fin.read(buf)) != -1) {
				System.out.print(new String(buf,0,len));
			}*/
			
			
			fin.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
//		} catch (FileNotFoundException e) {
//			System.out.println("xxx");
		}
	}

}
