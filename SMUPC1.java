package 백준공부;

import java.util.Scanner;

public class SMUPC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		char[] arrChar = S.toCharArray();
		for (int i=0;i<arrChar.length;i++) {
			int tmp = (int)arrChar[i];
			int count = 0, one = 0,ten = 0, hund = 0;
			one = tmp%10;
			tmp = tmp - one;
			ten = (tmp%100)/10;
			tmp = tmp - ten*10;
			hund = tmp/100;
			count = one+ten+hund;
			for (int j=0;j<count;j++) {
				System.out.print(arrChar[i]);
			}
			System.out.println();
		}
	}

}
