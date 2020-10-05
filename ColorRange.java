package school;

import java.util.Scanner;

public class ColorRange {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        String color = "_";
        double wavelength;
        System.out.println("Enter a color code");
        wavelength = scanner.nextDouble();
       
        scanner.close();
       
        if (wavelength >= 620 && wavelength <= 750) {
            color = "Red";
        } else if (wavelength >= 590) {
            color = "Orange";
        } else if (wavelength >= 570) {
            color = "Yellow";
        } else if (wavelength >= 495) {
            color = "Green";
        } else if (wavelength >= 450) {
            color = "Blue";
        } else if (wavelength >= 380) {
            color = "Violet";
        }
       
        if (color.equals("_")) { 
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        } else {
            System.out.println("The color is " + color + ".");
        }
    }

} 