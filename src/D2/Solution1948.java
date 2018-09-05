package D2;

import java.util.Scanner;

public class Solution1948 { //날짜 계산기

    public static void main(String[] args) {
        int[] calendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] answer = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int month = sc.nextInt();
            int date = sc.nextInt();
            int month2 = sc.nextInt();
            int date2 = sc.nextInt();
            
            int ans = 0;
            if(month == month2) {
                ans = date2 - date + 1;
            } else {
                ans -= date;
                while(month != month2) {
                    for(int i = 0; i < calendar[month - 1]; i++) {
                        ans++;
                    }
                    month++;
                }
                ans += date2 + 1;
            }
            answer[tc] = ans;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + answer[tc]);
        }
        
        sc.close();
    }

}
