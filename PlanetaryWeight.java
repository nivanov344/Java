package school;

import java.util.Scanner;

public class PlanetaryWeight {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your weight in kg:");
        double weight = sc.nextDouble();
        System.out.println("Enter planet name:");
        String planet = sc.next();
        double c = 0;
       
        switch (planet) {
           
        case "Mercury":
            c = 0.38; break;
        case "Venus":
            c = 0.91; break;
        case "Mars":
            c = 0.38; break;
        case "Jupiter":
            c = 2.36; break;
        case "Saturn":
            c = 0.92; break;
        case "Uranus":
            c = 0.89; break;
        case "Neptune":
            c = 1.13; break;
        default:
            System.out.println("There is no value of G");
       
        }
       
        sc.close();
       
        System.out.println(weight * c);
       
       
    }

}