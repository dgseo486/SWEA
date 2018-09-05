package D1;

import java.util.Scanner;

public class Solution2056 { //연월일 달력

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        String[] input = new String[T];
        for(int i = 0; i < T; i++) {
            input[i] = sc.next();
        }
        
        String[] result = new String[T];
        for(int tc = 0; tc < T; tc++) {
            String year = "";
            String month = "";
            String date = "";
            for(int i = 0; i < 4; i++) {
                year += input[tc].charAt(i);
            }
            for(int i = 4; i < 6; i++) {
                month += input[tc].charAt(i);
            }
            for(int i = 6; i < 8; i++) {
                date += input[tc].charAt(i);
            }
            
            int[] calendar = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            boolean flag = true;
            if(Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
                flag = false;
            }
            
            if(Integer.parseInt(date) < 1 || Integer.parseInt(date) > calendar[Integer.parseInt(month)]) {
                flag = false;
            }
            
            if(flag == false) {
                result[tc] = "-1";
            } else {
                result[tc] = year + "/" + month + "/" + date;
            }
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        sc.close();
    }

}
