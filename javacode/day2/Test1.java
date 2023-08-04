package day2;

public class Test1 {

	public static void main(String[] args) {
		// 整數 byte < short < int < long
		byte audio = 10; // 音標樣本
		short temperature = 5000; // 溫度
		int vote = 100_0000; // 得票
		long stars = 9999_9999_9999L; // 天上的星星
		System.out.printf("%d %d %d %d\n", audio, temperature, vote, stars);
	}	

}