package SWtest;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[30];
		int count = 1;
		while (true) {
			int randNumber = random.nextInt(30);
			if (randNumber > 0 && check[randNumber] == false) {
				check[randNumber] = true;
				System.out.println(count + " : " + randNumber);
				count++;
			}

			if (count == 30) {
				System.out.println("**************ÃßÃ· Á¾·á**************");
				break;
			}
		}
		sc.close();
	}

}
