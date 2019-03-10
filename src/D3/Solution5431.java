package D3;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution5431 { //민석이의 과제 체크하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<boolean[]> result = new ArrayList<>();
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            boolean[] checker = new boolean[N + 1];
            for(int i = 0; i < K; i++) {
                int input = sc.nextInt();
                checker[input] = true;
            }
            result.add(checker);
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.print("#" + (tc + 1) + " ");
            for(int i = 1; i < result.get(tc).length; i++) {
                if(result.get(tc)[i] == false) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }

}
