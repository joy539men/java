package tw.EEIT.tutor;

public class Brad05 {

	public static void main(String[] args) {
		int year = 2023;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 閏
				} else {
					// 平
				}
			} else {
				// 閏
			}
		} else {
			// 平
		}
		// other
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			// 閏
		} else {
			// 平
		}

	}

}
