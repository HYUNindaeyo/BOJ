package 백준공부;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ9655 {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		if(N%2 == 1) System.out.println("SK");
		else  System.out.println("CY");
	}

}