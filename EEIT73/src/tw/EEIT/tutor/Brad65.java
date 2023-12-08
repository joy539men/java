package tw.EEIT.tutor;

import tw.EEIT.classes.BCrypt;

public class Brad65 {

	public static void main(String[] args) {
		String password = "123456";
		String hashPasswd = BCrypt.hashpw(password, BCrypt.gensalt());
		System.out.println(hashPasswd);
		
		String password2 = "123457";
		
		if(BCrypt.checkpw(password2, hashPasswd)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
