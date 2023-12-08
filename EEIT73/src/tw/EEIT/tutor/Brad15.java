package tw.EEIT.tutor;

import tw.EEIT.classes.Bike;
import tw.EEIT.classes.Scooter;

public class Brad15 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Scooter s1 = new Scooter();
		b1.upSpeed();
		s1.changGear(1);
		s1.upSpeed();
		s1.changGear(2);
		s1.upSpeed();
		s1.changGear(0);
		s1.upSpeed();
		s1.changGear(3);
		s1.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
	}

}
