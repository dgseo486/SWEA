package D2;

import java.util.Scanner;

public class Solution1959 { //두 개의 숫자열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] result = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[] arr = new int[N];
            int[] arr2 = new int[M];
            
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < M; i++) {
                arr2[i] = sc.nextInt();
            }
            
            int max = 0;
            if(arr.length > arr2.length) {
                for(int i = 0; i <= arr.length - arr2.length; i++) {
                    int sum = 0;
                    int k = 0;
                    for(int j = i; j < arr2.length + i; j++) {
                        sum += (arr2[k] * arr[j]);
                        k++;
                    }
                    if(max < sum) {
                        max = sum;
                    }
                }
            } else {
                for(int i = 0; i <= arr2.length - arr.length; i++) {
                    int sum = 0;
                    int k = 0;
                    for(int j = i; j < arr.length + i; j++) {
                        sum += (arr[k] * arr2[j]);
                        k++;
                    }
                    if(max < sum) {
                        max = sum;
                    }
                }
            }
            
            result[tc] = max;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }

}
