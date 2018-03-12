package SWtest;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean[] arr = new boolean[30];
		String[] nameArr = new String[30];
		
		for(int i = 1; i <= 29; i++) {
			nameArr[i] = sc.next();
		}
		
		int count = 1;
		boolean flag = true;
		while(flag) {
			int randNumber = random.nextInt(30);
			if(randNumber > 0 && arr[randNumber] == false) {
				arr[randNumber] = true;
				System.out.println(nameArr[randNumber] + " : " + randNumber);
				count++;
			}
			if(count == 29) {
				flag = false;
				System.out.println("ÃßÃ· Á¾·á");
			}
		}
		sc.close();
	}

}
