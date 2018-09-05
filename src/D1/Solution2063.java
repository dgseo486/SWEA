package D1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2063 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] input = new int[N];
        for(int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(input);
        System.out.println(input[N / 2]);
    }

}
