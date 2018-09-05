package D2;

import java.util.Scanner;

public class Solution1976 { //시각 덧셈

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] resHour = new int[T];
        int[] resMin = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int hour = sc.nextInt();
            int min = sc.nextInt();
            int hour2 = sc.nextInt();
            int min2 = sc.nextInt();
            
            int sumHour = 0;
            int sumMin = 0;
            
            sumMin = min + min2;
            if(sumMin > 60) {
                sumMin -= 60;
                sumHour++;
            }
            
            sumHour += (hour + hour2);
            if(sumHour > 12) {
                sumHour -= 12;
            }
            
            resHour[tc] = sumHour;
            resMin[tc] = sumMin;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + resHour[tc] + " " + resMin[tc]);
        }
        
        sc.close();
    }

}
