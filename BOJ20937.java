package 백준공부;
import java.io.*;
import java.util.*;
public class BOJ20937 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// TODO Auto-generated method stub
		int N = Integer.parseInt(st.nextToken());
		int max = 0;
		int array[]= new int[50001];
		String[] s = br.readLine().split(" ");
		for (int i=0;i<N;i++) {
			int tmp = Integer.parseInt(s[i]);
			array[tmp]++;
		}
		for (int i=1;i<50001;i++) {
			if (max < array[i]) max = array[i];
		}
		
		System.out.println(max);
	}

}
