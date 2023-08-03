public class Hello8 {

	public static void main(String[] args) {
		// 圓的半徑 r = 10.0
		double r = 10;
		// 請計算並印出 圓面積 = ? 圓周長 = ?
		double pi = Math.PI;  // 3.1415926;
		double area = Math.pow(r, 2) * pi; // r * r * pi;
		double line = 2 * r * Math.PI;  // 2 * r * pi

		System.out.printf("圓面積 = %.1f 圓周長 = %.1f\n", area, line);
	}

}