package school;

import java.util.Scanner;

public class tuition {

    public static void main(String[] args) {
        
        double tuition = 0;
        double increase = 0;
        double finalSum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the tuition for the first year?");
        tuition = scanner.nextDouble();
        System.out.println("What is the annual increase?");
        increase = scanner.nextDouble();
        scanner.close();
        
        for (int i = 1;i < 10; i++){
            
            tuition = tuition * (1 + increase);
            
        }
        
        System.out.println("The tuition in 10 years will be " + (int)tuition + " dollars.");
        for(int j = 0;j < 3; j++) {
        	finalSum +=tuition;
        	tuition = tuition * (1 + increase);
        }
        System.out.println("The total sum for four years of tuition in 10 years will be " + (int)finalSum + " dollars.");
        
    }

}