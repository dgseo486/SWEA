package SWtest;

import java.util.Scanner;

public class Solution2382 {
    public static void main(String[] args) { // 미생물 격리
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 0; t < tc; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            
            int[][][] map = new int[N][N][2];
            int[][][] nextMap = new int[N][N][2];
            for(int k = 0; k < K; k++) {
                int I = sc.nextInt();
                int J = sc.nextInt();
                int num = sc.nextInt();
                int mov = sc.nextInt();
                
                map[I][J][0] = num;
                map[I][J][1] = mov;
            }
            
            System.out.println();
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    System.out.printf("%d(%d)  ", map[i][j][0], map[i][j][1]);
                }
                System.out.println();
            }

            for(int m = 0; m < M; m++) {
                for(int i = 0; i < N; i++) {
                    for(int j = 0; j < N; j++) {
                        if(map[i][j][1] == 1) {
                            if(map[i][j][0] > map[i - 1][j][0]) {
                                if((i - 1) == 0) {
                                    nextMap[i - 1][j][1] = 2;
                                } else {
                                    nextMap[i - 1][j][1] = map[i][j][1]; 
                                }
                            }
                            nextMap[i - 1][j][0] += map[i][j][0];
                            map[i][j][0] = 0;
                        } else if(map[i][j][1] == 2) {
                            if(map[i][j][0] > map[i + 1][j][0]) {
                                if((i + 1) == N - 1) {
                                    nextMap[i + 1][j][1] = 1;
                                } else {
                                    nextMap[i + 1][j][1] = map[i][j][1]; 
                                }
                            }
                            nextMap[i + 1][j][0] += map[i][j][0];
                        } else if(map[i][j][1] == 3) {
                            if(map[i][j][0] > map[i][j - 1][0]) {
                                if((j - 1) == 0) {
                                    nextMap[i][j - 1][1] = 4;
                                } else {
                                    nextMap[i][j - 1][1] = map[i][j][1]; 
                                }
                            }
                            nextMap[i][j - 1][0] += map[i][j][0];
                            map[i][j][0] = 0;
                        } else if(map[i][j][1] == 4) {
                            if(map[i][j][0] > map[i][j + 1][0]) {
                                if((j + 1) == N - 1) {
                                    nextMap[i][j + 1][1] = 3;
                                } else {
                                    nextMap[i][j + 1][1] = map[i][j][1]; 
                                }
                            }
                            nextMap[i][j + 1][0] += map[i][j][0];
                            map[i][j][0] = 0;
                        }
                        
                    }
                }
                
                // 약품이 칠해진 셀에서 미생물
                for(int i = 0; i < N; i++) {
                    nextMap[i][0][0] = nextMap[i][0][0] / 2;
                    nextMap[i][N-1][0] = nextMap[i][N-1][0] / 2;
                }
                for(int j = 0; j < N; j++) {
                    nextMap[0][j][0] = nextMap[0][j][0] / 2;
                    nextMap[N-1][j][0] = nextMap[N-1][j][0] / 2;
                }
                
                /*// 기존 맵으로 정보를 이동
                for(int i = 0; i < N; i++) {
                    for(int j = 0; j < N; j++) {
                        map[i][j][0] = nextMap[i][j][0];
                        map[i][j][1] = nextMap[i][j][1];
                    }
                }*/
                
                /*//nextMap 초기화
                for(int i = 0; i < N; i++) {
                    for(int j = 0; j < N; j++) {
                        nextMap[i][j][0] = 0;
                        nextMap[i][j][1] = 0;
                    }
                }*/
            }
            
            /*int result = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(map[i][j][0] > 0) {
                        result = result + map[i][j][0]; 
                    }
                }
            }*/
            
            //System.out.println("#" + (t + 1) + " " + result);
            
            System.out.println();
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    System.out.printf("%d(%d)  ", nextMap[i][j][0], nextMap[i][j][1]);
                }
                System.out.println();
            }
            
            /*System.out.println();
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    System.out.printf("%d(%d)  ", map[i][j][0], map[i][j][1]);
                }
                System.out.println();
            }*/
            
        }
        
        sc.close();
    }

}