package tw.EEIT.tutor;

public class Brad04 {

	public static void main(String[] args) {
		double temp = Math.random();
//		System.out.println(temp);
		int score = (int)(temp*101);
		if (score >= 90) {
			System.out.printf("%d : %s", score, "A");
		}else if (score >= 80) {
			System.out.printf("%d : %s", score, "B");
		}else if (score >= 70) {
			System.out.printf("%d : %s", score, "C");
		}else if (score >= 60) {
			System.out.printf("%d : %s", score, "D");
		}else {
			System.out.printf("%d : %s", score, "E");
		}
//		String grade = "";
//		boolean isPass = false;
//		int score = (int)(temp * 101) ;
//		if (score >= 90) {
//			grade = "A"; isPass = true;
//		}else if (score >= 80) {
//			grade = "B"; isPass = true;
//		}else if (score >= 70) {
//			grade = "C"; isPass = true;
//		}else if (score >= 60) {
//			grade = "D"; isPass = true;
//		}else {
//			grade = "E"; isPass = false;
//		}
//		System.out.printf("%d : %s : %s", score, grade, isPass?"Pass":"Down");	
	}
}
