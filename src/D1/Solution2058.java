package D1;

import java.util.Scanner;

public class Solution2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        int total = 0;
        for(int i = 0; i < input.length(); i++) {
            total += input.charAt(i) - '0';
        }
        System.out.println(total);
    }
}
