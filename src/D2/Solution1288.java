package D2;

import java.util.Scanner;

public class Solution1288 { //새로운 불면증 치료법
    
    static boolean isTrue(boolean[] arr) {
        for(int i = 0; i < 10; i++) {
            if(!arr[i]) {
                 return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] result = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int sheep = N;
            boolean[] check = new boolean[10];
            boolean flag = true;
            while(flag) {
                String temp = String.valueOf(sheep);
                for(int i = 0; i < temp.length(); i++) {
                    check[temp.charAt(i) - '0'] = true;
                }
                if(isTrue(check)) {
                    break;
                }
                sheep += N;
            }
            
            result[tc] = sheep;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }

}
