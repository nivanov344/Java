package school;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Person person = new Person("Pesho Goshev", "Sofia", "pesho.gosho@gmail.com", 879372498);
		Student student = new Student("Pesho Goshev", "Sofia", "pesho.gosho@gmail.com", 879372498, "junior");
		Employee employee = new Employee("Pesho Goshev", "Sofia", "pesho.gosho@gmail.com", 879372498, 135, 1200);
		Faculty faculty = new Faculty("Pesho Goshev", "Sofia", "pesho.gosho@gmail.com", 879372498, 135, 1200, 73, "Associate Professor");
		Staff staff = new Staff("Pesho Goshev", "Sofia", "pesho.gosho@gmail.com", 879372498, 135, 1200, "Instructor");
		System.out.print(person.toString() + student.toString() + employee.toString() + faculty.toString() + staff.toString());
	}

}
