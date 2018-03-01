package D2;

import java.util.Scanner;

public class Solution2005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int N[]=new int[T];
		for(int i=0; i<T; i++) {
			N[i]=sc.nextInt();
		}
		for(int i=0; i<T; i++) {
			System.out.println("#"+(i+1));
			int index=N[i];
			
			int arr[][]=new int[index][index];

			for(int j=0; j<index; j++) {
				arr[j][0]=1;
				for(int k=0; k<j+1; k++) {
					if(index==1) {
						arr[j][k]=1;
					}else {
						if(k==j) {
							arr[j][k]=1;
						}else if(k>0 && k<j){
							arr[j][k]=arr[j-1][k-1]+arr[j-1][k];
						}
					}
					System.out.print(arr[j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}