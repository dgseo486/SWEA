package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1983 { // 조교의 성적 매기기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        String[] result = new String[T];
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            float[] total = new float[N];
            for(int i = 0; i < N; i++) {
                float middleTest = sc.nextFloat();
                float finalTest = sc.nextFloat();
                float homework = sc.nextFloat();
                total[i] += ((middleTest * 0.35) + (finalTest * 0.45) + (homework * 0.2));
            }
            
            int cnt = 0;
            for(int i = 0; i < N; i++) {
                if((total[i] > total[K - 1]) && (i != K - 1)) {
                    cnt++;
                }
            }
            
            result[tc] = grade[cnt / (N / 10)];
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }
    

}