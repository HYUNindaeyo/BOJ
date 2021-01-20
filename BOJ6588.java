package 백준공부;

import java.util.Scanner;

public class BOJ6588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime[] = new boolean[1000001];
		prime[0] = prime[1] = true;
		for (int i=2;i*i<=1000000;i++) {
			if(!prime[i]) {
				for (int j=i*i;j<=1000000;j=j+i) {
					prime[j] = true;
				}
			}
		}
		Scanner scan = new Scanner(System.in);
		//int T = scan.nextInt();
		while (true) {
			int N = scan.nextInt();
			if (N==0) break;
			
			for (int i=2;i<=N/2;i++) {
				if (!prime[i]&&!prime[N-i]) {
					System.out.printf("%d = %d + %d\n",N,i,N-i);
					break;
				}
			}
		}

	}

}


//1. 9020이 랑 거의 유사ㅇ 이것도 시간초과 코드였어서 그냥 고침 
//2. break 조건을 좀더 조여도 계속 시간초과 나서 결국 그냥 for 문 하나 없애고 
//contains 썼는데 또 시간 초과 .. .ㅋㅋ 
//3. 아이디어만 약간 수정 하여 prime에서판별한 것을 기반으로 그냥 while 돌리기로/. list add 없이.
/*

int count = 0;
for (int i=0;i<=1000000;i++) {
	if (!prime[i]) {
		count ++;
		list.add(i);
		
	}
}
//System.out.println(right);
//System.out.println(left);
int result1=1, result2=1;

for (int i=1;i<list.size();i++) {
	int tmp = (int) list.get(i);
	if (list.contains(N-tmp)) {
		result1 = tmp;
		result2 = N-tmp;
		break;
	}
}
System.out.printf("%d = %d + %d\n",N,result1,result2);
/*	for(int i=0;i<list.size() ; i++) {
	System.out.println(list.get(i));
	
}
*/