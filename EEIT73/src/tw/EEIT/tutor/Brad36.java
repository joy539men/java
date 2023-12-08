package tw.EEIT.tutor;

import java.io.File;

public class Brad36 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		/*File f1 = new File("c:\\brad\\dir1");
		File f2 = new File("c:/brad/dir1");*/
		
		File f1 = new File(".");
		File f2 = new File("./dir3");
		System.out.println(f1.getAbsolutePath());
		System.out.println(f2.exists());
		
		if (!f2.exists()) {
			f2.mkdir();
		}else {
			System.out.println("exist");
		}
		System.out.println("----------------");
		File f3 = new File("./dir2/file1.txt");
		File f4 = new File("./dir3/file2.txt");
		if(f3.renameTo(f4)) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
	}

}
