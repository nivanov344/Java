package school;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String word1, word2, newWord1 = "", newWord2 = "";
        int first = 0, second = 0;

        
        System.out.println("Enter the first word.");
        word1 = scanner.next();
        System.out.println("Enter the second word.");
        word2 = scanner.next();
        
        scanner.close();
        
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        
        for (int i = 0; i<first; i++){
            if ((int)word1.charAt(i)>= 65 && (int)word1.charAt(i) <= 90 ){
                newWord1 = newWord1 + word1.charAt(i);
            }
            if ((int)word2.charAt(i)>= 65 && (int)word2.charAt(i) <= 90 ){
                newWord2 = newWord2 + word2.charAt(i);
            }
        }
        first =newWord1.length();
        second = newWord2.length();
        if (first == second){

           char dumi4ka1 [] = newWord1.toCharArray(); 
           char dumi4ka2 [] = newWord2.toCharArray();
           Arrays.sort(dumi4ka1);
           Arrays.sort(dumi4ka2);
           String str1 = String.valueOf(dumi4ka1);
           String str2 = String.valueOf(dumi4ka2);
           if (str1.equals(str2)) {
        	   System.out.println("The two words are anagrams.");
           }else {
        	   System.out.println("The two words are not anagrams.");
           }
        }else {
        	
            System.out.println("Enter words with equal lengths!");
        
        }
        
        
    }

} 