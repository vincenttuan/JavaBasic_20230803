package day2;

public class Test9 {

	public static void main(String[] args) {
		// 身分證字號
		String id = "A198765432";
		System.out.printf("身分證 %s 長度 %d\n", id, id.length());
		char sex = id.charAt(1); // charAt(0) 就是字串的第一的字元, charAt(1) 就是字串的第二的字元
		// 利用 if-else 判斷男女
		if(sex == '1') {
			System.out.println("男性");
		} else {
			System.out.println("女性");
		}

		// 利用  ? : 來判斷男女
		System.out.println( (sex == '1') ? "男性" : "女性" );

	}

}