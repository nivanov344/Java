package school;

public class Student {

		  private String name;
		  private double grade;

		  public Student() {}

		  public Student(String newName, double newGrade) {

			newName = name;
		    newGrade = grade;

		  }

		  public boolean scholarship(Student st) {

		    if (st.grade >= 5.5)
		      return true;

		    return false;

		  }

		  Student[] ret_schship(Student[] students) {

		    Student[] ret = new Student[5];
		    int index = 0;

		    for (Student student : students) {

		      if (scholarship(student)) {

		        ret[index] = student;
		        index++;

		      }

		    }

		    return ret;

		  }

		}

