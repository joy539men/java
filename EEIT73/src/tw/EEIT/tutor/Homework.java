package tw.EEIT.tutor;

public class Homework {

	public static void main(String[] args) {
		
		for ( int a  =1 ; a < 10; a++) {
			for ( int b = 2; b < 10; b++) {
					System.out.printf("%dx%d=%d\t",b , a ,a*b);
//					System.out.print( b + "*" + a + "=" + a * b + "\t");
				}
			System.out.println();	
		}
	System.out.println();
		for ( int d = 1; d < 10; d++) {
			for ( int c = 2; c < 5; c++) {
				System.out.printf("%dx%d=%d\t",c ,d ,c*d);
			}
			System.out.println();
		}
	System.out.println();
		for ( int e = 1; e < 10; e++) {
			for ( int f = 5; f < 8; f++) {
				System.out.printf("%dx%d=%d\t",f, e, f*e);
			}
			System.out.println();
		}
	}

}
