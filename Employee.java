package project;

import java.util.Date;

public class Employee {
	private String name;
	private String position;
	private double salary;
	private Date dateHired;
	
	
	public Employee(String name, String position, double salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
		dateHired = new Date();
	}
	
	
	public String getPosition() {
		return position;
	}
	
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public Date getDateHired() {
		return dateHired;
	}
	
	
	public String toString() {
		return "\nName	   : " + name
			 + "\nPosition   : " + position
			 + "\nSalary	   : " + salary
			 + "\nDate hired : " + dateHired;
	}
}
