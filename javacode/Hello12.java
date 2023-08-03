import java.util.Scanner;

public class Hello12 {

	public static void main(String[] args) {
		// 使用者可以自行輸入上有幾頭下有幾足, 然後由電腦計算雞兔各有多少隻
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入雞兔共有幾頭:");
		int total = sc.nextInt();
		int min = total * 2, max = total * 4;

		System.out.printf("請輸入雞腳+兔腳共有幾足(%d~%d):", min, max);
		int feet = sc.nextInt();

		int x = (feet - (total*2))/(4-2);
		int y = total - x;
		System.out.printf("兔 %d 雞 %d\n", x, y);
	}

}