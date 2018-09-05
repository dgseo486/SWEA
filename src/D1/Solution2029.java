package D1;

import java.util.Scanner;

public class Solution2029 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] quotient = new int[T];
        int[] remainder = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            quotient[tc] = a / b;
            remainder[tc] = a % b;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + quotient[tc] + " " + remainder[tc]);
        }
        
        sc.close();
    }

}
