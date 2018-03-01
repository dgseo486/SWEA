package D2;

import java.util.Scanner;

public class Solution2007 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		for(int i=1; i<=test_case; i++) {

			String str=sc.next();
			int index=0;
			for(int j=1; j<=str.length(); j++) {
				String s=str.substring(0, j);
				if(s.equals(str.substring(j, j*2))){
					index=j;
					break;
				}
			}
			System.out.println("#"+i+" "+index);
		}
	}
}
