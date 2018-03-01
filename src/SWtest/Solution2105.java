package SWtest;

import java.util.Scanner;

public class Solution2105 {	//디저트 카페

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0; t<T; t++) {
			int N=sc.nextInt();
			int[][] map=new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j]=sc.nextInt();
				}
			}
			
		}
		
		sc.close();
	}

}
