package day3;

import java.util.Random;

public class WhileDemo1 {

	public static void main(String[] args) {
		Random random = new Random();
		
		while(true) {
			int n = random.nextInt(100); // 0~99
			// 只印出偶數
			if(n % 2 == 1) {
				continue;
			}
			System.out.println(n);
			// 若 n = 0 則跳出迴圈
			if(n == 0) {
				break;
			}

		}

	}

}
