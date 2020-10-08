package school;

import java.util.Random;

public class RandomArray {

   public static void main(String[] args) {

       int[] random = new int[20];
       Random rand = new Random();
       for (int i = 0; i<19; i++){
           random[i] = rand.nextInt(99);
           System.out.print(random[i] + " ");
       }
       
   }

} 
