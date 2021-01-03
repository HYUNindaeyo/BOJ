package 백준공부;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2805 {
	static int[] num;
	static int N,M;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		N = scan.nextInt();
		M = scan.nextInt();
		num = new int[N+1];
		for (int i = 0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		
		/*for (int i = 0;i<N+1;i++) {
			System.out.printf("%d ",num[i]);
		}
		*/
		System.out.printf("%d",binarysearch(num[0],num[num.length-1]));
	}
	
	public static long binarysearch(int first,int end) {
		long left = first;
		long right = end;
		long mid = 0;
		while (left<=right) {
			mid = (left+right)/2;
			long cutTree = 0;
			long sumcutTree = 0;
			//System.out.println(mid+"mid 결과 출");
			//System.out.printf("%d	%d	%d\n",left,mid,right);
			//System.out.printf("rate :%h %h\n",Z,newZ);
            for(int j=0; j<num.length; j++){
                
                cutTree = num[j] - mid; // 이분탐색으로 적절한 톱날의 높이를 찾아간다. 중간 값으로 나무들을 잘라보고
                                                 // 범위를 좁혀나간다.
                
                if(cutTree <0){
                    cutTree = 0; // 잘린게 없으면 0이기 때문에 마이너스 값은 존재할 수 없다.
                }
                sumcutTree += cutTree;
            }
            
            if(sumcutTree >= M){ // 톱으로 잘라낸 나무 길이들의 합이 최소한으로 가져가야되는 나무 길이보다 클 때
                
                left = mid + 1; // 환경을 생각해서 딱 맞춰 잘라가려면 톱날의 높이를 높여서 나무를 조금만 잘라가야 한다.
                
            }else if(sumcutTree < M){ // 톱으로 잘라낸 나무 길이들의 합이 최소한으로 가져가야 되는 나무 길이보다 작을 때
                
                right = mid - 1; // 필요한 나무길이보다 잘라낸 나무 길이들의 합이 작기 때문에 톱날의 높이를 낮춰서 더 길게 베어야 한다.
                
            }
		}
		return right;
	}
}

//이분탐색으로 푸는 문제.

/*
DP로 짰는데 이번엔 메모리 누수...ㅎ 
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in); 
int N = scan.nextInt();
int M = scan.nextInt();
int num[] = new int[1000000001];
int DP[] = new int[1000000001];
for (int i = 0;i<M+1;i++) {
	int temp = scan.nextInt();
	num[temp]++;	
}
int count = 0;
for (int i=1000000000;i>0;i--) {
	if (num[i]!=0) {
		count = count + num[i];
	}
	DP[i-1] = DP[i]+count;
	if (DP[i-1]>=M) {
		System.out.printf("%d\n",i-1);
		break;
	}
}

for (int i=0;i<50;i++) {
	System.out.printf("%d %d \n",i,DP[i]);
}
}
*/