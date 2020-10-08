package school;

import java.util.Scanner;

public class Defazirane {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 integers");
		for(int i = 0;i<10;i++) {
			System.out.println("Enter " + (i+1) + " integers");
			arr [i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int j = 0;j<10;j++) {
			if (j == 9) {
				arr2[j] = arr[0];
			}else {
				arr2[j] = arr[j+1];
			}
		}
		for (int p = 0; p<10; p++) {
			System.out.print(arr2[p] + " ");
		}
	}

}
