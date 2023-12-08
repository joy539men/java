package tw.EEIT.tutor;

public class Brad34 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		double c = 10, d = 0;
		int[] f = { 1, 2, 3 };
		System.out.println("123456");
		try {
			System.out.println(a / b);// 執行例外拋出，後面程式碼不執行，執行catch
			System.out.println("-----");
			System.out.println(f[4]);
		} catch (RuntimeException e) {
			System.out.println("ERROR");
//		} catch (ArithmeticException e) {
//			System.out.println("Oops!");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("xxxxxxx");

		}
		System.out.println(c / d);

	}

}
