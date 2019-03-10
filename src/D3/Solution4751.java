package D3;

import java.util.Scanner;

public class Solution4751 { //다솔이의 다이아몬드 장식

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 0; tc < T; tc++) {
            String[][] decorated = new String[5][5];
            String str = sc.nextLine();
            
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5; j++) {
                    decorated[i][j] = ".";
                }
            }
            
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5; j++) {
                    System.out.print(decorated[i][j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }

}
