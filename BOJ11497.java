package 백준공부;
import java.util.*;

public class BOJ11497 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcase;
		int count;
		
		Scanner scan = new Scanner(System.in); 
		testcase = scan.nextInt();
		for (int t = 0; t<testcase;t++) {
			ArrayList<Integer> num = new ArrayList<Integer>();
			ArrayList<Integer> ret = new ArrayList<Integer>();
			count = scan.nextInt();
			for (int j = 0; j<count;j++) {
				num.add(scan.nextInt());
			}
			Collections.sort(num);
			
			/*for(Integer i : num) {
			    System.out.print(i+"	");

			}
			System.out.println();
			*/
			for (int i = 0; i<num.size()-2;i++) {
				ret.add((int) Math.floor(num.get(i+2)-num.get(i)));
			}
			
			ret.add((int) Math.floor(num.get(num.size()-1)-num.get(num.size()-2)));
			
			/*for (int i = 1; i<num.size()-3;i=i+2) {
				ret.add(num.get(i+2)-num.get(i));
			}
			*/
			Collections.sort(ret);
			
			/*for(Integer i : ret) {
			    System.out.print(i+"	");

			}
			*/
			//System.out.println();
			System.out.println(ret.get(ret.size()-1));
		}		
		}

}
