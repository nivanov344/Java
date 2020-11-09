package school;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
	    
	    Student[] students = new Student[5];
	    Scanner scGrade = new Scanner(System.in);
	    Scanner scName = new Scanner(System.in);
	    for (int i=0;i<5;++i) {

	      String name = scName.nextLine();
	      double grade = scGrade.nextDouble();

	      students[i] = new Student(name, grade);

	    }

	    for (Student student : students[0].ret_schship(students)) {

	      System.out.println(student.name);

	    }

	 }
	
}


