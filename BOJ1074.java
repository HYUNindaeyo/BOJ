package 백준공부;
import java.util.Scanner;
public class BOJ1074 {
	static int N,r,c,result=0;
	static int num[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		r = scan.nextInt();
		c = scan.nextInt();
		
		search(0,0,(int)Math.pow(2, N));
	}
	public static void search(int x, int y,int len) {
		if(x==r && y==c){
			System.out.println(result);
			return ;
	    }
	    if(len==1){
	        result++;
	        return ;
	    }
	    if(!(x<=r && r<x+len && y<=c && c<y+len)){
	        result += len*len;
	        return ;

	    }
	    search(x,y,len/2);
	    search(x,y+len/2,len/2);
	    search(x+len/2,y,len/2);
	    search(x+len/2,y+len/2,len/2);

	}
}

//재귀로 푸는 문제 
//4개로 쪼개고ㅇ 어느 위치에 있어야 하는 지를 찾는 방식
//x=r y=c로 원하는 위치를 딱 찾았으면return 
//len==1은 드디어 특정 마지막 칸에 도달하기 바로 전단계라는 뜻으로 ++
//그 외에는 찾아 나가는 과정으로 네군데 모두를 서치...
//쉽긴한데은근히 생각할 게 많은 거 같음 
//공부 하기 시러서 그냥 아이디어만 내고 코드는 참고 함 
//https://simsimjae.tistory.com/191 여기 코드 
