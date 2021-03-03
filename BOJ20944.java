package 백준공부;

import java.io.*;
import java.util.*;
public class BOJ20944 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		char[] chars = new char[N];
		Arrays.fill(chars, 'a');
		String s = new String(chars);
		System.out.println(s);

	}

}