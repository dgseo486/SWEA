package D2;

import java.util.Scanner;

public class Solution2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int result[]=new int[T];
		for(int tc=0; tc<T; tc++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			int arr[][]=new int[N][N];
			for(int n=0; n<N; n++) {
				for(int m=0; m<N; m++) {
					arr[n][m]=sc.nextInt();
				}
			}
			int max=0;
			for(int i=0;i<N-M+1;i++) {
				for(int j=0;j<N-M+1;j++) {
					int temp=0;
					for(int k=0;k<M;k++) {
						for(int l=0;l<M;l++) {
							temp=temp+arr[i+k][j+l];
						}
					}
					if(max<temp) { max=temp; }
				}
			}
			result[tc]=max;
		}
		for(int l=0; l<T; l++) {
			System.out.println("#"+(l+1)+" "+result[l]);
		}
	}
}