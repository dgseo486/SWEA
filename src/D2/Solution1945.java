package D2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1945 { //간단한 소인수분해

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {2, 3, 5, 7, 11};
        ArrayList<int[]> result = new ArrayList<>();
        int T = sc.nextInt();
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int[] count = new int[5];
            for(int i = 0; i < 5; i++) {
                while(N % num[i] == 0) {
                    count[i]++;
                    N /= num[i];
                }
            }
            result.add(count);
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.print("#" + (tc + 1) + " ");
            for(int i = 0; i < 5; i++) {
                System.out.print(result.get(tc)[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
