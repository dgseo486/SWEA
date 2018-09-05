package D1;

import java.util.Scanner;

public class Solution1933 { // 간단한 N의 약수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++ ) {
            if(N % i == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

}
