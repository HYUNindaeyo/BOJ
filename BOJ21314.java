package 백준공부;
import java.util.*;
public class BOJ21314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String inputtmp = input;
		String result = "", result2 = "";
		while (true) { //k를 기준으로 자르게 되면 최대한 큰 값이 나온다 
			int idx = input.indexOf("K");
			if (idx==-1) {
				for (int i=0;i<input.length();i++) {
					result = result.concat("1");
					//System.out.print(1);
				}
				break;
			}
			String tmp = input.substring(0,idx+1);
			//System.out.println(tmp);
			if (tmp.substring(tmp.length()-1).equals("K")) {
				result = result.concat(""+5*(int)Math.pow(10,tmp.length()-1)+"");
				//System.out.print(5*(int)Math.pow(10,tmp.length()-1));
			}
			else {
				result = result.concat(""+(int)Math.pow(10,tmp.length()-1)+"");
				//System.out.print((int)Math.pow(10,tmp.length()-1));
			
			}
			input = input.substring(idx+1);
			if(input.equals("")) break;
			//System.out.println(input);
		}
		//System.out.println();
		input = inputtmp;
		while (true) { //k를 다 따로 자르게 되면 최대한 작 값이 나온다 
			int idx = input.indexOf("K");
			if (idx==-1){
				result2 = result2.concat(""+(int)Math.pow(10,input.length()-1)+"");
				//System.out.print((int)Math.pow(10,input.length()-1));
				break;
			}
			String tmp = input.substring(0,idx);
			//System.out.println("tmp "+tmp);
			if (!tmp.equals(""))	{
				result2 = result2.concat(""+(int)Math.pow(10,tmp.length()-1)+"");
				//System.out.print((int)Math.pow(10,tmp.length()-1));
			}
			String K = input.substring(idx,idx+1);
			//System.out.println("K "+K);
			result2 = result2.concat("5");
			input = input.substring(idx+1);
			if(input.equals("")) break;
			//System.out.println(input);
		}
		System.out.println(result);
		System.out.println(result2);
	}
}
