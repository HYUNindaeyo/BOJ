package 백준공부;

import java.util.*;

public class BOJ10816 {
	static int[] cardNum;
	static int[] CardToCount;
	static int[] IndexOfCard;
	static int N,M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		cardNum = new int[N+1];
		for (int i=0;i<N;i++) {
			cardNum[i] = scan.nextInt();
		}
		Arrays.sort(cardNum);
		M = scan.nextInt();
		CardToCount = new int[M+1];
		IndexOfCard = new int[M+1];
		for (int i=0;i<M;i++) {
			CardToCount[i] = scan.nextInt();
			binarySearch1(i,CardToCount[i]);
			binarySearch2(i,CardToCount[i]);
			if (IndexOfCard[i]==-1) System.out.printf("0 ");
			else if (IndexOfCard[i]==-2) System.out.printf("1 ");
			else {System.out.printf("%d ",IndexOfCard[i]);}
			//IndexOfCard[i]=binarySearch(CardToCount[i]);
			//System.out.printf("숫자는 %d	"+CountCardNum(IndexOfCard[i])+"	\n",IndexOfCard[i]);
			//System.out.printf("%d	",CountCardNum(IndexOfCar
			}
		}
	public static void binarySearch1(int i,int card) { //upper를 찾는 코드로 이렇게하면 찾고자 하는 값보다 큰 값이 처음 나타나는 위치 return
		int left = 0;
		int right = N-1;
		int mid = 0;
		//System.out.printf("%d번 카드 찾\n",card);
		while (left<right) {
			mid = (left+right)/2;
			//System.out.println(mid+"mid 결과 출");
			//System.out.printf("%d	%d	%d\n",cardNum[left],cardNum[mid],cardNum[right]);
			
			//System.out.printf("rate :%h %h\n",Z,newZ);
				
				if (cardNum[mid]<=card) left = mid+1;
				else right = mid;
				
		}
		
		IndexOfCard[i] = left+1;
		//System.out.printf("%d의 upper index는 %d\n",card, mid+1);
	}
	
	public static void binarySearch2(int i,int card) {//lower를 찾는 코드로 이렇게하면 찾고자 하는 값보다 큰 값이 처음 나타나는 위치 return
		int left = 0;
		int right = N-1;
		int mid = 0;
		//System.out.printf("%d번 카드 찾\n",card);
		while (left<right) {
			mid = (left+right)/2;
			//System.out.println(mid+"mid 결과 출");
			//System.out.printf("%d	%d	%d\n",cardNum[left],cardNum[mid],cardNum[right]);
			
			//System.out.printf("rate :%h %h\n",Z,newZ);
			if (cardNum[mid]< card) left= mid+1;
			else right = mid;
		}
		if(IndexOfCard[i]==left+2) {IndexOfCard[i] = -2; return;}
		if (card!=cardNum[left+1]) {IndexOfCard[i] =-1; return;}
		//System.out.printf("\n%d의 lower index는 %d\n",IndexOfCard[i], left+1);
		
		IndexOfCard[i] = IndexOfCard[i]-mid-1;
		
		//System.out.printf("%d의 lower index는 %d\n",card, mid+1);
	}
		
}
	

	
	
//이것도 이진탐색 문제. arraysort때린 후 이진탐색 ㄱ ㄱ 함 .
//하나짜리를 예외처리해주는 게 정말 정말 중요!.


/*binary search 후 주변 탐색으로 찾으려고 했으나 시간 초
  public static int binarySearch(int card) {
			int left = 0;
			int right = N-1;
			int mid = 0;
			//System.out.printf("%d번 카드 찾\n",card);
			while (left<right) {
				mid = (left+right)/2;
				//System.out.println(mid+"mid 결과 출");
				//System.out.printf("%d	%d	%d\n",cardNum[left],cardNum[mid],cardNum[right]);
				
				//System.out.printf("rate :%h %h\n",Z,newZ);
	 			if (cardNum[mid]== card) break;
	 			else if (cardNum[mid]>card) right = mid - 1;
	 			else if (cardNum[mid]<card) left = mid+1;
			}
			if(cardNum[mid]!=card) return N;
			//System.out.printf("index는 %d\n",mid);
			return mid;
	}
  public static int CountCardNum(int index) {
		int count =0 ;
		int checkindex = index;
		int checkNum = cardNum[index];
		while (checkindex<cardNum.length) {
			if(checkNum!= cardNum[checkindex]) break;
			else {count++; checkindex++;}
		}
		checkindex = index-1;
		while (0<=checkindex) {
			if(checkNum!= cardNum[checkindex]) break;
			else {count++; checkindex--;}
		}
		return count;
	}
	
	*/

//짜증나는  이분탐색으로 풀면 자바에서는 시간 초과 나옴 ^^
//이 문제를 메모이제이션으로 풀라고 한다니 초기의도와는 다를듯 ㅎ
//코드는 인터넷에서 참고하였다. 
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cnt = new int[20_000_001];
        
        for(int i = 0; i < n; i++) {
            cnt[Integer.parseInt(st.nextToken()) + 10_000_000]++;
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < m; i++) {
            sb.append(cnt[Integer.parseInt(st.nextToken()) + 10_000_000] + " ");
        }
        
        System.out.println(sb);
    }
}

*/
