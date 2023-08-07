package day3;

/*
利用 for 迴圈印出

*
**
***
****
*****

*/

public class ForLoop3 {

	public static void main(String[] args) {
		
		for(int x=1;x<=5;x++) {

			for(int y=1;y<=x;y++) {
				System.out.print("*");			
			}
			System.out.println();

		}


	}

}
