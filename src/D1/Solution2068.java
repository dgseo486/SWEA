package D1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2068 { // 최대수 구하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] maxValue = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int[] input = new int[10];
            for(int i = 0; i < 10; i++) {
                input[i] = sc.nextInt();
            }
            Arrays.sort(input);
            maxValue[tc] = input[9];
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + maxValue[tc]);
        }
        
        sc.close();
    }

}
