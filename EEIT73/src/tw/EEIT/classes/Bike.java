package tw.EEIT.classes;

import java.io.Serializable;

public class Bike extends Object implements Serializable{ // extends Object 預設
//	private double speed; 本類別使用
	protected double speed;// 繼承的子類別可以使用
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.4;
	}
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.4;
	}
	public double getSpeed() {
		return speed;
	}
}
