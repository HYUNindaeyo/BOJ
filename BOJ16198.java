package 백준공부;

import java.util.*;

public class BOJ16198 {
	
	static int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int N = scan.nextInt();
		ArrayList num = new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			num.add(scan.nextInt());
		}
		result = 0;
		dfs(N,num,0);
		System.out.println(result);
		
	}
	
	public static void dfs(int n, ArrayList<Integer> num,int sum) {
		if(n==2) {
			result = Math.max(result, sum);
			return ; 
		}
		for (int i=1;i<num.size()-1;i++) {
			int mul = num.get(i-1)*num.get(i+1);
			int energy = num.get(i);
			num.remove(i);
			dfs(n-1,num,sum+mul);
			num.add(i,energy);
		}
	}
}

//dfs로 푸는 문제.. arraylist에 넣고 하나 제거하고 다시 dfs넣고 이런 식으로 해서 탐색해줌
//하나씩 제거해가며 넣어주고, 그상태에서 다시 dfs를 돌림. 그다음 앞뒤만 남았을 때 최대값리턴,, 
