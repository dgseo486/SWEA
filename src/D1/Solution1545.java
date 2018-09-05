package D1;

import java.util.Scanner;

public class Solution1545 { // 거꾸로 출력해 보아요

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = N; i >= 0; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
