package 백준공부;

import java.io.*;
import java.util.*;

public class BOJ1946 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); 
		int T = scan.nextInt();
		
        //int[] Grade2 = new int[N+1]; 
        //int[] tmp = new int[N+1]; 
        
        for (int t = 0; t < T; t++ ) {
        	int count = 0;
        	int N = scan.nextInt();
            int[] Grade1 = new int[100001]; 

            for (int i = 1; i<=N;i++) {
            	Grade1[scan.nextInt()] = scan.nextInt();
                
            }
          
            int first = Grade1[1];
            for (int i = 1; i<=N;i++) {
            	if (Grade1[i]<=first) {
            		first = Grade1[i];
            		count++;
            	}
            	 //System.out.println(count);
            }
            System.out.println(count);
         /*  Deque<Integer> dq = new ArrayDeque<>();
            for(int i = 0; i<Grade1.length;i++) {
            	while(!dq.isEmpty() && dq.getLast() < Grade1[i]) {
            		dq.removeLast();
            	}
            	//아 이거getLast도 틀렸군.. 망했다 
            	//위에 전체랑 비교해야 될거 같은
            	
            	dq.addLast(Grade1[i]);
            }

            StringBuilder ans = new StringBuilder();
            // 위 for문에서 K가 0이 되기 전에 끝난 경우를 대비하여
            // dq.size() - K만큼만 출력한다.
            for (int i = 0; i< dq.size();i++) {
                ans.append(dq.removeFirst());
            }
     */
          
           
           //for (int i = 1 ; i<=N ; i++) {
        	  // System.out.printf("Grade[%d]는 %d\n",i,Grade1[i]);
           //}
        }
	}

}