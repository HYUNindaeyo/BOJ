package 백준공부;

import java.util.*;
public class BOJ1464 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int count = S.length();
		char[] arr = S.toCharArray();
		//char[] result = new char[S.length()];
		for (int i=1;i<count;i++ ) {
			if (arr[i]> arr[i-1]) {
				S = arr[i] + S.substring(0,i)+S.substring(i+1,count);
				arr = S.toCharArray();
				//System.out.println(S);
			}
		}
		for (int i = S.length() -1; i>=0; i--) {
	         System.out.print(S.charAt(i));
	      }
	}
	
}

//계산해보니까 어차피 전탐하면 시간초과 남 게다가 시간순 배열 코드가 어차피 char 배열로 ㅅ비교하는 건데 이걸 굳이 다시할필요가 있나,,, 
/*
 * 
 * 	
		for (int i = 2;i<arr.length;i++) {
			for (int j=1;j<=arr.length;j++) {
				if (j-i<0) continue;
				if (arr[j]>arr[j-i]) {
					char tmp = arr[j-1];
					arr[j-i] = arr[i];
					arr[i] = tmp;
				}	
			}
			
		}
		solution(list,1);
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.get(0));

public static ArrayList<String> solution(ArrayList<String> strings, int n) {

Collections.sort(strings, new Comparator<String>() {

    //앞에 값(o1)과 뒤의 값(o2)을 비교해서 리턴값을 양수로 주면 값을 바꿈 -> 오름차순
    //앞에 값(o1)과 뒤의 값(o2)을 비교해서 리턴값을 음수로 주면 값을 바꾸지 않음 -> 내림차순
    @Override
    public int compare(String o1, String o2) {
        if (o1.charAt(n) > o2.charAt(n)) {
            return 1;
        } else if (o1.charAt(n) == o2.charAt(n)) {
            return o1.compareTo(o2);
        } else {
            return -1;
        }
    }
});

return strings;
}
*/
