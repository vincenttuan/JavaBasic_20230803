package day2;

/*
中華民國國民身分證第三碼
0 – 5	在臺灣出生之本籍國民
6	入籍國民，原為外國人
7	入籍國民，原為無戶籍國民
8	入籍國民，原為港澳居民
9	入籍國民，原為中國大陸人民

請寫一隻程式當使用者輸入中華民國國民身分證後請根據第三碼
來判別國民身分
例如1: A123456789
印出: 在臺灣出生之本籍國民
例如2: A198765432
印出: 入籍國民，原為中國大陸人民

*/
public class Test10 {

	public static void main(String[] args) {
		String id = "A123456789";
		char code = id.charAt(2); // 第三碼
		switch(code) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
				System.out.println("在臺灣出生之本籍國民");
				break;
			case '6':
				System.out.println("入籍國民，原為外國人");
				break;
			case '7':
				System.out.println("入籍國民，原為無戶籍國民");
				break;
			case '8':
				System.out.println("入籍國民，原為港澳居民");
				break;
			case '9':
				System.out.println("入籍國民，原為中國大陸人民");
				break;
			default:
				System.out.println("身分證不正確");

		}

	}

}