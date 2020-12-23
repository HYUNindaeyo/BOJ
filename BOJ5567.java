package 백준공부;

import java.io.*;
import java.util.*;

public class BOJ5567{
	private static int N;
	private static int M;
	private static int[][] array;
	private static boolean[] invite;
	private static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		N = scan.nextInt();
		M = scan.nextInt();
		array = new int[N+1][N+1];
		invite = new boolean[N+1];
		int result = 0;
		for (int i = 0; i < M ; i++ ) { 
			int friendA =  scan.nextInt();
			int friendB =  scan.nextInt();
			
			array[friendA][friendB] = 1;
			array[friendB][friendA] = 1;
			if (friendA==1) invite[friendB] = true;
		}
		array[1][1] = 1;
		dfs(1,count);
		for (int i = 2;i<N+1;i++) {
			if (invite[i]) {
				//System.out.print(i+"	");
				result++;
			}
		}
		System.out.print(result);
	}
	
	static void dfs(int x,int count) {
	
		for (int i=2;i<N+1;i++) {
			if(array[x][i]==1) {
				if (count < 2) {invite[i] = true;}
				else return;
				count++;
				System.out.println("dfs 실행"+x+"줄 진");
				dfs(i,count);
				System.out.println("dfs 탈"+x+"줄 진");
				count--;
			}
		}
	}
}
//hashset으로 구하려다
//아 이러면 안 되네

//Set hashSet=new HashSet();
		//hashSet.add(1);
		//for (int i = 0; i < M ; i++ ) { 
			//int friendA =  scan.nextInt();
			//int friendB =  scan.nextInt();
			
			//if (hashSet.contains(friendA)) {hashSet.add(friendB);}
		//}
		

//해쉬셋 살리고 바꾸려다 진짜 드러워질 것 같아서 ㅌ

//해쉬셋 살려서 할 수 있지만 시간있으면 해볼게염 ㅎ
	

/*for (int i = 2; i <= N ; i++ ) { 
	if (array[1][i]==1&&!invite[i]) {
		count++;
		invite[i]=true;
	}
	for (int j = 2; j < N + 1 ; j++) {
		if (array[i][j]==1&&!invite[i]) {
			count++;
			invite[j] = true;
		}
	}
	
}
}*/