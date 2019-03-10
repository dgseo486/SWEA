package D3;

import java.util.Scanner;

public class Solution5215 { //햄버거 다이어트

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int L = sc.nextInt();
            int[][] ingredient = new int[N][2];
            for(int i = 0; i < N; i++) {
                ingredient[i][0] = sc.nextInt();
                ingredient[i][1] = sc.nextInt();
            }
            
        }
        sc.close();
    }

}
