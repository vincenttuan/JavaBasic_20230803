package day2;

/*
小 7 飲料特價
飲料一瓶 22 元
買 N 送 一
請問買20瓶(根據買 N 送 一)要多少錢 ?

*/

import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int buyNumber = 5; // 買的數量
		int freeNumber = 2; // 送的數量

		int pricePerBottle = 20; // 每瓶價格
		System.out.printf("飲料每瓶 $%d (買 %d 送 %d) 請輸入購買瓶數:", pricePerBottle, buyNumber, freeNumber);
		int bottlesToBuy = sc.nextInt();  // 總共要買幾瓶
		
		int groupSize = buyNumber + freeNumber;
		int buyThreeGetOneGroups = bottlesToBuy / groupSize;  // 共有幾組的買三送一
		int bottlesToPayForInGroups = buyThreeGetOneGroups * buyNumber; // 每組總共要付幾瓶的錢
		int remainingBottlesToPayFor = bottlesToBuy % groupSize; // 剩餘幾瓶要付
		int totalBottlesToPayFor = 	bottlesToPayForInGroups + remainingBottlesToPayFor; // 總共要付幾瓶的錢

		int totalPrice = totalBottlesToPayFor * pricePerBottle;

		System.out.printf("買 %d 瓶需要 $%d 元\n", bottlesToBuy, totalPrice);


	}		

}