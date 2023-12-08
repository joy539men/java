package tw.EEIT.tutor;

public class Brad10 {

	public static void main(String[] args) {
		int[] p = new int[7];

		//骰100次隨機得到1-9 
		for (int i = 0; i < 10000000; i++) {
			int point = (int)(Math.random()*9)+1;
		//將骰到789的數字換成456
		if (point == 0) {
				p[0]++;
			}else {
				p[point > 6 ? point - 3 : point ]++;
			}
		}
		if (p[0] == 0) {
			for (int i = 1; i<=6; i++) {
				System.out.printf("%d點出現%d次\n",i,p[i]);
			}
		}else {
			System.out.println("ERROR:" + p[0]);
		}
	}

}
