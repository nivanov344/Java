package school;

import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		
		int[] order = new int[10];
		int[] random = new int[10];
		int[] ind = new int[10];
		int index = 0;
		boolean isUnq = true;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0;i<10;i++) {
			System.out.println("Enter " + (i+1) + " integer");
			order [i] = sc.nextInt();
		}
		sc.close();
		for (int j = 0; j<10 ; j++) {
			index = rand.nextInt(10);
			isUnq = true;
			for (int k = 0; k<j; k++) {
				
				if (index == ind[k]) {
					isUnq = false;
				}
				if (isUnq) {
					ind [j] = index;
				}else {
					j--;
				}
			}
			
		}for (int m = 0; m<10;m++) {
			random[m] = order[ind[m]];
		}
		for (int p = 0; p<10; p++) {
			System.out.print(random[p] + " ");
		}
	}

}
