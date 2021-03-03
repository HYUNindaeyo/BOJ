package 백준공부;

import java.util.Scanner;

public class BOJ5212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int C = scan.nextInt();
		String Map[][] = new String[12][12];
		String result[][] = new String[12][12];
		for (int i=1;i<R+1;i++) {
			String tmp = scan.next();
			for (int j=1;j<C+1;j++) {
				Map[i][j] = String.valueOf(tmp.charAt(j-1));
				result[i][j] = String.valueOf(tmp.charAt(j-1));
			}
		}
		for (int i=0;i<=R+1;i++) {
			for (int j=0;j<=C+1;j++) {
				if (i==0||i==R+1) {
					Map[i][j] =".";
					result[i][j] = ".";
				}
				if (j==0||j==C+1) {
					Map[i][j] =".";
					result[i][j] = ".";
				}
			}
		}
		
	/*
		for (int i=0;i<=R+1;i++) {
			for (int j=0;j<=C+1;j++) {
				System.out.printf("%s ",Map[i][j]);
			}
			System.out.println();
		}
	*/	
	
		
		for (int i=1;i<=R;i++) {
			for (int j=1;j<=C;j++) {
				int count = 0;
				//System.out.println(count);
				if (Map[i][j].equals(".")) continue;
				if(Map[i-1][j].equals(".")) count++;
				//System.out.println(count);
				if(Map[i+1][j].equals(".")) count++;
				//System.out.println(count);
				if(Map[i][j-1].equals(".")) count++;
				//System.out.println(count);
				if(Map[i][j+1].equals(".")) count++;
				//System.out.println(count);
				if (count>=3) result[i][j] = ".";
			}
		}
	/*
		
		for (int i=0;i<=R+1;i++) {
			for (int j=0;j<=C+1;j++) {
				System.out.printf("%s ",result[i][j]);
			}
			System.out.println();
		}
		*/
		int minX = 11, maxX = 0, minY = 11, maxY = 0;
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				if (result[i][j].equals("X")){
					maxX = Math.max(maxX, j);
					maxY = Math.max(maxY, i);
					minX = Math.min(minX, j);
					minY = Math.min(minY, i);
				}
			}
		}
		
		for (int i = minY; i <= maxY; i++) {
			for (int j=minX;j<=maxX;j++) {
				System.out.printf("%s ",result[i][j]);
			}
			System.out.println();
		}
	}

}