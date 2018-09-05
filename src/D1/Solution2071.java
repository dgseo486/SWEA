package D1;

import java.util.Scanner;

public class Solution2071 { // 평균값 구하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int tc = 0; tc < T; tc++) {
            double total = 0;
            for(int i = 0; i < 10; i++) {
                total += sc.nextInt();
            }
            double avg = total / 10;
            System.out.printf("#%d %d\n", tc + 1, Math.round(avg));
        }
        
        sc.close();
    }

}
