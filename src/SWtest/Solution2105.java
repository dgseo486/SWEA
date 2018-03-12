package SWtest;

import java.util.Scanner;

public class Solution2105 { // 디저트 카페

	static int[][] map = new int[20][20];
	static boolean[] check;
	static int startI = 0, startJ = 0, N = 0, maxDessert;
	static int[][] dir = { { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, 1 } }; // 우하, 좌하, 좌상, 우상

	static void init() {
		for (int i = 0; i < 101; i++) {
			check[i] = false;
		}
	}

	public static void dfs(int i, int j, int depth, int direction) {
		
		for (int d = 0; d < 4; d++) {
			int nextI = i + dir[d][0];
			int nextJ = j + dir[d][1];
			
			if(nextI >= 0 && nextI < N && nextJ >= 0 && nextJ < N) {
				if(nextI == startI && nextJ == startJ && depth > 3) {
					if(depth > maxDessert) {
						maxDessert = depth;
					}
					return;
				}
				int nextDst = map[nextI][nextJ];
				if (check[nextDst] == false) {
					check[nextDst] = true;
					if(d!=direction) {
						dfs(nextI, nextJ, depth + 1, d);
					}else {
						dfs(nextI, nextJ, depth, d);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			N = sc.nextInt();
			check = new boolean[101];
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
				}
			}
			System.out.println("#" + (t + 1) + " " + maxDessert);
		}
		sc.close();
	}
}