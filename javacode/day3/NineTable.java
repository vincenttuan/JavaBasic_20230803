package day3;

public class NineTable {

	public static void main(String[] args) {
		
		for(int x=1;x<=9;x++) {

			for(int y=1;y<=9;y++) {
				System.out.printf("%2d*%2d=%2d ", x, y, (x*y));
			}
			System.out.println(); // 換行

		}

	}

}