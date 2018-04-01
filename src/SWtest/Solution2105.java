package SWtest;

import java.util.Scanner;

public class Solution2105 { // 디저트카페

    static int[][] map = new int[20][20];
    static boolean[] check = new boolean[101];
    static int startI = 0;
    static int startJ = 0;
    static int N = 0;
    static int maxDessert;
    static int[][] dir = { { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, 1 } };

    static void init() {
        for (int i = 0; i < 101; i++) {
            check[i] = false;
        }
    }

    static void dfs(int i, int j, int depth, int direction) {
        if (startI == i && startJ == j && direction > 2) {
            if (maxDessert < depth) {
                maxDessert = depth;
            }
            return;
        }

        check[map[i][j]] = true;

        int nextI = i + dir[direction][0];
        int nextJ = j + dir[direction][1];
        if (nextI < 0 || nextI >= N || nextJ < 0 || nextJ >= N) {
            return;
        }
        
        
        if (startI == nextI && startJ == nextJ && direction > 2) {
            dfs(nextI, nextJ, depth + 1, 3);
            check[map[nextI][nextJ]] = false;
        } else if (direction == 0 && check[map[nextI][nextJ]] == false) {
            dfs(nextI, nextJ, depth + 1, 0);
            check[map[nextI][nextJ]] = false;
            dfs(nextI, nextJ, depth + 1, 1);
            check[map[nextI][nextJ]] = false;
        } else if (direction == 1 && check[map[nextI][nextJ]] == false) {
            dfs(nextI, nextJ, depth + 1, 1);
            check[map[nextI][nextJ]] = false;
            dfs(nextI, nextJ, depth + 1, 2);
            check[map[nextI][nextJ]] = false;
        } else if (direction == 2 && check[map[nextI][nextJ]] == false) {
            dfs(nextI, nextJ, depth + 1, 2);
            check[map[nextI][nextJ]] = false;
            dfs(nextI, nextJ, depth + 1, 3);
            check[map[nextI][nextJ]] = false;
        } else if (direction == 3 && check[map[nextI][nextJ]] == false) {
            dfs(nextI, nextJ, depth + 1, 3);
            check[map[nextI][nextJ]] = false;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            N = sc.nextInt();
            maxDessert = -1;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    startI = i;
                    startJ = j;
                    dfs(i, j, 0, 0);
                    init();
                }
            }
            
            System.out.println("#" + (t + 1) + " " + maxDessert);
        }
        sc.close();
    }
}