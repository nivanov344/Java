package school;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	       
        double height = 0, width = 0, length = 0, area = 0;
        int oneLiter = 0, fiveLiter = 0;
        System.out.println("What is the length of the room");
        length = scanner.nextDouble();
        System.out.println("What is the width of the room");
        width = scanner.nextDouble();
        System.out.println("What is the height of the room");
        height = scanner.nextDouble();
        scanner.close();
        
        area = 2*(length*height) + 2*(width*height) + length*width;
        if ( area % 140 == 0 || area % 140 > 90) {
        	fiveLiter = (int) Math.ceil(area/140);
        }else {
        	fiveLiter = (int) area/140;
        	oneLiter = (int) Math.ceil((area % 140)/30);
        }
    
	System.out.println("One liter - " + oneLiter + "\nFive liter - " + fiveLiter);
	
	}



}


