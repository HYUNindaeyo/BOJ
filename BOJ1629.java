package 백준공부;

import java.util.Scanner;

public class BOJ1629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		System.out.println(re(A,B,C)%C);
		
	}
	
	public static long re(long a, long b, long c) {
		 if (b==0) return 1;
		 else if (b==1) return a;
		 else if (b%2==0) {
			 long n = re(a,b/2,c) % c;
			 return (n*n) % c;
		 }
		 else {
			 long n = re(a,b/2,c) % c;
			 return (((n*n) % c)*a)%c;
		 }
	}
}
//재귀로 짜주면 굉장히 간단한 문제 . 

	/*
	int result = A%C;
	int temp = 1;
	int count = 1;
	if (B==1) {
		System.out.println(A); return ;
	}
	while (true) {
		//System.out.println(result);
		temp = result%C;
		result = (result * result)%C; 
		count = count *2;
		if (count == B) {
			System.out.println(result); return ;
		}
		if (count>B) {
			count = count/2;
			result = temp;
			break;
		}
		}
	
	int counttemp = count / 2;
	temp = (int)Math.sqrt(result);
	
	//System.out.printf("여기까지result %d count %d counttemp %d temp %d \n",result,count,counttemp,temp);
	while (count<B) {
		if (count+counttemp== B) {
			//System.out.printf("여기까지result %d count %d counttemp %d temp %d \n",result,count,counttemp,temp);
			System.out.println(result*temp); return ;
		}
		else if (count+counttemp<B) {
			result = (result*temp)%C;
			count = count + counttemp;
			counttemp = counttemp / 2;
			temp = (int)Math.sqrt(temp);
			//System.out.printf("여기까지result %d count %d counttemp %d temp %d \n",result,count,counttemp,temp);
			//System.out.println(result);
			
			
		}
		else {
			counttemp = counttemp / 2;
			temp = (int)Math.sqrt(temp);
			//System.out.printf("여기까지result %d count %d counttemp %d temp %d \n",result,count,counttemp,temp);
		}
	}
	
	System.out.println(result);
	
}

	
	*/
	//내 방법은 시간초과 남. 아이디어는 결국 분할정복이랑 거의 유사하지만 반대로 올라가는 과정에서 나누고 곱해줘야 할 게 너무 많아서 시간초과가 난듯... 
//새로운 코드는 https://youngest-programming.tistory.com/407 여기 참고함 