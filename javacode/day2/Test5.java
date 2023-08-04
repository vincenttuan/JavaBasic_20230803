package day2;

public class Test5 {

	public static void main(String[] args) {
		int x = 75;
		System.out.println(x);
		
		if(x < 0 || x > 100) {
			System.out.println("Error");
			return;
		}	

		if(x >= 90) {
			System.out.println("A");
		} else if(x >= 80 && x < 90) {
			System.out.println("B");
		} else if(x >= 70 && x < 80) {
			System.out.println("C");
		} else if(x >= 60 && x < 70) {
			System.out.println("D");
		} else if(x < 60) {
			System.out.println("E");
		}
		//------------------------------
		if(x >= 90) {
			System.out.println("A");
		} else if(x >= 80) {
			System.out.println("B");
		} else if(x >= 70) {
			System.out.println("C");
		} else if(x >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

	}

}