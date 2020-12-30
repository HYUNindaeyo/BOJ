package 백준공부;

import java.util.*;

public class BOJ1977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int sum = 0;
		double tmp = 0;
		double result = 0;
		for (int i = M;i<=N;i++) {
			tmp =  Math.sqrt(i); //이건 더블형으로 넣어둔거
			result = Math.floor(tmp);
			if (tmp==result) list.add(i);
		}
		
		if (list.isEmpty()) {
			System.out.println("-1");
			return ;
		}
		Collections.sort(list);
	
		for(Integer i : list) { //for문을 통한 전체출력
			sum = sum+i;
		  
		}
		  System.out.println(sum);
		  System.out.println(list.get(0));
	}

}
