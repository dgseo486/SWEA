package D2;

import java.util.Scanner;

public class Solution1859 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();

		for(int i=0; i<T; i++) {
			int N=sc.nextInt();
			int cost[] = new int[N];
			
			for(int j=0; j<N; j++) {
				cost[j]=sc.nextInt();
			}
			
			long profit=0;
			int max=cost[N-1];

			for(int k=N-2; k>=0; k--){
                if(max > cost[k]) {
                    profit = profit + (max-cost[k]);
                }
                else {
                    max = cost[k];
                }
            } 
            System.out.println("#"+(i+1)+" "+profit);
		}
	}
}
