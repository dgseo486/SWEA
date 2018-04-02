package SWtest;

import java.util.Scanner;

public class Solution2105 { // 디저트카페

    static int[][] map;
    static boolean[][] visited;
    static boolean[] check;
    static int startI = 0;
    static int startJ = 0;
    static int N = 0;
    static int maxDessert;
    static int[][] dir = { { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, 1 } };

    static void dfs(int i, int j, int depth, int direction) {

        int nextI = i + dir[direction][0];
        int nextJ = j + dir[direction][1];

        if (nextI < 0 || nextI >= N || nextJ < 0 || nextJ >= N) {
            return;
        }

        if (startI == nextI && startJ == nextJ && direction > 2) {
            if (maxDessert < depth) {
                maxDessert = depth;
            }
            return;
        }

        if (check[map[nextI][nextJ]]) {
            return;
        }
        
        if(visited[nextI][nextJ]) {
            return;
        }

        check[map[nextI][nextJ]] = true;
        visited[nextI][nextJ] = true;
        
        if (direction == 0) {
            dfs(nextI, nextJ, depth + 1, 0);
            dfs(nextI, nextJ, depth + 1, 1);
        } else if (direction == 1) {
            dfs(nextI, nextJ, depth + 1, 1);
            dfs(nextI, nextJ, depth + 1, 2);
        } else if (direction == 2) {
            dfs(nextI, nextJ, depth + 1, 2);
            dfs(nextI, nextJ, depth + 1, 3);
        } else if (direction == 3) {
            dfs(nextI, nextJ, depth + 1, 3);
        }
        
        check[map[nextI][nextJ]] = false;
        visited[nextI][nextJ] = false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            N = sc.nextInt();
            map = new int[N][N];
            visited = new boolean[N][N];
            check = new boolean[101];
            maxDessert = -1;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    check[map[i][j]] = true;
                    visited[i][j] = true;
                    startI = i;
                    startJ = j;
                    dfs(i, j, 1, 0);
                    check[map[i][j]] = false;
                    visited[i][j] = false;
                }
            }
            System.out.println("#" + (t + 1) + " " + maxDessert);
        }
        sc.close();
    }
}