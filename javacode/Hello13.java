import java.util.Scanner;
public class Hello13 {

	public static void main(String[] args) {
		// 複利 = P(1+r)^n
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入存款金額 $:");
		int principal = sc.nextInt();

		System.out.print("請輸入年利率:");
		double rate = sc.nextDouble();

		System.out.print("請輸入期數(年):");
		int n = sc.nextInt();	

		double factor = Math.pow(1+rate/100, n); // 複利計算因子
		double total = principal * factor;

		System.out.printf("期初存款金額 $%,d\n", principal);
		System.out.printf("年利率 %.2f %%\n", rate);
		System.out.printf("期數(年) %d\n", n);
		System.out.printf("期末存款金額 $%,.0f\n", total);


	}

}