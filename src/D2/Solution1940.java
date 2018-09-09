package D2;

import java.util.Scanner;

public class Solution1940 { // 가랏! RC카

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] result = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int distance = 0;
            int speed = 0;
            for(int i = 0; i < N; i++) {
                int cmd = sc.nextInt();
                if(cmd == 0) {
                    distance += speed;
                } else if(cmd == 1) {
                    int accel = sc.nextInt();
                    speed += accel;
                    distance += speed;
                } else if(cmd == 2) {
                    int accel = sc.nextInt();
                    speed -= accel;
                    if(speed < 0) {
                        speed = 0;
                    }
                    distance += speed;
                }
            }
            result[tc] = distance;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }

}
