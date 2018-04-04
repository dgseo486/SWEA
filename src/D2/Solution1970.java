package D2;

import java.util.Scanner;

public class Solution1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int buffer[]=new int[T];
		for(int tc=0; tc<T; tc++) {
			buffer[tc]=sc.nextInt();
		}
		for(int i=0; i<T; i++) {
			int fiftyThousand=buffer[i]/50000;
			buffer[i]=buffer[i]-(50000*fiftyThousand);
			
			int tenThousand=buffer[i]/10000;
			buffer[i]=buffer[i]-(10000*tenThousand);
			
			int fiveThousand=buffer[i]/5000;
			buffer[i]=buffer[i]-(5000*fiveThousand);
			
			int oneThousand=buffer[i]/1000;
			buffer[i]=buffer[i]-(1000*oneThousand);
			
			int fiveHundred=buffer[i]/500;
			buffer[i]=buffer[i]-(500*fiveHundred);
			
			int oneHundred=buffer[i]/100;
			buffer[i]=buffer[i]-(100*oneHundred);
			
			int fifty=buffer[i]/50;
			buffer[i]=buffer[i]-(50*fifty);
			
			int ten=buffer[i]/10;
			buffer[i]=buffer[i]-(10*ten);
			
			System.out.println("#"+(i+1));
			System.out.println(fiftyThousand+" "+tenThousand+" "+fiveThousand+" "+oneThousand+" "+fiveHundred+" "+oneHundred+" "+fifty+" "+ten);
		}
	}
}