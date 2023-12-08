package tw.EEIT.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad38 {

	public static void main(String[] args) {
		try {
			String mesg = "全世界\n";
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt",true);
			fout.write(mesg.getBytes());
			fout.flush();
			fout.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
