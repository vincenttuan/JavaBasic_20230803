package day3;

/*
水果庫存有 20 個
使用者可以連續買進水果
每買一次庫存也要更新
買入 0 或者沒有庫存(=0)就要跳出迴圈

執行結果範例 1:
水果庫存有 20 個, 請輸入要買的數量:12
水果庫存有 8 個, 請輸入要買的數量:10
水果庫存不足請重新輸入
水果庫存有 8 個, 請輸入要買的數量:7
水果庫存有 1 個, 請輸入要買的數量:1
水果無庫存
程式結束

執行結果範例 2:
水果庫存有 20 個, 請輸入要買的數量:12
水果庫存有 8 個, 請輸入要買的數量:0
使用者買完了
程式結束

增加需求:
若一個水果 10 元, 請問最後使用者買水果花了多少錢
執行結果範例: 
使用者需要支付的總金額是 XXX 元

*/

import java.util.Scanner;

public class WhileDemo4 {

	public static void main(String[] args) {
		int fruitStock = 20; // 水果的初始庫存
		Scanner sc = new Scanner(System.in);
		
		while(fruitStock > 0) {
			System.out.printf("水果庫存有 %d 個, 請輸入要買的數量:", fruitStock);
			int purchaseAmount = sc.nextInt();
			if(purchaseAmount == 0) {
				System.out.println("使用者買完了");
				break;
			} else if(purchaseAmount > fruitStock) {
				System.out.println("水果庫存不足請重新輸入");
			} else {
				// 成功買入(庫存要減去購買數量)
				fruitStock -= purchaseAmount;
			}
		}

		if(fruitStock == 0) {
			System.out.println("水果無庫存");
		}

		System.out.println("程式結束");
		sc.close();

	}

}