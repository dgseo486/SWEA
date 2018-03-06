package SWtest;

import java.util.Scanner;

public class Solution2105 { // 디저트 카페

	static int[][] map = new int[21][21];
	static boolean[][] visit;
	static boolean[] check;
	static int startX = 0, startY = 0;
	static int[][] dir = { { 1, 1 }, { -1, 1 }, { -1, -1 }, { 1, -1 } }; // 우하, 좌하, 좌상, 우상
	static int maxDessert = -1;
	static int N = 0;
	
	public static void dfs(int y, int x, int depth, int direction, int count) {
		
		for (int i = 0; i < 4; i++) {
			int nextX = x + dir[i][0];
			int nextY = y + dir[i][1];
			
			if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
				if(nextX == startX && nextY == startY && depth == 4) {
					if(count > maxDessert) {
						maxDessert = count;
					}
					return;
				}
				
				int nextDst = map[nextY][nextX];
				if (visit[nextX][nextY] == false && check[nextDst] == false) {
					visit[nextX][nextY] = true;
					check[nextDst] = true;
					
					dfs(nextX, nextY, depth + 1, i, count + 1);
					
					visit[nextX][nextY] = false;
					check[nextDst] = false;
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
			visit = new boolean[21][21];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					startX = j;
					startY = i;
					
					int nowDst=map[i][j];
					check[nowDst]=true;
					visit[i][j]=true;
					
					dfs(i, j, 0, 0, 1);
					
					check[nowDst]=false;
					visit[i][j]=false;
					
				}
			}
			
			System.out.println("#" + (t + 1) + " " + maxDessert);
		}
		sc.close();
	}

}
