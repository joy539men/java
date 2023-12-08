package tw.EEIT.tutor;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import tw.EEIT.classes.Student;

public class Brad44 {

	public static void main(String[] args) {
		Student s1 = new Student(86, 45, 67);
		Student s2 = new Student(87, 41, 37);

		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("dir1/s1.Brad")));
		oout.writeObject(s1);
		oout.writeObject(s2);
		oout.flush();
		oout.close();
		System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
