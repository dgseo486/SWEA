package D1;

import java.util.Scanner;

public class Solution2070 { // 큰 놈, 작은 놈, 같은 놈

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        String[] result = new String[T];
        for(int tc = 0; tc < T; tc++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a > b) {
                result[tc] = ">";
            } else if(a < b) {
                result[tc] = "<";
            } else {
                result[tc] = "=";
            }
        }
        
        for(int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " " + result[i]);
        }
        
        sc.close();
    }

}
