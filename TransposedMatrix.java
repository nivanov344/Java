package school;

import java.util.Random;

public class TransposedMatrix {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		int rows = rand.nextInt(30);
		int columns = rand.nextInt(30);
		int[][] arr = new int [rows] [columns];
		for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
            	arr[row][column] = rand.nextInt(99);
        }       
           
    }
		
		for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
            	System.out.print(arr[row][column]);
            	 
        }       
            System.out.println();
    }
		System.out.println();
		System.out.println();
		for (int column = 0; column < arr[1].length; column++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[row][column] + " ");
			}
			System.out.println();
		}

	}

}
