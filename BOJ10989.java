package 백준공부;
import java.io.*;
import java.util.*;

public class BOJ10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[10001];
		
		for (int i = 0;i<N;i++) {
			num[Integer.parseInt(br.readLine())] ++;
		}
		
		 br.close();
		 
	     StringBuilder sb = new StringBuilder();
	     
		for (int i = 1;i<10001;i++) {
			while(num[i] > 0){
				sb.append(i).append('\n');
                 num[i]--;
            }
		}
		System.out.println(sb);
	}
}

//scan이랑 bufferreader이 시간을 갈랐는지 완전 똑같은 코드에도 계속 안 되다가
//바꾸고 나니까 통과함. 
