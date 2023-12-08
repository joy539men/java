package tw.EEIT.tutor;

import tw.EEIT.classes.Bike;

public class Brad14 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		System.out.println(b1.getSpeed());
		b1.upSpeed();
		b1.downSpeed();
//		b1.speed = 10.1;
		System.out.println(b1.getSpeed());
	}

}
