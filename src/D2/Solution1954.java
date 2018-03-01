package D2;

import java.util.Scanner;

public class Solution1954 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int N[]=new int[T];
		for(int tc=0; tc<T; tc++) {
			N[tc]=sc.nextInt();
		}
		for(int n=0; n<T; n++) {
			int num=1;
			int x=0;
			int y=-1;
			int dir=1;
			int nValue=N[n];
			int arr[][]=new int[nValue][nValue];
			
			for(int i=0; i<nValue; i++) {
				for(int j=0; j<nValue-i; j++) {
					y=y+dir;
					arr[x][y]=num;
					num++;
				}
				for(int k=0; k<nValue-i-1; k++) {
					x=x+dir;
					arr[x][y]=num;
					num++;
				}
				dir=dir*(-1);
			}
			
			System.out.println("#"+(n+1));
			for(int i=0; i<nValue; i++) {
				for(int j=0; j<nValue; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}