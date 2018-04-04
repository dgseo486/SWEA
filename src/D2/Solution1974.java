package D2;


import java.util.Arrays;
import java.util.Scanner;

public class Solution1974 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int result[]=new int[T];
		Arrays.fill(result, 1);
		int arr[][]=new int[9][9];
		for(int tc=0; tc<T; tc++) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			//가로 행 검사
			for(int i=0; i<9; i++) {
				int check[]=new int[9];
				Arrays.fill(check, 0);
				for(int j=0; j<9; j++) {
					if(arr[i][j]==1) {
						check[0]++;
					}else if(arr[i][j]==2) {
						check[1]++;
					}else if(arr[i][j]==3) {
						check[2]++;
					}else if(arr[i][j]==4) {
						check[3]++;
					}else if(arr[i][j]==5) {
						check[4]++;
					}else if(arr[i][j]==6) {
						check[5]++;
					}else if(arr[i][j]==7) {
						check[6]++;
					}else if(arr[i][j]==8) {
						check[7]++;
					}else if(arr[i][j]==9) {
						check[8]++;
					}
				}
				for(int k=0; k<9; k++) {
					if(check[k]==0 || check[k]>=2) {
						result[tc]=0;
					}
				}
			}
			//세로 열 검사
			for(int i=0; i<9; i++) {
				int check[]=new int[9];
				Arrays.fill(check, 0);
				for(int j=0; j<9; j++) {
					if(arr[j][i]==1) {
						check[0]++;
					}else if(arr[j][i]==2) {
						check[1]++;
					}else if(arr[j][i]==3) {
						check[2]++;
					}else if(arr[j][i]==4) {
						check[3]++;
					}else if(arr[j][i]==5) {
						check[4]++;
					}else if(arr[j][i]==6) {
						check[5]++;
					}else if(arr[j][i]==7) {
						check[6]++;
					}else if(arr[j][i]==8) {
						check[7]++;
					}else if(arr[j][i]==9) {
						check[8]++;
					}
				}
				for(int k=0; k<9; k++) {
					if(check[k]==0 || check[k]>=2) {
						result[tc]=0;
					}
				}
			}
			//배열 단위 검사
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					int check[]=new int[9];
					Arrays.fill(check, 0);
					for(int k=0; k<3; k++) {
						for(int l=0; l<3; l++) {
							if(arr[(i*3)+k][(j*3)+l]==1) {
								check[0]++;
							}else if(arr[(i*3)+k][(j*3)+l]==2) {
								check[1]++;
							}else if(arr[(i*3)+k][(j*3)+l]==3) {
								check[2]++;
							}else if(arr[(i*3)+k][(j*3)+l]==4) {
								check[3]++;
							}else if(arr[(i*3)+k][(j*3)+l]==5) {
								check[4]++;
							}else if(arr[(i*3)+k][(j*3)+l]==6) {
								check[5]++;
							}else if(arr[(i*3)+k][(j*3)+l]==7) {
								check[6]++;
							}else if(arr[(i*3)+k][(j*3)+l]==8) {
								check[7]++;
							}else if(arr[(i*3)+k][(j*3)+l]==9) {
								check[8]++;
							}
						}
					}
					for(int k=0; k<9; k++) {
						if(check[k]==0 || check[k]>=2) {
							result[tc]=0;
						}
					}
				}
		
			}
		}		
		for(int i=0; i<T; i++) {
			System.out.println("#"+(i+1)+" "+result[i]);
		}
	}
}