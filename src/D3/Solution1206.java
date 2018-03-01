package D3;

import java.util.Scanner;

public class Solution1206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=10;
		int result[]=new int[T];
		for(int tc=0; tc<T; tc++) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0; i<N; i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i=2; i<N-2; i++) {
				int arr2[]= {(arr[i]-arr[i-2]), (arr[i]-arr[i-1]), (arr[i]-arr[i+1]), (arr[i]-arr[i+2])};
				if((arr[i]-arr[i-2])>0 && (arr[i]-arr[i-1])>0 && (arr[i]-arr[i+1])>0 && (arr[i]-arr[i+2])>0) {
					int min=arr2[0];
					for(int j=0; j<4; j++) {
						if(min>arr2[j]) {
							min=arr2[j];
						}
					}
					result[tc]=result[tc]+min;
				}
			}
			
		}
		
		for(int i=0; i<T; i++) {
			System.out.println("#"+(i+1)+" "+result[i]);
		}
		
	}

}
