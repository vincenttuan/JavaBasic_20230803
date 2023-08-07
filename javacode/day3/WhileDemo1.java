package day3;

import java.util.Random;

public class WhileDemo1 {

	public static void main(String[] args) {
		Random random = new Random();
		
		while(true) {
			int n = random.nextInt(100); // 0~99
			System.out.println(n);
		}

	}

}
