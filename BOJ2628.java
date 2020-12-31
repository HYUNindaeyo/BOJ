package 백준공부;
import java.io.*;
import java.util.*;

public class BOJ2628 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();
			int M = scan.nextInt();
			int n = scan.nextInt();
			//int horcount=0, vercount=0;
			ArrayList<Integer> horizon = new ArrayList<Integer>();
			ArrayList<Integer> vertical = new ArrayList<Integer>();
			ArrayList<Integer> width = new ArrayList<Integer>();
			ArrayList<Integer> height = new ArrayList<Integer>();
			ArrayList<Integer> res = new ArrayList<Integer>();
			horizon.add(0); horizon.add(M);
			vertical.add(0); vertical.add(N);
			for (int i = 0; i<n ; i++) {
				int div = scan.nextInt();
				if (div  == 0) horizon.add(scan.nextInt());
				else vertical.add(scan.nextInt());
			} // 두개의 ArrayList 안에 각각 자르려는 번호를 저장한다 0과 마지막 수도 저
			Collections.sort(horizon);
			Collections.sort(vertical); //sort해
			
			
			for (int i = 0; i<horizon.size()-1;i++) {
				width.add(horizon.get(i+1)-horizon.get(i));
			} 
			for (int i = 0; i<vertical.size()-1;i++) {
				height.add(vertical.get(i+1)-vertical.get(i));
			} 
			Collections.sort(width);
			Collections.sort(height); 
			
			System.out.println(width.get(width.size()-1)*height.get(height.size()-1));
			/*for(Integer i : width) {
			    System.out.println(i);

			}
			*/
			//Collections.reverse(res);
			/*
			for(Integer i : horizon) {
			    System.out.println(i);

			}
			*/
			
			//Collections.reverse(res);
			/*for(Integer i : vertical) {
			    System.out.println(i);

			}
			*/

	}
	
}
