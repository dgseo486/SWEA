package D2;

import java.util.Scanner;

public class Solution1979 { //어디에 단어가 들어갈 수 있을까

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] result = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] puzzle = new int[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    puzzle[i][j] = sc.nextInt();
                }
            }
            
            int num = 0;
            
            for(int i = 0; i < N; i++) {
                int cnt = 0;
                for(int j = 0; j < N; j++) {
                    if(puzzle[i][j] == 1) {
                        cnt++;
                    } else {
                        if(cnt == K) {
                            num++;
                        }
                        cnt = 0;
                    }
                    if(j == N - 1) {
                        if(cnt == K) {
                            num++;
                        }
                    }
                }
            }
            
            for(int j = 0; j < N; j++) {
                int cnt = 0;
                for(int i = 0; i < N; i++) {
                    if(puzzle[i][j] == 1) {
                        cnt++;
                    } else {
                        if(cnt == K) {
                            num++;
                        }
                        cnt = 0;
                    }
                    if(i == N - 1) {
                        if(cnt == K) {
                            num++;
                        }
                    }
                }
            }
            
            result[tc] = num;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }

}
