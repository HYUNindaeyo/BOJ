package 백준공부;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class BOJ21737 {
	public static int result = 0;
	public static int tmp = 0;
	public static ArrayList<String> arrayList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		//System.out.print(N);
		String S = scan.nextLine();
		char[] arrChar = S.toCharArray();
		LinkedList<Character> queue = new LinkedList<Character>();
		char sign = ' ';
		
		//String temp = "";
		int size = 0;
		int count = 0;
		//System.out.print(S);
		for (int i=0;i<arrChar.length;i++) {
			if (arrChar[i]=='S'||arrChar[i]=='M'||arrChar[i]=='U'||arrChar[i]=='P'||arrChar[i]=='C') {
				for (int j=0;j<count;j++) {
					result = result*10 + queue.removeFirst()-'0';
					//System.out.println("result"+ result);
				}
				break;
			}
			else {
				queue.addLast(arrChar[i]);
				count++;
			}
		}
		//System.out.println("result"+ result);
		//temp = "";
		for (int i=count;i<arrChar.length;i++) {
			if  (arrChar[i]=='S'||arrChar[i]=='M'||arrChar[i]=='U'||arrChar[i]=='P'||arrChar[i]=='C') {
				if (sign == ' ') {
					;
				}
				else {
					for (int j=0;j<size;j++) {
						//temp = temp + Character.toString(queue.removeFirst());
						 tmp = tmp*10 + queue.removeFirst()-'0';
					}
					//System.out.printf("temp "+temp);
					//tmp = Integer.parseInt(temp);
					//System.out.printf("%d \n",tmp);
					calculate(sign);
				}
				//temp = "";
				tmp = 0;
				size = 0;
				sign = arrChar[i];
			}
			else {
				queue.addLast(arrChar[i]);
				size ++;
			}
		}
		if (sign=='C') {
			arrayList.add(result+" ");
		}
		if (arrayList.size()==0) {
			System.out.println("NO OUTPUT");
			return ;
		}
		else {
			for (int index = 0; index <arrayList.size(); index++) {
				System.out.print(arrayList.get(index));
			}
		}
		
	}
	public static void calculate(char sign) {
		if (sign =='S') {
			result = result - tmp;
		}
		else if (sign=='M') {
			result = result * tmp;
		}
		else if (sign=='U') {
			result = result / tmp;
		}
		else if (sign=='P') {			
			result = result + tmp;
		}
		else if (sign=='C') {
			//System.out.printf("%d ",result);
			arrayList.add(result+" ");
	}
}

}


/*
 * for (int i=count;i<arrChar.length;i++) {
			//System.out.printf("res %d  tmp %d\n",result,tmp);
			if (arrChar[i]=='S') {
				for (int j=0;j<size;j++) {
					tmp = tmp*10 + queue.removeFirst()-'0';
				}
				System.out.printf("tmp %d\n",tmp);
				result = result - tmp;
				tmp = 0;
				size = 0;
			}
			else if (arrChar[i]=='M') {
				for (int j=0;j<size;j++) {
					tmp = tmp*10 + queue.removeFirst()-'0';
				}
				System.out.printf("tmp %d\n",tmp);
				result = result * tmp;
				tmp = 0;
				size = 0;
			}
			else if (arrChar[i]=='U') {
				for (int j=0;j<size;j++) {
					tmp = tmp*10 + queue.removeFirst()-'0';
				}
				System.out.printf("tmp %d\n",tmp);
				result = result / tmp;
				tmp = 0;
				size = 0;
			}
			else if (arrChar[i]=='P') {
				for (int j=0;j<size;j++) {
					tmp = tmp*10 + queue.removeFirst()-'0';
				}
				System.out.printf("tmp %d\n",tmp);
				result = result + tmp;
				tmp = 0;
				size = 0;
			}
			else if (arrChar[i]=='C') {
				for (int j=0;j<size;j++) {
					tmp = tmp*10 + queue.removeFirst()-'0';
				}
				System.out.printf("tmp %d\n",tmp);
				System.out.printf("%d ",result);
				tmp = 0;
				size = 0;
			}
			else {
				queue.addLast(arrChar[i]);
				size ++;
			}
		}
		
		
		*/
