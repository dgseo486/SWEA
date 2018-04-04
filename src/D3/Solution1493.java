package D3;

import java.util.Scanner;

public class Solution1493 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=400;
		int[][] matrix=new int[N+1][N+1];

		int tc=sc.nextInt();
		int[] result=new int[tc];
		for(int t=0; t<tc; t++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			
			int x1=0, y1=0;
			int x2=0, y2=0;
			
			for(int i=1; i<=N; i++) {
				matrix[i][0]=i;
				matrix[i][1]=matrix[i-1][1]+matrix[i][0];
				int a=i;
				for(int j=2; j<=N; j++) {
					matrix[i][j]=matrix[i][j-1]+a;
					a++;
				}
			}
			
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					
					if(matrix[i][j]==p) {
						x1=i;
						y1=j;
					}
					
					if(matrix[i][j]==q) {
						x2=i;
						y2=j;
					}
				}
			}
			
			result[t]=matrix[x1+x2][y1+y2];
			
		}

		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+result[i]);
		}
		
		
	}

}