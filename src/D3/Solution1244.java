package D3;

import java.util.Scanner;

public class Solution1244 {
	
	static boolean[][] check;
	static int ans, cnt;
	
	static void dfs(String s, int depth) {
		check[depth][Integer.parseInt(s)]=true;
		
		if(depth==cnt) {
			ans=Math.max(ans, Integer.parseInt(s));
			return;
		}
		
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<s.length(); j++) {
				String tmp=s.substring(0, i)+s.charAt(j)+s.substring(i+1, j)+s.charAt(i)+s.substring(j+1, s.length());
				if(check[depth+1][Integer.parseInt(tmp)]!=true) {
					dfs(tmp, depth+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		
		for(int t=0; t<tc; t++) {	
			String str=sc.next();
			cnt=sc.nextInt();
			ans=Integer.parseInt(str);
			check=new boolean[cnt+1][1000000];
			dfs(str, 0);
			System.out.println("#"+(t+1)+" "+ans);
		}
		sc.close();
	}

}
