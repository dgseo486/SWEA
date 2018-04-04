package D2;

import java.util.Scanner;

public class Solution1926 {

    public static void main(String[] args) { // 간단한 369게임
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                if (temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9) {
                    cnt++;
                }
                temp = temp / 10;
            }

            if (cnt == 0) {
                System.out.print(i + " ");
                cnt = 0;
            } else {
                for (int j = 1; j <= cnt; j++) {
                    System.out.print("-");
                }
                System.out.print(" ");
                cnt = 0;
            }

        }
        sc.close();
    }
}