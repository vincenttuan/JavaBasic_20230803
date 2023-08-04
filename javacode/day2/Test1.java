package day2;

public class Test1 {

	public static void main(String[] args) {
		// 整數 byte < short < int < long
		// bits  8      16     32     64
		byte audio = 10; // 音標樣本
		short temperature = 5000; // 溫度
		int vote = 100_0000; // 得票
		long stars = 9999_9999_9999L; // 天上的星星
		System.out.printf("%d %d %d %d\n", audio, temperature, vote, stars);
		// 浮點數 float < double
		// bits    32      64
		float pi = 3.14f;
		double price = 123456789.87654321;
		System.out.printf("%.2f %.2f\n", pi, price);
		// 字元 char
		// bits 16
		char c1 = '我';
		char c2 = 'A';
		char c3 = 65; // 65 就是 'A', 請參考 ASCII 編碼
		char c4 = '\u0048'; // u0048 就是 'H', 請參考 unicode 編碼
		System.out.printf("%c %c %c %c\n", c1, c2, c3, c4);
		// 布林 boolean
		boolean flag = true; // true or false
		boolean isPass = (45 >= 60);
		System.out.printf("%b %b\n", flag, isPass);
		// int 轉 char
		char word = 25105; // int 轉 char
		System.out.printf("%c\n", word);
		//  char 轉 int
		int number = '我';
		System.out.printf("%d\n", number);


	}	

}