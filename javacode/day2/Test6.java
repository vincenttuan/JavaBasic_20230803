package day2;

/*
題目:根據購買商品的數量來計算折扣並計算最終確定價格。
1.如果客戶購買了 10 件或更多商品，則應提供 15% 的折扣。
2.如果客戶購買了超過 5 件但少於 10 件商品，則應提供 10% 的折扣。
3.如果客戶購買了 5 件或以下商品，則不提供折扣。

例如1: 商品價格 = 120, 購買數量 = 6
印出:
原價: $120
數量: 6
折扣: 10.0%
最終價: $648

例如2: 商品價格 = 120, 購買數量 = 3
印出:
原價: $120
數量: 3
折扣: 0.0%
最終價: $360

例如3: 商品價格 = 120, 購買數量 = 11
印出:
原價: $120
數量: 11
折扣: 15.0%
最終價: $1122

*/
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 120;
		System.out.printf("商品價格 %d 請輸入購買數量:", price);
		int qty = sc.nextInt();
		double discount = 0.0;
		if(qty >= 10) {
			discount = 0.15;
		} else if (qty > 5) {
			discount = 0.10;
		}
		int finalPrice = (int)((price * qty) * (1 - discount));

		System.out.printf("原價: $%d\n數量: %d\n折扣: %.2f%%\n最終價: $%d\n", 
							price, qty, discount*100, finalPrice);
	}
}

