package 백준공부;
import java.util.*;
public class BOJ17245 {
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[1000001];
		int DP[] = new int[1000001];
		int sum = 0;
		int DPsum = 0;
		int ret = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in); 
		N = scan.nextInt();
		for (int i = 0;i<N*N;i++) {
			int temp =scan.nextInt();
			num[temp]++;
			sum = sum+temp;
		}
		/*	for (int i = 0;i<N*N;i++) {
		System.out.printf("%d ",num[i]);
		}
		 */
	
		if(sum/2==0) count = sum/2;
		else count = sum/2 + 1;
		
		DPsum = N*N-num[0];
		//System.out.printf("sum %d ",sum);
		//System.out.printf("count %d ",count);
		//System.out.printf("dpsum %d ",DPsum);
		sum = sum - num[0]; //남은 컴퓨타 수 
		DP[0] = num[0];
		for(int i= 1;i<N*N;i++) {
			DPsum = DPsum-num[i];
			int temp = i*num[i]+DPsum;

			//System.out.printf("dpsum %d \n",DPsum);
			
			System.out.printf( "temp %d\n",temp);
			
			DP[i] = DP[i-1] + temp;
			System.out.printf("DP %d \n",DP[i]);
			if (DP[i]>=count) {
				ret = i;
				System.out.printf("ret %d \n",ret+1);
				break;
			}
		}
		
		for (int i=0;i<N*N;i++) {
			//System.out.printf("%d ",DP[i]);
		}
		//System.out.printf("%d ",ret);
	}
}