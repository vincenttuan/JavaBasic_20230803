package day1;

public class Hello9 {

	public static void main(String[] args) {
		// 今有雞,兔同籠, 上有35頭, 下有94足, 問雞兔各幾何 ?
		int total = 35;
		int feet = 94;
		int x = (feet - (total*2))/(4-2);
		int y = total - x;
		System.out.printf("兔 %d 雞 %d\n", x, y);
	}

}