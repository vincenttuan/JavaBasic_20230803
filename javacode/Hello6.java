public class Hello6 {

	public static void main(String[] args) {
		// 換匯
		double usd = 5000; // 5000.0 美金
		double usdRate = 31; // 1 美金 = 31 台幣
		double twd = usd * usdRate;
		System.out.printf("美金 $%,.1f\n", usd);
		System.out.printf("匯率 $%,.1f\n", usdRate);
		System.out.printf("台幣 $%,.0f\n", twd);
	}

}