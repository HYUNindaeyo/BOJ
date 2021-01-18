package 백준공부;

import java.util.*;

public class BOJ3896 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean prime[] = new boolean[1299710];
		ArrayList list = new ArrayList<Integer>();
		prime[0] = prime[1] = true;
		for (int i=2;i*i<=1299709;i++) {
			if(!prime[i]) {
				for (int j=i*i;j<=1299709;j=j+i) {
					prime[j] = true;
				}
			}
		}
		for (int i=0;i<=1299709;i++) {
			if (!prime[i]) list.add(i);
		}
		
	/*	for(int i=1; i<=100000; i++) {
        	System.out.println(list.get(i));
        }
	*/	
		int T = scan.nextInt();
		for (int t=0;t<T;t++) {
			int N = scan.nextInt();
			int pin = 0;
			while (true) {
				if ((int)list.get(pin)==N) {
					System.out.println("0");
					break;
				}
				else if ((int)list.get(pin)<N&&N<(int)list.get(pin+1)) {
					System.out.println((int)list.get(pin+1)-(int)list.get(pin));
					break;
				}
				
				pin++;
			}
		}
		
	}

}
