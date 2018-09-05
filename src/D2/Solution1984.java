package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1984 { // 중간 평균값 구하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] avg = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int[] input = new int[10];
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                input[i] = sc.nextInt();
            }
            Arrays.sort(input);
            for(int j = 1; j < 9; j++) {
                sum += input[j];
            }
            avg[tc] = (int) Math.round(sum / 8.0);
        }
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + avg[tc]);
        }
        
        sc.close();
    }

}
