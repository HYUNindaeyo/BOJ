package 백준공부;

import java.util.*;

public class BOJ14888 {
	public static int N;
	public static int num[];
	public static int symbol[];
	public static int result =0;
	
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		num= new int[N];
		symbol = new int[4];
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		for (int i=0;i<4;i++) {
			symbol[i] = scan.nextInt();
		}
		
		dfs(0,0,0,0, num[0]);
		Collections.sort(list);
		/*
		for(Integer i : list) { //for문을 통한 전체출력
		    System.out.println(i);
		}
		*/
		System.out.printf("%d\n",list.get(list.size()-1));
		System.out.printf("%d\n",list.get(0));
	}
 	static void dfs (int sum, int sub, int mul, int div,int result) {
		int temp = sum+sub+mul+div;
		if (temp==N-1) {
			list.add(result);
			return ;
		}
		if (sum < symbol[0]) {
			dfs(sum+1,sub,mul,div,result + num[temp+1]);
		}
		if (sub < symbol[1]) {
			dfs(sum,sub+1,mul,div,result - num[temp+1]);
		}
		if (mul < symbol[2]) {
			dfs(sum,sub,mul+1,div,result*num[temp+1]);
		}
		if (div < symbol[3]) {
			dfs(sum,sub,mul,div+1,result/num[temp+1]);
		}
	}

}
