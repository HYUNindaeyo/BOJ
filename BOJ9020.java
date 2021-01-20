package 백준공부;

import java.util.*;

public class BOJ9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 0; t<T;t++) {
			int N = scan.nextInt();
			int left = 0; 
			int right = 0;
			boolean prime[] = new boolean[10001];
			ArrayList list = new ArrayList<Integer>();
			prime[0] = prime[1] = true;
			for (int i=2;i*i<=10000;i++) {
				if(!prime[i]) {
					for (int j=i*i;j<=10000;j=j+i) {
						prime[j] = true;
					}
				}
			}
			int count = 0;
			for (int i=0;i<=10000;i++) {
				if (!prime[i]) {
					count ++;
					list.add(i);
					if (i<=N/2) {
						left = count-1; 
						right = count-1;
					}
				}
			}

			int gap = 10000;
			int result1=(int) list.get(left);
			int result2=(int) list.get(right);
			Loop1:
			for (int i=left;i>=0;i--) {
				for (int j=right;j<list.size();j++) {
					//System.out.println("for 문 "+list.get(i));
					//System.out.println("for 문 " +list.get(j));
					int tmp = (int)list.get(i)+(int)list.get(j);
					//System.out.println("tmp"+tmp);
					//System.out.println(i);
					//System.out.println(j);
					if(tmp==N) {
						//System.out.println(i);
						//System.out.println(j);
						result1 = i;
						result2 = j;
						//gap = j-i;
						break Loop1;
					}
				}
			}
			System.out.printf("%d %d\n",list.get(result1),list.get(result2));
			//System.out.println(right);
			//System.out.println(left);
			
		/*	for(int i=0;i<list.size() ; i++) {
	        	System.out.println(list.get(i));
	        	
	        }
	        */
		}
		
	}

}
//결국 1에서 아주 약간 고쳐서 2중 포문 깨는 방식으로 품ㅁ.

//2. 구글링해서 했는데도 시간초과. 사실 이게 더전탐이라 시간초과일것 같았음.
/*
 * int result1=0, result2=0;
			//Loop1:
			for (int i=0;i<list.size();i++) {
				for (int j=i;j<list.size();j++) {
					int tmp = (int)list.get(i)+(int)list.get(j);
					if(tmp==N) {
						result1 = i;
						result2 = j;
					
						//break Loop1;
					}
				}
			}
			System.out.printf("%d %d\n",list.get(result1),list.get(result2));
 */
//1. 시간초과 코드.. 가운데 값을 잡고 중간부터 돌리려고 했으나 결과적으로 전체 탐색을 해야 하는 참사가. 
/*
int gap = 10000;
int result1=(int) list.get(left);
int result2=(int) list.get(right);
for (int i=left;i>=0;i--) {
	for (int j=right;j<list.size();j++) {
		//System.out.println("for 문 "+list.get(i));
		//System.out.println("for 문 " +list.get(j));
		int tmp = (int)list.get(i)+(int)list.get(j);
		//System.out.println("tmp"+tmp);
		//System.out.println(i);
		//System.out.println(j);
		if(tmp==N) {
			//System.out.println(i);
			//System.out.println(j);
				result1 = i;
				result2 = j;
				//gap = j-i;
				break;
		}
	}
}
System.out.printf("%d %d\n",list.get(result1),list.get(result2));
*/