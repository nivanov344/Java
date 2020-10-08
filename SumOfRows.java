package school;

import java.util.Scanner;

public class SumOfRows {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int sum = 0;
		int biggestSum = 0;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		
		for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
            	System.out.println("Enter " + (row+1) + " row " + (column+1) + " column");
            	arr[row][column] = sc.nextInt();
        }       
           
    }
		sc.close(); 
		for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
            	System.out.print(arr[row][column]);
            	 
        }       
            System.out.println();
    }
		for (int row = 0; row < arr.length; row++) {
			sum = 0;
            for (int column = 0; column < arr[row].length; column++) {
            	sum += arr[row][column];
            	if(sum > biggestSum) {
            		biggestSum = sum;
            		index = row;
            	}
        }       
            
    }
		System.out.println((index + 1) + " row");
	}

}
