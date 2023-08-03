import java.util.Scanner;

public class Hello11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 一般貸款(使用單利)
		System.out.print("請輸入本金:");
		double principal = sc.nextDouble(); // 本金

		System.out.print("請輸入年利率:");
		double rate = sc.nextDouble(); // 年利率
		
		System.out.print("請輸入貸款期數(年):");
		int n = sc.nextInt(); // 貸款期數(年)

		double interest = principal * (rate/100) * n; // 使用單利計算利息
		double totalAmount = principal + interest;

		System.out.printf("本金 $%,.0f\n", principal);
		System.out.printf("年利率 %.1f%%\n", rate);
		System.out.printf("貸款期數 %d 年\n", n);
		System.out.printf("利息 $%,.0f\n", interest);
		System.out.printf("總金額 $%,.0f\n", totalAmount);

	}

}