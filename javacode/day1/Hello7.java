package day1;

public class Hello7 {

	public static void main(String[] args) {
		// 計算 BMI
		double h = 170; // 公分
		double w = 60; // 公斤
		// h / 100
		h = h/100; // 換成公尺
		double bmi = w / (h*h);
		System.out.printf("身高 %.1f(公尺) 體重 %.1f(公斤) BMI %.2f\n", h, w, bmi);
	}

}