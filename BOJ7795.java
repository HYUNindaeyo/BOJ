package 백준공부;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ7795 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int testcase;
		int A;
		int B;
		int Anum[];
		int Bnum[];
		
		testcase = scan.nextInt();
		for (int t = 0; t<testcase;t++) {
			A = scan.nextInt();
			B = scan.nextInt();
			//int Map[][] = new int[A][B];
			int count = 0;
			Anum = new int[A];
			for (int i = 0; i<A;i++) {
				Anum[i] = scan.nextInt();
			}
			Bnum = new int[B];
			for (int i = 0; i<B;i++) {
				Bnum[i] = scan.nextInt();
			}
			Arrays.sort(Anum);
			Arrays.sort(Bnum);
			
			for (int i=0;i<A;i++) {
				int j = 0;
				
				while(j<B&&Anum[i] > Bnum[j]) {
					j++;
				}
/*				for (int j=0;j<B;j++) {
					if (Bnum[j]<Anum[i]) count ++;
				}
*/
				count = count + j;
			}

			System.out.println(count);
		}
		
	}

}