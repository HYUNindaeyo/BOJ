package 백준공부;

import java.util.Scanner;

public class BOJ2877 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int tmp = 4;
		int count = 2;
		int num = 0;
		for (int i=0;i<30;i++) {
			if (tmp-2<K&&K<=tmp*2-2) {
				break;
			}
			count ++;
			tmp = tmp * 2;
		}
		if (K==2) count = 1;
		if (K==1) count = 1;
		//System.out.println(count);
		//K는 count 자리 수의 2진수..
		num = K - (int)Math.pow(2, count) +1;
		//System.out.println(num);
		//K는 count 자리 수의 num 번째 수 
		//ex ) 7 -> 3자리 수의 0번째 수
		String binary = Integer.toBinaryString(num);
		//System.out.println(binary);
		//String binary = String.format("%030d",Integer.parseInt(Integer.toBinaryString(num)));
		//System.out.println(binary);
		char[] binarychar=binary.toCharArray();
		//System.out.println(binarychar.length);
		if (binarychar.length<count) {
			for (int i=0;i<count-binarychar.length;i++) {
				System.out.printf("4");
				//System.out.printf("here");
			}
		}
		//char[] charprint = new char[count];
		for (int i=0;i<binarychar.length;i++) {
			if (binarychar[i]=='1') {
				binarychar[i] = '7';
			}
			if (binarychar[i]=='0') {
				binarychar[i] = '4';
			}
			System.out.printf("%c",binarychar[i]);
		}
	}

}



//1. 2진수로 풀려다 오히려 이게 귀찮을 것 같아서 포기.
/*

String binary = Integer.toBinaryString(K);
//System.out.println("2 진수 : " + binary);
char[] binarychar=binary.toCharArray();
for (int i=0;i<binarychar.length;i++) {
	if (binarychar[i]=='1') {
		binarychar[i] = '4';
	}
	if (binarychar[i]=='0') {
		binarychar[i] = '7';
	}
	System.out.printf("%c ",binarychar[i]);
}
*/