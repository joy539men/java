package tw.EEIT.tutor;

public class Brad35 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		try {
			bird.setLeg(3);
		}catch(Exception e){
			System.out.println("ERROR");
		}
		System.out.println("--------");
	}
	
	static void test1(Bird bird) {
		
	}

}


class Bird {
	int leg;
	void setLeg(int num) throws Exception {
		if(num >= 0 && num <= 2) {
			leg = num;
		}else {
			throw new Exception();
		}
	}
}