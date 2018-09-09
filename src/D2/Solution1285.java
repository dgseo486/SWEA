package D2;

import java.util.Scanner;

public class Solution1285 { //아름이의 돌 던지기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[][] result = new int[T][2];
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int min = 0;
            int[] loc = new int[N];
            for(int i = 0; i < N; i++) {
                loc[i] = sc.nextInt();
            }
            min = Math.abs(loc[N - 1]);
            
            for(int i = 0; i < N; i++) {
                if(min > Math.abs(loc[i])) {
                    min = Math.abs(loc[i]);
                }
            }
            
            int cnt = 0;
            for(int i = 0; i < N; i++) {
                if(min == Math.abs(loc[i])) {
                    cnt++;
                }
            }
            
            result[tc][0] = min;
            result[tc][1] = cnt;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.print("#" + (tc + 1) + " ");
            for(int i = 0; i < 2; i++) {
                System.out.print(result[tc][i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
