package project;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Supermarket {
	
	private String name;
	private String adress;
	private Employee[] employees;
	private Section[] sections;
	
	
	public Supermarket(String name, String adress) {
		this.name = name;
		this.adress = adress;
		Scanner sc = new Scanner(System.in);
		int numberOfSections = -1;
		int numberOfEmployees = -1;
		System.out.println("Enter the number of sections.");
		
		while (true) {
			try {
				numberOfSections = sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
			}
		}
		
		String sectionName;
		Section[] temp1 = new Section[numberOfSections];
		for(int i = 0; i < numberOfSections;++i) {
			System.out.println("Enter the name of the section.");
			sectionName = sc.next();
			temp1[i] = new Section(sectionName);
		}
		System.out.println("Enter the number of employees.");
		
		while (true) {
			try {
				numberOfEmployees = sc.nextInt();
				break;
			}catch (InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
			}
		}
		Employee[] temp2 = new Employee[numberOfEmployees];
		for(int j = 0; j < numberOfEmployees;j++) {
			System.out.println("Enter the name of the employee.");
			String employeeName = sc.next();
			System.out.println("Enter the position of the employee.");
			String position = sc.next();
			System.out.println("Enter the salary of the employee.");
			double salary = sc.nextDouble();
			
			temp2[j] = new Employee(employeeName, position, salary);
		}
		sections = temp1;
		employees = temp2;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAdress() {
		return adress;
	}
	
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	public String toString() {
		String str = "\nName : " + name + "\nAdress : " + adress;
		for (int i = 0; i < employees.length; i++) {
			str += employees[i].toString();
		}
		for (int j = 0; j < sections.length; j++) {
			str += sections[j].toString();
		}
		
		return str;
	}
	
	
}
