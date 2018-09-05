package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1989 { // 초심자의 회문 검사

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] result = new int[T];
        Arrays.fill(result, 1);
        for(int tc = 0; tc < T; tc++) {
            String word = sc.next();
            int opposite = word.length() - 1;
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) != word.charAt(opposite)) {
                    result[tc] = 0;
                    break;
                }
                opposite--;
                if(i == opposite) {
                    break;
                }
            }
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }

}
