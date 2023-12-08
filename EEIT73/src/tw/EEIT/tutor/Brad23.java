package tw.EEIT.tutor;

import tw.EEIT.classes.Brad21_1;
import tw.EEIT.classes.Brad21c;

public class Brad23 {
	public static void main(String[] args) {
		Brad231 obj1 = new Brad231();
		Brad231 obj2 = new Brad231();
		Brad231 obj3 = new Brad231();
		obj3.m2(3);
	}

}
class Brad231 implements Brad21_1,Brad21c {
	public void m1() {}
	public void m2() {}
	public void m2(int a) {}
}

