package 백준공부;
import java.util.*;

public class BOJ14627 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int C = scan.nextInt();
		int sum = 0;
		int[] pa =new int[S];
		for (int i = 0; i < S ; i++) {
			pa[i] = scan.nextInt();	
		}
		//for (int i = 0; i < S ; i++) {
			//System.out.printf("pa[%d] : %d\n",i,pa[i]);
		//}
		for (int i = 0; i <S ; i++) {
			sum = sum + pa[i];
		}
		//System.out.println("sum은 "+sum);
		Arrays.sort(pa); 
		int result = binarysearch(pa,S,C);
		//System.out.println("여기 "+result);
		System.out.println(sum - (C*result));
		
	}
	
	static int binarysearch(int[] pa,int S, int C) {
		int left = 1;
		int right = pa[0]+1;
		while (left<=right) {
			int mid = (left+right)/2;
			int count = 0;
			for (int i=0;i<S;i++) {
				count = count + (pa[i]/mid);
				//System.out.println("count는 "+count);
			}
			//System.out.println("left는 "+left+"mid" +mid+"right"+ right);
			  if (count >= C) {
	                left = mid + 1;
	            } else {
	                right = mid-1;
	            }
		}
		return right;
	}
	
}
