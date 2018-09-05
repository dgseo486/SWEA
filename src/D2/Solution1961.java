package D2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1961 { //숫자 배열 회전

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<String[][]> result = new ArrayList<>();
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            
            int[][] matrix = new int[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            String[][] rotatedNum = new String[N][N];
            for(int n = 0; n < N; n++) {
                String value = "";
                for(int m = N - 1; m >= 0; m--) {
                    value += String.valueOf(matrix[m][n]);
                }
                rotatedNum[n][0] = value;
            }
            
            int k = 0;
            for(int n = N - 1; n >= 0; n--) {
                String value = "";
                for(int m = N - 1; m >= 0; m--) {
                    value += String.valueOf(matrix[n][m]);
                }
                rotatedNum[k][1] = value;
                k++;
            }
            
            k = 0;
            for(int m = N - 1; m >= 0; m--) {
                String value = "";
                for(int n = 0; n < N; n++) {
                    value += String.valueOf(matrix[n][m]);
                }
                rotatedNum[k][2] = value;
                k++;
            }
            
            result.add(rotatedNum);
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1));
            String[][] temp = result.get(tc);
            for(int i = 0; i < temp.length; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(temp[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }

}
