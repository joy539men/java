package tw.EEIT.tutor;

public class Brad06 {

	public static void main(String[] args) {
		int a = 10;
		switch (a) {	// byte, short, int, char, String, Enum
			case 1, 3, 5:
				System.out.println("A");
				break;
			case 10:
				System.out.println("B");
				break;
			case 100:
				System.out.println("C");
				break;
			default:
				System.out.println("X");
		}
	}

}
