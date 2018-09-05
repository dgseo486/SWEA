package D1;

import java.util.Scanner;

public class Solution2050 { //  알파벳을 숫자로 변환

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++) {
            System.out.print((int)input.charAt(i) - 64 + " ");
        }
        sc.close();
    }

}
