package D2;

import java.util.Scanner;

public class Solution1986 { // 지그재그 숫자

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] result = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            
            for(int i = 1; i <= N; i++) {
                if(i % 2 == 0) {
                    result[tc] -= i;
                } else {
                    result[tc] += i;
                }
            }
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }

}
