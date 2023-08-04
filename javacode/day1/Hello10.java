package day1;

public class Hello10 {

	public static void main(String[] args) {
		// 一般貸款(使用單利)
		double principal = 350_0000; // 本金
		double rate = 18; // 年利率
		int n = 20; // 貸款期數(年)

		double interest = principal * (rate/100) * n; // 使用單利計算利息
		double totalAmount = principal + interest;

		System.out.printf("本金 $%,.0f\n", principal);
		System.out.printf("年利率 %.1f%%\n", rate);
		System.out.printf("貸款期數 %d 年\n", n);
		System.out.printf("利息 $%,.0f\n", interest);
		System.out.printf("總金額 $%,.0f\n", totalAmount);

	}

}