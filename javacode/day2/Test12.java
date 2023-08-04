package day2;

import java.util.Random;

public class Test12 {

	public static void main(String[] args) {
		double randomNumber = Math.random(); // 0~1		
		// 0.0 <= randomNumber < 1.0
		System.out.println(randomNumber); 

		// 利用 randomNumber 得到 0~9 的隨機數 
		int r1 = (int)(randomNumber * 10);
		System.out.println(r1);

		// 利用 Random 來取得 0~9 的隨機數
		Random random = new Random();
		int r2 = random.nextInt(10); // 0~9
		System.out.println(r2);

		// 利用 Random 來取得 0~99 的隨機數
		int r3 = random.nextInt(100); // 0~99
		System.out.println(r3);		

		// 利用 Random 來取得 10~20 的隨機數
		int r4 = random.nextInt(11); // 0~10
		r4 = r4 + 10;
		System.out.println(r4);

	}

}