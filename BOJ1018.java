package 백준공부;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ1018 {
	static int map0[][];
	static int map1[][];
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M =  scan.nextInt();
		map0 = new int[N][M];
		map1 = new int[N][M];
		scan.nextLine();
		for (int i=0;i<N;i++) {
			char[] str =scan.nextLine().toCharArray();
			//System.out.print(str.length);
			/*for (int j = 0;j<str.length;j++) {
				System.out.print(str[j]);
			}
			System.out.println();
            */
            for(int j=0;j<str.length;j++) {
            	if((i+j)%2==0&&str[j]=='B')		map1[i][j]=1;
            	else if((i+j)%2==0&&str[j]=='W') map0[i][j] = 1;
            	else if ((i+j)%2==1&&str[j]=='B')  map0[i][j] = 1;
            	else map1[i][j]=1;
   
            } 
		}
		for (int i=0;i<N-7;i++) {
			for (int j=0;j<M-7;j++) {
				search(i,j);
			//	System.out.println("여기 실행   ,, ");
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		
		/*for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				System.out.print(map0[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				System.out.print(map1[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}
	public static void search(int x,int y) {
		int count0=0;
		int count1 = 0;
		for(int i=x;i<x+8;i++) {
			for (int j=y;j<y+8;j++) {
				if(map0[i][j]==1) count0++;
				if(map1[i][j]==1) count1++;
			}
		}
		//System.out.printf("%d %d\n",count0,count1);
		list.add(count0);
		list.add(count1);
	}

}
