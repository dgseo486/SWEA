package D2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution1966 { //숫자를 정렬하자

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<int[]> result = new ArrayList<>();
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int[] input = new int[N];
            for(int i = 0; i < N; i++) {
                input[i] = sc.nextInt();
            }
            Arrays.sort(input);
            result.add(input);
        }
        
        for(int i = 0; i < T; i++) {
            System.out.print("#" + (i + 1) + " ");
            for(int j = 0; j < result.get(i).length; j++) {
                System.out.print(result.get(i)[j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }

}
