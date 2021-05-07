package 백준공부;

import java.util.*;

public class BOJ15565 {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<Integer> result = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] num = new int[N];
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
			if (num[i] == 1) {
				list.add(i);
			}
		}
		
		for (int i=0;i<=list.size()-K;i++) {
			System.out.println(list.get(i+K-1)-list.get(i)+1);
			result.add(list.get(i+K-1)-list.get(i)+1);
		}
		Collections.sort(result);
		if (result.size()==0) System.out.println("-1");
		else System.out.println(result.get(0));
	}

}
