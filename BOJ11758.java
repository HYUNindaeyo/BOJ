package 백준공부;

import java.util.Scanner;

public class BOJ11758 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();
		int result = ((x1*y2) + (x2*y3) + (x3 * y1)) - ((y1*x2) + (y2*x3) + (y3*x1));
        if(result < 0)
        	System.out.println("-1");
        else if(result > 0)
        	System.out.println("1");
        else
        	System.out.println("0");

	}
	// public static int ccw() {
	        //CCW 공식 (x1y2+x2y3+x3y1)−(y1x2+y2x3+y3x1)
	        // CCW는 점 A,B,C를 순서대로 봤을때 반시계방향으로 놓여 있으면 양수를, 시계방향이면 음수를, 평행하게 놓여있으면 0을 반환하게 됩니다.
	        
	//    }
}
//밑에는 내가 풀던 코드, 실패함. 이건 전형적인 ccw란 알고리즘으로 풀어야 하는 문제였음. 

/*
if(x2==x1) {
if (y1>y2) {
	if(x1>x3) System.out.println("-1");
	else if(x1<x3) System.out.println("1");
    else System.out.println("0");
}
else {
	if(x1>x3) System.out.println("1");
	else if(x1<x3) System.out.println("-1");
    else System.out.println("0");
}
}
else {
double slope1 = (y2-y1)/(x2-x1);
double check = (slope1*x3)+y1-(slope1*x1);
if (x2==x3) {
if (y2>y3) {
	if(x1>x3) System.out.println("1");
	else if(x1<x3) System.out.println("-1");
    else System.out.println("0");
}
else {
	if(x1>x3) System.out.println("-1");
	else if(x1<x3) System.out.println("1");
    else System.out.println("0");
}
}
else if(check==y3) System.out.println("0");
else if (x2<x1&&check>y3) System.out.println("1");
else if (x2>x1&&check>y3) System.out.println("-1"); //1
else if (x2<x1&&check<y3) System.out.println("-1");
else if (x2>x1&&check<y3) System.out.println("1"); //3
}
*/