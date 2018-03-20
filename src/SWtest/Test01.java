package SWtest;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("πÿ∫Ø¿« ±Ê¿Ã? ");
		int len = sc.nextInt();
		
		int starLen = 1;
		while(starLen <= len) {
			int count = 1;
			int spaceLen = (len - starLen) / 2;
			while(count <= spaceLen) {
				System.out.print(" ");
				count++;
			}
			count = 1;
			while(count <= starLen) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			starLen = starLen + 2;
		}
		
	}

}
