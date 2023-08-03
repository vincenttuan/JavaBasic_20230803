public class Hello5 {

	public static void main(String[] args) {
		// double 表示浮點數
		// int 表示整數
		double f = 50.5; // 華氏 50 度
		// 華氏f = 攝氏c * (9.0/5) + 32
		// 攝氏c = (華氏f - 32) * (5.0/9)
		double c = (f - 32) * (5.0/9);
		// %f 放置浮點數
		// %d 放置整數
		System.out.printf("華氏 %.1f\n", f);
		System.out.printf("攝氏 %.1f\n", c);

	}

}