package 백준공부;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class BOJ2407 {
	static int N,M;
	
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 
		 N = Integer.parseInt(st.nextToken());
	     M = Integer.parseInt(st.nextToken());

	     BigInteger bigNum1 = BigInteger.ONE;  
	     BigInteger bigNum2 = BigInteger.ONE;  
	     
	     for (int i=M+1;i<=N;i++) {
	    	 bigNum1 = bigNum1.multiply(new BigInteger(String.valueOf(i)));
	    	 bigNum2 = bigNum2.multiply(new BigInteger(String.valueOf(N-i+1)));
	     }
	     BigInteger result = bigNum1.divide(bigNum2);
	     System.out.println(result);

	}

}
