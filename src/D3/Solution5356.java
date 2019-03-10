package D3;

import java.util.Scanner;

public class Solution5356 { //의석이의 세로로 말해요

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] result = new String[T];
        for(int tc = 0; tc < T; tc++) {
            char[][] word = new char[5][15];
            for(int i = 0; i < 5; i++) {
                String input = sc.next();
                for(int j = 0; j < input.length(); j++) {
                    word[i][j] = input.charAt(j);
                }
            }
            
            String str = "";
            for(int j = 0; j < 15; j++) {
                for(int i = 0; i < 5; i++) {
                    if(word[i][j]!=0 && word[i][j]!='\n') {
                        str += word[i][j];
                    }
                }
            }
            
            result[tc] = str;
            
            /*for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 15; j++) {
                    System.out.print(word[i][j] + " ");
                }
                System.out.println();
            }*/
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }
}
