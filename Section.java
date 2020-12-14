package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Section {
	private String sectionName;
	private Product[] products;
	
	
	public Section(String sectionName) {
		this.sectionName = sectionName;
		Scanner sc = new Scanner(System.in);
		int numberOfProducts = -1;
		System.out.println("Enter the number of products in this section.");
		
		while (true)
			try {
			
				numberOfProducts = sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
			}
		
		Product[] temp = new Product[numberOfProducts];
		
		for(int i = 0; i < numberOfProducts; i++) {
			System.out.println("Enter the name of the product.");
			String name = sc.next();
			System.out.println("Enter the item number of the product.");
			int itemNumber = sc.nextInt();
			System.out.println("Enter the price of the product.");
			double price = sc.nextDouble();
			System.out.println("Enter the quantity of the product.");
			int quantity = sc.nextInt();
			
			temp[i] = new Product(name, itemNumber, price, quantity);
		}
		products = temp;
	}
	
	
	public String getSectionName() {
		return sectionName;
	}
	
	
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	
	
	public Product[] getProducts() {
		return products;
	}
	
	
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	
	public String toString() {
		String str = "\nSection  : " + sectionName
					+"\nProducts : ";
		
		for (int i = 0; i < products.length; i++) {
			
			str += " " + products[i].toString();
			
		}
		
		return str;
		
	}
	
}
