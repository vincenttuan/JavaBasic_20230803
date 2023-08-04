package day2;

/*
給定一個學生成績（score），我們希望將其轉換為字母等級。以下是將分數轉換為等級的標準：

90分以上：A
80到89分：B
70到79分：C
60到69分：D
59分以下：F

您的任務是根據以下要求，用二種不同的方法計算等級：
1.使用switch結構
2.使用三元運算符 ?:

最終輸出以下內容（假設score為75）：
用 switch 處理，分數: 75，等級: C
用 ?: 處理，分數: 75，等級: C

*/


public class Test11 {
	public static void main(String[] args) {
		int score = 75;
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}

		// 嵌套式  ?:
		String grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
		System.out.println(grade);

	}
}

































































