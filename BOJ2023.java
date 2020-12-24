package 백준공부;

import java.io.*;
import java.util.*;


public class BOJ2023 {
	private static int N;
	public static int[] dx = {1,2,3,5,7,9}; 
	static int ret = 0;
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		dfs(N,0);
		Collections.sort(list);
		for(Integer i:list) {
			System.out.printf("%d\n", i);
		}
	}

	static void dfs(int count, int num) {
		if(count == 0) return;
		//System.out.printf("dfs 실행\n");
		for (int i = 0; i<6;i++) {
			int nextNum = num*10+dx[i];
			if (nextNum==1) continue;
			//System.out.printf("nextnum :%d\n",nextNum);
			if (isPrime(nextNum)) {
				//System.out.printf("소수  :%d\n",nextNum);
				if(count==1) {list.add(nextNum); continue;}
				dfs(count-1,nextNum);  	
			}
		}
		
	}
	
	static boolean isPrime(int num) {
		for(int i = 2; i*i<=num; i+=1) {
                if(num%i==0) return false;                
        }
		return true;
	}
}


/*static void Prime(int End){
		for(int i = 2; i*i<=End; i+=1) {
            for(int j=i*i; j<=End; j+=i) {
                arr[j] = false;       
            }
        }
	}
	
	static boolean SearchPrime(int num) {
		boolean result = false;
		if (arr[num]) {result = true;}
		return result;
	}
*/
/*static void SearchMystery(int num) {
	int tmp = num;
	for (int i = 0; i < N ; i++) {
		if (!SearchPrime(num)) {
			return;
		}
		num = num/10;
	}
	System.out.println(tmp);
}
*/
/*
 static boolean SearchPrime(int num) {
		boolean result = true;
		int end = (int)Math.sqrt(num);
		for (int i = 2; i<=end;i++) {
			if (num%i==0) {
				result = false;
				break;
			}
			else {
				result = true;
			}
		}
		return result;
	}
*/