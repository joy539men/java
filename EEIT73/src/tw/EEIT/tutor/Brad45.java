package tw.EEIT.tutor;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import tw.EEIT.classes.Student;

public class Brad45 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream("dir1/s1.Brad")));
			Object obj1 = oin.readObject();
			if(obj1 instanceof Student) {
//				System.out.println("ok");
				Student s1 = (Student)obj1;
				System.out.println(s1.sum());
				System.out.println(s1.avg());
			}
			System.out.println("------");
			Object obj2 = oin.readObject();
			if(obj2 instanceof Student) {
//				System.out.println("ok");
				Student s2 = (Student)obj2;
				System.out.println(s2.sum());
				System.out.println(s2.avg());
			}
			oin.close();
		} catch (Exception e) {
			System.out.println("xx");
		}
	}

}
