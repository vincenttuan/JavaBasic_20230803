package day3;

import java.util.Random;
import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(9) + 1; // 0~8 + 1

		System.out.println("遊戲開始");

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("1~9 請猜一個數字:");
			int userGuess = sc.nextInt();
			// 判斷是否猜中 ?
			if(userGuess > ans) {
				System.out.println("猜大了");
			} else if(userGuess < ans) {
				System.out.println("猜小了");
			} else {
				System.out.println("答對了");
				break;
			}

		} while(true);

		System.out.println("遊戲結束");
	}

}