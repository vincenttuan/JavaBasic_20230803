package day2;

/*
小 7 飲料特價
飲料一瓶 22 元
買 三 送 一
請問買20瓶要多少錢 ?

答案: 買 22 瓶飲料需要 340 元
*/

import java.util.Scanner;
public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pricePerBottle = 20; // 每瓶價格
		System.out.printf("飲料每瓶 $%d (買三送一) 請輸入購買瓶數:", pricePerBottle);
		int bottlesToBuy = sc.nextInt();  // 總共要買幾瓶
		
		int buyThreeGetOneGroups = bottlesToBuy / 4;  // 共有幾組的買三送一
		int bottlesToPayForInGroups = buyThreeGetOneGroups * 3; // 每組總共要付幾瓶的錢
		int remainingBottlesToPayFor = bottlesToBuy % 4; // 剩餘幾瓶要付
		int totalBottlesToPayFor = 	bottlesToPayForInGroups + remainingBottlesToPayFor; // 總共要付幾瓶的錢

		int totalPrice = totalBottlesToPayFor * pricePerBottle;

		System.out.printf("買 %d 瓶需要 $%d 元\n", bottlesToBuy, totalPrice);


	}		

}