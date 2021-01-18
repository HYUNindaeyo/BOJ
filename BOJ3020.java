package 백준공부;

import java.util.*;

public class BOJ3020 {
	static int N;
	static int H;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		H = scan.nextInt();
		int Nup[] = new int[N/2];
		int Ndown[] = new int[N/2];
		int cnt[] = new int[H];
		int minCnt = 0;
		int min = Integer.MAX_VALUE;
		ArrayList list = new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			if(i%2==0) Ndown[i/2] = scan.nextInt();
			else Nup[i/2] = scan.nextInt();
		}
/*
		for (int i=1;i<N/2+1;i++) {
			System.out.println(Ndown[i]);
			System.out.println(Nup[i]);
		}
*/		
		Arrays.sort(Ndown);
		Arrays.sort(Nup);
		
/*		for (int i=1;i<N/2+1;i++) {
			System.out.println(Ndown[i]);
			System.out.println(Nup[i]);
		}	
*/		
        for(int i=1; i<=H; i++) {

            int j = binarySearch(0, N/2-1, i, Ndown);
            int k = binarySearch(0, N/2-1, H-i+1, Nup);
            cnt[i-1] = j+k;
            if(min>cnt[i-1])
                min = cnt[i-1];
        }

        for(int i=0; i<H; i++) {
            if(min==cnt[i])
                minCnt++;
        }

        System.out.println(min+" "+minCnt);
	}
	public static int binarySearch(int above,int below,int H,int[] arr) {
		int left = above;
		int right = below;
		int min = Integer.MAX_VALUE;
		while (left<=right) {
			int mid = (left+right)/2;
			if(H<=arr[mid]) {
				min = Math.min(mid, min);
				right = mid-1;
			}
			else left = mid+1;
		}
		if(min==Integer.MAX_VALUE)	return 0;
		return N/2-min;
	}
}

//그냥 이분 탐색으로 풀었다 위아래 나눠서 리스트 담고 이분탐색ㄱ 
//https://velog.io/@pss407/%EB%B0%B1%EC%A4%803020-%EA%B0%9C%EB%98%A5%EB%B2%8C%EB%A0%88
//저 코드 참고해서 고침,,upper lower 나누지 않은 거 말고 아이디어는 똑같은듯 
//2. 실패한 이분탐색upper lower 나눠서 풀었는데 뭔가 실패함 ,,, 
/*
for (int i=1;i<=H;i++) {
	int tmp =N/2-binarySearch2(Ndown,i-1); //아래쪽에서 i층 지나는 것 개수 
	//System.out.println(tmp);
	tmp =  tmp +N/2- binarySearch1(Nup,H-i);//위쪽에서 i층 지나는 것 개수    System.out.println(Ndown[i]);
	System.out.println(tmp);
	list.add(tmp);
	//min = Math.min(tmp, min);
}
Collections.sort(list);
int count = 0;
int tmp = 0;
while (true) {
	if (list.get(0)==list.get(tmp)) {
		count++;
		tmp++;
	}
	else break;
}
//System.out.printf("%d %d",list.get(0),count);
//System.out.println(min);
}
public static int binarySearch1(int num[],int i) {
int left = 1;
int right = N/2;
int mid = 0;
while (left<=right) {
	mid = (left+right)/2;
	//System.out.printf("%d	%d	%d\n",num[left],num[mid],num[right]);
	if (num[mid]<=i) left = mid+1;
	else right = mid-1;
}
return left;
}
public static int binarySearch2(int num[],int i) {
int left = 1;
int right = N/2;
int mid = 0;
while (left<=right) {
	mid = (left+right)/2;
	//System.out.printf("%d	%d	%d\n",num[left],num[mid],num[right]);
	if (num[mid]<i) left = mid+1;
	else right = mid-1;
}
return left;
}
*/
//1. 무난한 전체 탐색,,, 당연히 시간초과가 나올 거라 생각했고 진짜 시간초과. 
/*
 int Hnum[] = new int[H+1];
for (int i=1;i<=N;i++) {
int tmp = scan.nextInt();
if (i%2==1) { //석순일때 
	 for (int j=1;j<=tmp;j++) {
		 Hnum[j]++;
		 //System.out.printf("%d ",j);
	 }
}
else { //종유석일때 
	for (int j=H;j>H-tmp;j--) {
		Hnum[j]++;
		//System.out.printf("%d ",j);
	}
}
}
Arrays.sort(Hnum);
int count = 0;
int tmp = 1;
while (true) {
if (Hnum[1]==Hnum[tmp]) {
	count++;
	tmp++;
}
else break;
}
System.out.printf("%d %d",Hnum[1],count);
/*	for (int i=1;i<=H;i++) {
System.out.printf("%d ",Hnum[i]);
}
*/