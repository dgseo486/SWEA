package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1204 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		for(int t=0; t<10; t++) {
			int score[]=new int[101];
			Arrays.fill(score, 0);
			sc.nextInt();
			for(int i=1; i<=1000; i++){
				num=sc.nextInt();
				score[num]++;
			}
			int max=0;
			for(int k=0; k<101; k++) {
				if(score[max]<=score[k]) {
					max=k;
				}
			}
			System.out.println("#"+(t+1)+" "+max);
		}
	}
}