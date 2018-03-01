package D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=10;
		int result[]=new int[T];
		for(int tc=0; tc<T; tc++) {
			int dump=sc.nextInt();
			int box[]=new int[100];
			for(int i=0; i<100; i++) {
				box[i]=sc.nextInt();
			}
			for(int i=0; i<dump; i++) {
				Arrays.sort(box);
				box[box.length-1]=box[box.length-1]-1;
				box[0]=box[0]+1;
			}
			Arrays.sort(box);
			result[tc]=box[box.length-1]-box[0];
		}
		
		for(int i=0; i<T; i++) {
			System.out.println("#"+(i+1)+" "+result[i]);
		}
	}
}