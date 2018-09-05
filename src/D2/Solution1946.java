package D2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1946 { //간단한 압출 풀기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        ArrayList<String[]> strArrList = new ArrayList<>();
        ArrayList<int[]> intArrList = new ArrayList<>();
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            String[] inputStr = new String[N];
            int[] inputInt = new int[N];
            for(int i = 0; i < N; i++) {
                inputStr[i] = sc.next();
                inputInt[i] = sc.nextInt();
            }
            strArrList.add(inputStr);
            intArrList.add(inputInt);
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1));
            int enterCnt = 0;
            for(int i = 0; i < intArrList.get(tc).length; i++) {
                for(int j = 0; j < intArrList.get(tc)[i]; j++) {
                    if(enterCnt == 10) {
                        System.out.println();
                        enterCnt = 0;
                    }
                    System.out.print(strArrList.get(tc)[i]);
                    enterCnt++;
                }
            }
            System.out.println();
        }
        
        sc.close();
    }

}
