package day3;

import java.util.Scanner;

public class WhileDemo3 {

	public static void main(String[] args) {
		// 使用者輸入一個數字, 電腦會算出該數字的平方結果
		// 若使用者輸入 0 表示離開程式
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入任意數字(0:離開):");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("離開");
				break;
			}
			double result = Math.pow(num, 2);
			System.out.printf("%d 的平方是 %.0f\n", num, result);

		}

		System.out.println("程式結束");

	}

}