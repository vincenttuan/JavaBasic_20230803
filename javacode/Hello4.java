public class Hello4 {

	public static void main(String[] args) {
		int x = 1_0000; // 10000
		int y = 2_0000; // 20000
		int z = x + y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.printf("%,d\n", x);
		System.out.printf("%,d\n", y);
		System.out.printf("%,d\n", z);
	}

}