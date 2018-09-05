package D1;

import java.util.Scanner;

public class Solution2043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();
        
        int temp = K;
        int count = 1;
        while(temp != P) {
            count++;
            temp++;
        }
        System.out.println(count);
        sc.close();
    }

}
