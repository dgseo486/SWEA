package D2;

import java.util.Scanner;

public class Solution1284 { //수도 요금 경쟁

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] result = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();
            
            int A = P * W;
            int B = 0;
            if(W - R > 0) {
                B = Q + ((W - R) * S);
            } else {
                B = Q;
            }
            
            if(A > B) {
                result[tc] = B;
            } else {
                result[tc] = A;
            }
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }

}
